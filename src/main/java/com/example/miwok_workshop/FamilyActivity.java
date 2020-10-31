package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        final List<MiwokModel> family = new ArrayList<>();
        family.add(new MiwokModel("father", "epe", R.drawable.family_father));
        family.add(new MiwokModel("mother", "ata", R.drawable.family_mother));
        family.add(new MiwokModel("son", "angsi", R.drawable.family_son));
        family.add(new MiwokModel("daughter","tune",R.drawable.family_daughter));
        family.add(new MiwokModel("older brother","taachui",R.drawable.family_older_brother));
        family.add(new MiwokModel("younger brother","chalitti",R.drawable.family_younger_brother));
        family.add(new MiwokModel("older sister","tete",R.drawable.family_older_sister));
        family.add(new MiwokModel("younger sister","kolliti",R.drawable.family_younger_sister));
        family.add(new MiwokModel("grandfather","paapa",R.drawable.family_grandfather));
        family.add(new MiwokModel("grandmother","ama",R.drawable.family_grandmother));

        RecyclerView family_recyclerView = findViewById(R.id.recyckerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter=new MiwokAdapter(this,family, R.color.category_family);
        family_recyclerView.setAdapter(miwokAdapter);
    }
}