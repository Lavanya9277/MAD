package com.example.a3rdlabprogram;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView t1;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int sum=num1+num2;
                t1.setText(Integer.toString(sum));
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int diff=num1-num2;
                t1.setText(Integer.toString(diff));
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                int mul=num1*num2;
                t1.setText(Integer.toString(mul));
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                double div=num1/num2;
                t1.setText(Double.toString(div));
            }
        });


    }
}
