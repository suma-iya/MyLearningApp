package com.example.mylearningapp.chaptertopics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.mylearningapp.R;
import com.example.mylearningapp.chapter.five.HTML;
import com.example.mylearningapp.chapter.five.android;
import com.example.mylearningapp.chapter.four.Controlflow;
import com.example.mylearningapp.chapter.four.Inputooutput;
import com.example.mylearningapp.chapter.four.ObjectOriented;
import com.example.mylearningapp.chapter.four.Pdatatype;
import com.example.mylearningapp.chapter.four.Pexception;
import com.example.mylearningapp.chapter.four.Poperators;
import com.example.mylearningapp.chapter.four.Pvariable;
import com.example.mylearningapp.chapter.four.Pythonbas;
import com.example.mylearningapp.chapter.one.BasicSyntax;
import com.example.mylearningapp.chapter.one.Comments;
import com.example.mylearningapp.chapter.one.Data_types;
import com.example.mylearningapp.chapter.one.Input;
import com.example.mylearningapp.chapter.one.Introduction;
import com.example.mylearningapp.chapter.one.JAVA;
import com.example.mylearningapp.chapter.one.Uninitialized_Variable;
import com.example.mylearningapp.chapter.one.Variable_scope;
import com.example.mylearningapp.chapter.one.Variables;
import com.example.mylearningapp.chapter.three.CommentsInJava;
import com.example.mylearningapp.chapter.three.DataTy;
import com.example.mylearningapp.chapter.three.JavaBasic;
import com.example.mylearningapp.chapter.three.Javapro;
import com.example.mylearningapp.chapter.three.Keyword;
import com.example.mylearningapp.chapter.three.Loops;
import com.example.mylearningapp.chapter.three.Operatorsja;
import com.example.mylearningapp.chapter.three.Varjava;
import com.example.mylearningapp.chapter.two.Array;
import com.example.mylearningapp.chapter.two.Date;
import com.example.mylearningapp.chapter.two.JArrayBuffer;
import com.example.mylearningapp.chapter.two.Jatomics;
import com.example.mylearningapp.chapter.two.Jbigint;
import com.example.mylearningapp.chapter.two.Jerror;
import com.example.mylearningapp.chapter.two.php;
import com.example.mylearningapp.chapter.two.python;

public class TopicActivity extends AppCompatActivity {
    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String chapterName;
    TopicAdapter adapter;
    ImageView chapterImage;
    String arr[] = null;

