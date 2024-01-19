package com.example.mylearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonMain extends AppCompatActivity {

    private ListView languageListView;
    private ArrayList<String> languageNames = new ArrayList<>();
    private JSONArray codeVerseArray;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_json_main);

        languageListView = findViewById(R.id.languageListView);

        parseJson();

        languageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedLanguage = (String) parent.getItemAtPosition(position);
                showLanguageDetails(selectedLanguage);
            }
        });
    }

    private void parseJson() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "https://api.myjson.online/v1/records/b4ee4bcc-06a8-4f78-8371-5eeffc811027";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            codeVerseArray = response.getJSONObject("data").getJSONObject("data").getJSONArray("CodeVerse");

                            for (int i = 0; i < codeVerseArray.length(); i++) {
                                JSONArray languageArray = codeVerseArray.getJSONObject(i).getJSONArray("Language");

                                for (int j = 0; j < languageArray.length(); j++) {
                                    String languageName = languageArray.getJSONObject(j).getString("Name");
                                    languageNames.add(languageName);
                                }
                            }

                            List<Integer> languageImages = Arrays.asList(
                                    R.drawable.c__,
                                    R.drawable.py,
                                    R.drawable.java,
                                    R.drawable.ja
                            );

                            CustomLanguageAdapter adapter = new CustomLanguageAdapter(JsonMain.this, R.layout.list_item_language, languageNames, languageImages);
                            languageListView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle error
                    }
                });

        requestQueue.add(jsonObjectRequest);
    }

    private void showLanguageDetails(String selectedLanguage) {
        Intent intent = new Intent(this, LanguageDetails.class);

        try {
            for (int i = 0; i < codeVerseArray.length(); i++) {
                JSONArray languageArray = codeVerseArray.getJSONObject(i).getJSONArray("Language");

                for (int j = 0; j < languageArray.length(); j++) {
                    String languageName = languageArray.getJSONObject(j).getString("Name");
                    if (languageName.equals(selectedLanguage)) {
                        intent.putExtra("languageDetails", languageArray.getJSONObject(j).toString());
                        intent.putExtra("languageName", selectedLanguage);
                        startActivity(intent);
                        break;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
