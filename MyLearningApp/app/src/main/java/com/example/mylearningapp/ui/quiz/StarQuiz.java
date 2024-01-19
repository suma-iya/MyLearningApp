package com.example.mylearningapp.ui.quiz;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mylearningapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class StarQuiz extends AppCompatActivity {

    private TextView questiontxt, indicator;
    private LinearLayout container;
    private Button next_btn, share_btn;

    private int score = 0;
    private int position = 0;
    private int count = 0;

    DatabaseReference reference;

    private List<QuestionData> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_star_quiz);

        questiontxt = findViewById(R.id.question);
        indicator = findViewById(R.id.indicator);
        container = findViewById(R.id.linear_layout);
        next_btn = findViewById(R.id.next_button2);
        share_btn = findViewById(R.id.share_button2);

        list = new ArrayList<>();
        reference = FirebaseDatabase.getInstance().getReference();

        reference.child("Questions").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        String question = snapshot.child("question").getValue(String.class);
                        String option1 = snapshot.child("option1").getValue(String.class);
                        String option2 = snapshot.child("option2").getValue(String.class);
                        String option3 = snapshot.child("option3").getValue(String.class);
                        String option4 = snapshot.child("option4").getValue(String.class);
                        String answer = snapshot.child("answer").getValue(String.class);

                        list.add(new QuestionData(option1, option2, option3, option4, question, answer));
                    }
                } else {
                    Toast.makeText(StarQuiz.this, "No Data Found", Toast.LENGTH_SHORT).show();
                }
                if (list.size() > 0) {
                    loadQuestion(questiontxt, 0, list.get(position).getQuestion());
                    updateIndicator();

                    for (int i = 0; i < 4; ++i) {
                        container.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                checkAnswer((Button) v);
                            }
                        });
                    }

                    next_btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            next_btn.setEnabled(false);
                            next_btn.setAlpha(0.7f);
                            enabled(true);
                            position++;

                            if (position == list.size()) {
                                Intent intent = new Intent(StarQuiz.this, Score.class);
                                intent.putExtra("Score", score);
                                intent.putExtra("total", list.size());
                                startActivity(intent);
                                finish();
                                return;
                            }
                            count = 0;
                            loadQuestion(questiontxt, 0, list.get(position).getQuestion());
                            updateIndicator();
                        }
                    });

                    share_btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

//
//                            Intent shareIntent = new Intent();
//                            shareIntent.setAction(Intent.ACTION_SEND);
//                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this app: [Codeverse]");
//                            shareIntent.setType("text/plain");
//
//                            Intent chooser = Intent.createChooser(shareIntent, "Share via");
                            String body = "+" + list.get(position).getQuestion() + "\n" +
                                    "(a)" + list.get(position).getOption1() + "\n" +
                                    "(b)" + list.get(position).getOption2() + "\n" +
                                    "(c)" + list.get(position).getOption3() + "\n" +
                                    "(d)" + list.get(position).getOption4();
                            Intent intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("Text/Plain");
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Learning App");
                            intent.putExtra(Intent.EXTRA_TEXT, body);
                            startActivity(Intent.createChooser(intent, "Share via"));
                        }
                    });

                } else {
                    Toast.makeText(StarQuiz.this, "No Data Found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(StarQuiz.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void checkAnswer(Button selectedOption) {
        enabled(false);
        next_btn.setEnabled(true);
        next_btn.setAlpha(1);

        if (selectedOption.getText().toString().equals(list.get(position).getAnswer())) {
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#00FF00")));
            score++;
        } else {
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF0000")));
            Button correctAnswer = container.findViewWithTag(list.get(position).getAnswer());
            correctAnswer.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#00FF00")));
        }
    }

    private void enabled(Boolean enable) {
        for (int i = 0; i < 4; ++i) {
            container.getChildAt(i).setEnabled(enable);
            if (enable) {
                container.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
            }
        }
    }

    private void loadQuestion(View view, int value, String data) {
        for (int x = 0; x < 4; x++) {
            container.getChildAt(x).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
        }
        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animation) {
                        if (value == 0 && count < 4) {
                            String option = "";
                            if (count == 0)
                                option = list.get(position).getOption1();
                            else if (count == 1)
                                option = list.get(position).getOption2();
                            else if (count == 2)
                                option = list.get(position).getOption3();
                            else if (count == 3) {
                                option = list.get(position).getOption4();
                            }
                            loadQuestion(container.getChildAt(count), 0, option);
                            count++;
                        }
                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animation) {
                        if (value == 0) {
                            try {
                                ((TextView) view).setText(data);
                            } catch (ClassCastException e) {
                                ((Button) view).setText(data);
                            }
                        }
                        view.setTag(data);
                        if (value == 0) {
                            loadQuestion(view, 1, data);
                        }
                    }

                    @Override
                    public void onAnimationCancel(@NonNull Animator animation) {
                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animation) {
                    }
                });
    }

    private void updateIndicator() {
        indicator.setText((position + 1) + "/" + list.size()); // Update the indicator text
    }
}