    String chapter2[] = {"Introduction","Basic Syntax","Basic Input and Output","Comments","Data Types and Modifiers","Variables","Variable Scope","Uninitialized Variable"};
    String chapter1[] = {"Java Programming","Java Basic Syntax","Comments in Java","Data Types in Java","Variables in Java","Keywords in Java","Operators in Java","Loops in Java"};
    String chapter3[] = {"Python Basics","Input/Output","Python Data Types","Python Variables","Python Operators","Control Flow","Object Oriented Concepts","Exception Handling"};
    String chapter4[] = {"Array", "ArrayBuffer", "Atomics", "BigInt", "Date","Error"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_topic);

        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        chapterName = getIntent().getStringExtra("chapterName");
        chapterImage = findViewById(R.id.chapter_image);
        createAndOpen();
    }

    private void createAndOpen() {
        if(chapterName.equals("Heading1")) {
            arr = chapter1;
            chapterImage.setImageResource(R.drawable.pencil);

            getSupportActionBar().setTitle("JAVA");
        }
        else if(chapterName.equals("Heading2")) {
            arr = chapter2;
            chapterImage.setImageResource(R.drawable.pencil);

            getSupportActionBar().setTitle("C++");
        }
        else if(chapterName.equals("Heading3")) {
            arr = chapter3;
            chapterImage.setImageResource(R.drawable.pencil);
            getSupportActionBar().setTitle("Python");
        } else if(chapterName.equals("Heading4")) {
            arr = chapter4;
            chapterImage.setImageResource(R.drawable.pencil);
            getSupportActionBar().setTitle("JavaScript");
        }
        else{
            arr = null;
            chapterImage.setImageResource(R.drawable.pencil);
        }
        adapter = new TopicAdapter(arr,TopicActivity.this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               openActivity(arr[i]);
            }

            private void openActivity(String s) {
                if("JAVA".equals(s)) startActivity(new Intent(TopicActivity.this, JAVA.class));
                else if("PHP".equals(s)) startActivity(new Intent(TopicActivity.this, php.class));
                else if("Python".equals(s)) startActivity(new Intent(TopicActivity.this, python.class));
                else if("HTML".equals(s)) startActivity(new Intent(TopicActivity.this, HTML.class));
                else if("Android".equals(s)) startActivity(new Intent(TopicActivity.this, android.class));
                else if("Introduction".equals(s)) startActivity(new Intent(TopicActivity.this, Introduction.class));
                else if("Basic Syntax".equals(s)) startActivity(new Intent(TopicActivity.this, BasicSyntax.class));
                else if("Basic Input and Output".equals(s)) startActivity(new Intent(TopicActivity.this, Input.class));
                else if("Comments".equals(s)) startActivity(new Intent(TopicActivity.this, Comments.class));
                else if("Data Types and Modifiers".equals(s)) startActivity(new Intent(TopicActivity.this, Data_types.class));
                else if("Variables".equals(s)) startActivity(new Intent(TopicActivity.this, Variables.class));
                else if("Variable Scope".equals(s)) startActivity(new Intent(TopicActivity.this, Variable_scope.class));
                else if("Uninitialized Variable".equals(s)) startActivity(new Intent(TopicActivity.this, Uninitialized_Variable.class));
                else if("Python Basics".equals(s)) startActivity(new Intent(TopicActivity.this, Pythonbas.class));
                else if("Input/Output".equals(s)) startActivity(new Intent(TopicActivity.this, Inputooutput.class));
                else if("Python Data Types".equals(s)) startActivity(new Intent(TopicActivity.this, Pdatatype.class));
                else if("Python Operators".equals(s)) startActivity(new Intent(TopicActivity.this, Poperators.class));
                else if("Python Variables".equals(s)) startActivity(new Intent(TopicActivity.this, Pvariable.class));
                else if("Control Flow".equals(s)) startActivity(new Intent(TopicActivity.this, Controlflow.class));
                else if("Object Oriented Concepts".equals(s)) startActivity(new Intent(TopicActivity.this, ObjectOriented.class));
                else if("Exception Handling".equals(s)) startActivity(new Intent(TopicActivity.this, Pexception.class));
                else if("Java Programming".equals(s)) startActivity(new Intent(TopicActivity.this, Javapro.class));
                else if("Java Basic Syntax".equals(s)) startActivity(new Intent(TopicActivity.this, JavaBasic.class));
                else if("Comments in Java".equals(s)) startActivity(new Intent(TopicActivity.this, CommentsInJava.class));
                else if("Data Types in Java".equals(s)) startActivity(new Intent(TopicActivity.this, DataTy.class));
                else if("Variables in Java".equals(s)) startActivity(new Intent(TopicActivity.this, Varjava.class));
                else if("Keywords in Java".equals(s)) startActivity(new Intent(TopicActivity.this, Keyword.class));
                else if("Operators in Java".equals(s)) startActivity(new Intent(TopicActivity.this, Operatorsja.class));
                else if("Loops in Java".equals(s)) startActivity(new Intent(TopicActivity.this, Loops.class));
                else if("Array".equals(s)) startActivity(new Intent(TopicActivity.this, Array.class));
                else if("ArrayBuffer".equals(s)) startActivity(new Intent(TopicActivity.this, JArrayBuffer.class));
                else if("Atomics".equals(s)) startActivity(new Intent(TopicActivity.this, Jatomics.class));
                else if("BigInt".equals(s)) startActivity(new Intent(TopicActivity.this, Jbigint.class));
                else if("Date".equals(s)) startActivity(new Intent(TopicActivity.this, Date.class));
                else if("Error".equals(s)) startActivity(new Intent(TopicActivity.this, Jerror.class));
            }
        });

    }
}