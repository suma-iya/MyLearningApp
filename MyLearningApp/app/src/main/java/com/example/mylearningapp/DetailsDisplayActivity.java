// DetailsDisplayActivity.java

package com.example.mylearningapp;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsDisplayActivity extends AppCompatActivity {

    private TextView detailsTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_details_display);

        detailsTextView = findViewById(R.id.detailsTextView);

        // Retrieve details from intent
        String detailsValue = getIntent().getStringExtra("detailsValue");

        // Display details in the TextView
        detailsTextView.setText(detailsValue);
    }
}
