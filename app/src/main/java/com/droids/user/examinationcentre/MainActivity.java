package com.droids.user.examinationcentre;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String item;
    Spinner choicespinner;
    Intent admin_priviliges,teacher1,student_login;
    EditText uid;
    EditText pwd;
    public static ArrayList<String> name=new ArrayList<String>();
    public static ArrayList<String> namet=new ArrayList<String>();
    public static ArrayList<String> college=new ArrayList<String>();
    public static ArrayList<String> password=new ArrayList<String>();
    public static ArrayList<String> passwordt=new ArrayList<String>();
    public void selectlogin(View view) {

        if (item.equals("Admin")){

            if(uid.getText().toString().equals("admin") && pwd.getText().toString().equals("pass123")) {

                admin_priviliges = new Intent(getApplicationContext(), AdminPrivilidges.class);
                startActivity(admin_priviliges);
            }
            else {
                Toast.makeText(this, "Enter a valid id and password", Toast.LENGTH_SHORT).show();
            }

        }
        if (item.equals("Student")) {
            for(int i=0;i<name.size();i++) {
                if(uid.getText().toString().equals(name.get(i)))
                {
                    if(pwd.getText().toString().equals(password.get(i))) {
                        student_login = new Intent(getApplicationContext(), Student_login.class);
                        startActivity(student_login);
                    }
                }
                else {
                    Toast.makeText(this, "Enter a valid id and password", Toast.LENGTH_SHORT).show();
                }
            }


        }
        if (item.equals("Teacher")) {

            for(int i=0;i<namet.size();i++) {
                if(uid.getText().toString().equals(namet.get(i)))
                {
                    if(pwd.getText().toString().equals(passwordt.get(i))) {
                        teacher1 = new Intent(getApplicationContext(), Teacher1Activity.class);
                        startActivity(teacher1);
                    }
                }
                else {
                    Toast.makeText(this, "Enter a valid id and password", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choicespinner=(Spinner)findViewById(R.id.choicespinner);
        choicespinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Login, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        choicespinner.setAdapter(adapter);
        uid=(EditText) findViewById(R.id.uid);
        pwd=(EditText) findViewById(R.id.pwd);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       item = adapterView.getItemAtPosition(i).toString();
       Toast.makeText(this, "Selected mode : " +item, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
