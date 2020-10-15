package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.Log;

import static java.lang.Integer.valueOf;


public class workrate extends AppCompatActivity {


   private  EditText edText2 ;
   private EditText edText1 ;
   private Button RevButton;


   private TextView TxtV ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.workrate);
        getSupportActionBar().setTitle("EA Workrate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //my functions will be here
        //currenccy  and workrate


        RevButton=(Button) findViewById(R.id.button);

        RevButton.setOnClickListener(
                new Button.OnClickListener()
       {
                   public void onClick(View v)
                {
                    //instantiate your editText/ component inside button
                    edText1 = (EditText) findViewById(R.id.editText3);

                    edText2 = (EditText) findViewById(R.id.editText4);

                    TxtV = (TextView) findViewById(R.id.textView4);

                    if(edText1.getText().toString().length()==0)
                                {
                                             edText1.setText("0");
                                }

                    if(edText2.getText().toString().length()==0)
                    {
                        edText2.setText("0");
                    }

                    int num1= Integer.parseInt(edText1.getText().toString());
                    int num2= Integer.parseInt(edText2.getText().toString());


                      int mult=num1 * num2;
                    TxtV.setText(String.valueOf(mult));

                }


             }

             );


            // int i1 = Integer.parseInt(t1);
            // int total= factorial(i1);





    }
}
