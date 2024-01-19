package com.example.mylearningapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomLanguageAdapter extends ArrayAdapter<String> {

    private List<String> languageNames;
    private List<Integer> languageImages; // Resource IDs for language images

    public CustomLanguageAdapter(@NonNull Context context, int resource, @NonNull List<String> languageNames, List<Integer> languageImages) {
        super(context, resource, languageNames);
        this.languageNames = languageNames;
        this.languageImages = languageImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item_language, null);
        }

        TextView languageNameTextView = view.findViewById(R.id.languageName);
        ImageView languageImageView = view.findViewById(R.id.languageImage);

        languageNameTextView.setText(languageNames.get(position));
        languageImageView.setImageResource(languageImages.get(position));

        return view;
    }
}
