package com.droids.user.examinationcentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class AdminPrivilidges extends AppCompatActivity {

    public static int seach;
    public void registerstudent(View view){

        Intent reg_student= new Intent(getApplicationContext(),Admin_reg_student.class);
        startActivity(reg_student);

    }

    public void registerteacher(View view){

        Intent reg_teacher= new Intent(getApplicationContext(),Admin_teacher.class);
        startActivity(reg_teacher);

    }
    public void shut(View view){
        int size=MainActivity.name.size();
        int tno=MainActivity.namet.size();
        if(size%tno==0) seach=size/tno;
        else seach=size/tno+1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_privilidges);
        Intent admin_priviliges=getIntent();

    }
}
