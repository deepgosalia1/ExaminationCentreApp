package com.droids.user.examinationcentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Teacher1Activity extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher1);
        Intent teacher1=getIntent();
        list=(ListView)findViewById(R.id.list);
    }

    public void viewcl(View view) {
        list.setAlpha(1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,MainActivity.name);
        list.setAdapter(arrayAdapter);
    }
    public void viewst(View view) {

    }
}
