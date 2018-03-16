package com.droids.user.examinationcentre;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Admin_reg_student extends AppCompatActivity {

    EditText stname;
    EditText coll;
    EditText stpass;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
    }

    public void photoupload(View view){

        Intent camera=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera,1);
    }

    public void submitstudent(View view){
        Intent intent=new Intent(getApplicationContext(),AdminPrivilidges.class);
        startActivity(intent);
        MainActivity.name.add(stname.getText().toString());
        MainActivity.password.add(stpass.getText().toString());
        MainActivity.college.add(coll.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_reg_student);
        Intent reg_student=getIntent();
        stname=(EditText)findViewById(R.id.name_st_et);
        coll=(EditText)findViewById(R.id.college_et);
        stpass=(EditText)findViewById(R.id.pass_et);
    }
}
