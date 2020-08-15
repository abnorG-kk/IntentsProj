package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText e1, e2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.txt1);
        e2 = (EditText)findViewById(R.id.txt2);
        bt1 = (Button)findViewById(R.id.btn1);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
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

                Intent li = new Intent(FirstActivity.this,SecondActivity.class);
                li.putExtra("number1", e1.getText().toString());
                li.putExtra("number21", e2.getText().toString());
                startActivity(li);
            }
        });
    }


}