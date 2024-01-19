package com.example.mylearningapp.ui.code;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.mylearningapp.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CodeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CodeFragment extends Fragment  implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CodeFragment() {
        // Required empty public constructor
    }
    CircleImageView image1,image2,image3,image4,image5,image6,image7,image8;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CodeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CodeFragment newInstance(String param1, String param2) {
        CodeFragment fragment = new CodeFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_code, container, false);
        image1 = view.findViewById(R.id.chapter1);
        image2 = view.findViewById(R.id.chapter2);
        image3 = view.findViewById(R.id.chapter3);
        image4 = view.findViewById(R.id.chapter4);
        image5 = view.findViewById(R.id.chapter5);
        image6 = view.findViewById(R.id.chapter6);
        image7 = view.findViewById(R.id.chapter7);
        image8 = view.findViewById(R.id.chapter8);

        loadimage();
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);

        return view;
    }

    private void loadimage() {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%2010.13.33%20PM.jpeg?alt=media&token=6caa0089-42aa-4c55-8fc3-fbc44e11555e")
                .into(image1);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/png-clipart-c-logo-the-c-programming-language-computer-icons-computer-programming-source-code-programming-miscellaneous-template.png?alt=media&token=79714d39-5763-4653-bcb8-93fb43c06382")
                .into(image2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%2010.27.02%20PM.jpeg?alt=media&token=d50e8db2-3806-4984-aad6-8536e294d870")
                .into(image3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/programming-icon-2048x2048-u5f5hc6b.png?alt=media&token=ec654a59-9e62-4502-bc4b-8ecc60d34b4f")
                .into(image4);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/WhatsApp%20Image%202023-11-03%20at%2010.13.11%20PM.jpeg?alt=media&token=34b493cb-6218-4e17-8630-d209681260a8")
                .into(image5);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/images.jpeg?alt=media&token=3c3f3be8-4c68-4c6a-9843-87a27d115815")
                .into(image6);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/Google_Summer_of_Code_sun_logo_2022.svg.png?alt=media&token=7c3fcec0-1c96-4744-9f13-3a4f7499633b")
                .into(image7);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/codeverse-d4633.appspot.com/o/code.png?alt=media&token=4d226d29-2e45-4c85-b3d9-16d3259b9d80")

                .into(image8);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), CodeCategory.class);
        if(view.getId()==R.id.chapter1){
            intent.putExtra("codeCategory", "chapter1");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter2){
            intent.putExtra("codeCategory", "chapter2");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter3){
            intent.putExtra("codeCategory", "chapter3");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter4){
            intent.putExtra("codeCategory", "chapter4");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter5){
            intent.putExtra("codeCategory", "chapter5");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter6){
            intent.putExtra("codeCategory", "chapter6");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter7){
            intent.putExtra("codeCategory", "chapter7");
            startActivity(intent);
        }else
        if(view.getId()==R.id.chapter8){
            intent.putExtra("codeCategory", "chapter8");
            startActivity(intent);
        }
    }
}