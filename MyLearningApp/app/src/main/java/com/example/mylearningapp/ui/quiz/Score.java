package com.example.mylearningapp.ui.quiz;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mylearningapp.R;

public class Score extends AppCompatActivity {

    private TextView scoreTextView;
    private TextView totalTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_score);

        // Retrieve values from the intent
        int score = getIntent().getIntExtra("Score", 0);
        int total = getIntent().getIntExtra("total", 0);

        // Initialize TextViews
        scoreTextView = findViewById(R.id.score_text);
        totalTextView = findViewById(R.id.total_text);

        // Display values in TextViews
        scoreTextView.setText("Score: " + score);
        totalTextView.setText("Total: " + total);
    }
}