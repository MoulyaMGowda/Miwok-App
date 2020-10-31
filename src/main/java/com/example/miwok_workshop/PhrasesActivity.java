package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Phrases);

        final List<MiwokModel> phrases= new ArrayList<>();
        phrases.add(new MiwokModel("where are you going?","minto wuksus"));
        phrases.add(new MiwokModel("what is your name?","tinne oyaase'ne"));
        phrases.add(new MiwokModel("My name is","oyaaset..."));
        phrases.add(new MiwokModel("How are you feeling?","michekse?"));
        phrases.add(new MiwokModel("I'm feeling good.","kuchi achit"));
        phrases.add(new MiwokModel("Are you coming?","eenes'aa?"));
        phrases.add(new MiwokModel("Yes,I'm coming.","hee'eenem"));
        phrases.add(new MiwokModel("I'm coming.","eenem"));
        phrases.add(new MiwokModel("let's go","yoowutis"));
        phrases.add(new MiwokModel("Come here.","enni'nem"));

        RecyclerView phrases_recyclerView = findViewById(R.id.recyckerView4);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        phrases_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter=new MiwokAdapter(this,phrases, R.color.category_phrases);
        phrases_recyclerView.setAdapter(miwokAdapter);

    }
}