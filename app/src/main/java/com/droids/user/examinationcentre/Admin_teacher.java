package com.droids.user.examinationcentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Admin_teacher extends AppCompatActivity {
    EditText teachname;
    EditText pat;
    public void registerteacher(View view){
        Intent intent=new Intent(getApplicationContext(),AdminPrivilidges.class);
        startActivity(intent);
        MainActivity.namet.add(teachname.getText().toString());
        MainActivity.passwordt.add(pat.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_teacher);
        Intent teacher1=getIntent();
        teachname=(EditText)findViewById(R.id.teach_name);
        pat=(EditText)findViewById(R.id.editText3);
    }
}
