package com.indyfit.indyfitcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView calculatorView;

    String s1[], s2[];
    int images[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img10, R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14
            , R.drawable.img15, R.drawable.img16};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorView = findViewById(R.id.calculatorView);

        s1 = getResources().getStringArray(R.array.calculator_names);
        s2 = getResources().getStringArray(R.array.calculator_desc);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        calculatorView.setAdapter(myAdapter);
        calculatorView.setLayoutManager(new LinearLayoutManager(this));
    }
}