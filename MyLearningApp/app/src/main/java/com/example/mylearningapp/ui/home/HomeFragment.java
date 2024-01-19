package com.example.mylearningapp.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.mylearningapp.R;
import com.example.mylearningapp.chaptertopics.TopicActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }
    CardView heading1,heading2, heading3,heading4;
    ImageView image1, image2, image3,image4;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        heading1 = view.findViewById(R.id.heading1);
        heading2 = view.findViewById(R.id.heading2);
        heading3 = view.findViewById(R.id.heading3);
        heading4= view.findViewById(R.id.heading4);

        image1 = view.findViewById(R.id.image1);
        image2 = view.findViewById(R.id.image2);
        image3 = view.findViewById(R.id.image3);
        image4= view.findViewById(R.id.image4);

        loadimage();

        heading1.setOnClickListener(this);
        heading2.setOnClickListener(this);
        heading3.setOnClickListener(this);
        heading4.setOnClickListener(this);

        return view;
    }

    private void loadimage() {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%2010.28.02%20PM.jpeg?alt=media&token=343b416b-6736-4971-887a-410e71c7e0af")
                .into(image2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%209.49.44%20PM.jpeg?alt=media&token=9f1d4969-1e3c-47ad-b6f0-59d11e2f3835")
                .into(image4);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%209.49.51%20PM.jpeg?alt=media&token=c67c8590-fa56-4e41-b119-2f7c95af1f61")
                .into(image3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%2010.25.28%20PM.jpeg?alt=media&token=3c69b479-a065-4b9f-a933-84d0067def6b")
                .into(image1);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), TopicActivity.class);
        int id = view.getId();
        if (id == R.id.heading1) {
            intent.putExtra("chapterName", "Heading1");
            startActivity(intent);
        } else if (id == R.id.heading2) {
            intent.putExtra("chapterName", "Heading2");
            startActivity(intent);
        } else if (id == R.id.heading3) {
            intent.putExtra("chapterName", "Heading3");
            startActivity(intent);
        }else if (id == R.id.heading4) {
            intent.putExtra("chapterName", "Heading4");
            startActivity(intent);

        }
    }}