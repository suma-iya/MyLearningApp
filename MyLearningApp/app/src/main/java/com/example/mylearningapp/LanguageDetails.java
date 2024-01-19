// LanguageDetails.java

package com.example.mylearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LanguageDetails extends AppCompatActivity {

    private ListView detailsListView;
    private JSONObject languageDetailsObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_language_details);

        detailsListView = findViewById(R.id.detailsListView);

        String languageDetailsJson = getIntent().getStringExtra("languageDetails");

        try {
            languageDetailsObject = new JSONObject(languageDetailsJson);

            // Get the keys and show them in the ListView
            JSONArray keys = languageDetailsObject.names();
            if (keys != null) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getStringArrayFromJsonArray(keys));
                detailsListView.setAdapter(adapter);

                // Set an item click listener to handle item clicks
                detailsListView.setOnItemClickListener((parent, view, position, id) -> {
                    String selectedKey = (String) parent.getItemAtPosition(position);
                    showDetails(selectedKey);
                });
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String[] getStringArrayFromJsonArray(JSONArray jsonArray) throws JSONException {
        String[] strings = new String[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); i++) {
            strings[i] = jsonArray.getString(i);
        }
        return strings;
    }

    private void showDetails(String selectedKey) {
        // Get the value corresponding to the selected key
        try {
            String detailsValue = languageDetailsObject.getString(selectedKey);

            // Pass the details to another activity
            Intent intent = new Intent(this, DetailsDisplayActivity.class);
            intent.putExtra("detailsKey", selectedKey);
            intent.putExtra("detailsValue", detailsValue);
            startActivity(intent);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
