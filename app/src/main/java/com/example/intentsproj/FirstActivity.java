package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance
        LayoutInflater il = getLayoutInflater();

        //Getting the View Object as defined in the customtoast.xml file
        View layout = il.inflate(R.layout.customtoast,(ViewGroup)
        findViewById(R.id.custom_toast_layout));

        //Creating the Toast Object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
        toast.setView(layout);//setting the view of the customer toast layout
        toast.show();

        e1 = (EditText)findViewById(R.id.txt1);
        e2 = (EditText)findViewById(R.id.txt2);
    }

    public void activity2(View view) {
        Intent li = new Intent(this,SecondActivity.class);
        li.putExtra("user", e1.getText().toString());
        li.putExtra("user2", e2.getText().toString());
        startActivity(li);

    }
}