package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        final List<MiwokModel> color = new ArrayList<>();
        color.add(new MiwokModel( "red", "wetetti", R.drawable.color_red));
        color.add(new MiwokModel("green","chokoki", R.drawable.color_green));
        color.add(new MiwokModel("brown","takaakki", R.drawable.color_brown));
        color.add(new MiwokModel("gray","toppopi", R.drawable.color_gray));
        color.add(new MiwokModel("black","kulilli",R.drawable.color_white));
        color.add(new MiwokModel("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        color.add(new MiwokModel("mustard yellow", "chiwiite",R.drawable.color_mustard_yellow));

        RecyclerView color_recyclerView = findViewById(R.id.recyckerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        color_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter=new MiwokAdapter(this,color, R.color.category_colors);
        color_recyclerView.setAdapter(miwokAdapter);

    }
}