package com.example.mylearningapp.ui.code;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylearningapp.R;

public class CodeCategory extends AppCompatActivity {
    ListView programs;
    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_code_category);
        loadCategory();

        programs = findViewById(R.id.programs);

        customAdapter adapter = new customAdapter();
        programs.setAdapter(adapter);

        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CodeCategory.this, CodeActivity.class);
                intent.putExtra("codeCategory", getIntent().getStringExtra("codeCategory"));
                intent.putExtra("itemIndex", i);
                startActivity(intent);
            }
        });
    }

    public void loadCategory() {
        final String chap1[] = {"1.Find a peak element which is not smaller than its neighbors","2.Write a program to reverse the array", "3.Find the minimum and maximum element in an array","4.Write a program to sort the given array", "5.Find the Kth largest and Kth smallest number in an array"};
        final String chap2[] = {"1.Write a program to cyclically rotate an array by one", "2.Find the missing integer", "3.Count Pairs with the given sum"};
        final String chap3[] = {"1.Find duplicates in an array", "2.Sort an Array using the Quicksort algorithm","3.Find common elements in three sorted arrays"};
        final String chap4[] = {"1.Find the first repeating element in an array of integers", "2.Find the first non-repeating element in a given array of integers","3.Find the two non-repeating elements in an Array of repeating elements"};
        final String chap5[] = {"1.Subarrays with equal 1s and 0s", "2.Rearrange the array in alternating positive and negative items","3.Rearrange positive and negative numbers in O(n) time and O(1) extra space"};
        final String chap6[] = {"1.Find if there is any subarray with a sum equal to zero", "2.Find the Largest sum contiguous Subarray", "3.Find the factorial of a large number"};
        final String chap7[] = {"1.Find Maximum Product Subarray","2.Maximum length subarray with LCM equal to product","3.Find the sum of product of power and LCM for N operations"};
        final String chap8[] = {"1.Find the longest consecutive subsequence", "2.Find the minimum element in a rotated and sorted array","3.Circularly Sorted Array (Sorted and Rotated Array)"};

        String category = getIntent().getStringExtra("codeCategory");
        if ("chapter1".equals(category)) list = chap1;
        if ("chapter2".equals(category)) list = chap2;
        if ("chapter3".equals(category)) list = chap3;
        if ("chapter4".equals(category)) list = chap4;
        if ("chapter5".equals(category)) list = chap5;
        if ("chapter6".equals(category)) list = chap6;
        if ("chapter7".equals(category)) list = chap7;
        if ("chapter8".equals(category)) list = chap8;
    }

    class customAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            if (list != null) return list.length;
            else return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.code_category_item_layout, null);

            TextView textView = view.findViewById(R.id.code_title);
            textView.setText(list[position]);
            return view;
        }
    }
}