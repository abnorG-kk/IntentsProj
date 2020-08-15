package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    EditText e3, e4;
    TextView t1;
    Button bt1, bt2, bt3 ,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e3 = (EditText)findViewById(R.id.txt1);
        e4 = (EditText)findViewById(R.id.txt2);

        t1 = (TextView)findViewById(R.id.number3);

        bt1 = (Button)findViewById(R.id.addbutton);
        bt2 = (Button)findViewById(R.id.subbutton);
        bt3 = (Button)findViewById(R.id.mulbutton);
        bt4 = (Button)findViewById(R.id.divbutton);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("number1");
        String s2 = b1.getString("number2");

        e3.setText(s1);
        e4.setText(s2);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Integer n1 = Integer.parseInt(e3.getText().toString());
                Integer n2 = Integer.parseInt(e4.getText().toString());

                Integer add = n1 + n2;
                t1.setText(add.toString());
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Integer n1 = Integer.parseInt(e3.getText().toString());
                Integer n2 = Integer.parseInt(e4.getText().toString());

                Integer sub = n1 - n2;
                t1.setText(sub.toString());
            }

        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Integer n1 = Integer.parseInt(e3.getText().toString());
                Integer n2 = Integer.parseInt(e4.getText().toString());

                Integer mul = n1 * n2;
                t1.setText(mul.toString());
            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Integer n1 = Integer.parseInt(e3.getText().toString());
                Integer n2 = Integer.parseInt(e4.getText().toString());

                Integer div = n1 / n2;
                t1.setText(div.toString());
            }
        });
    }
}