package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.util.Log;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toolbar toolbar= findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        Button Exibutton=(Button) findViewById(R.id.ExButton);
        Button workButton =(Button)findViewById(R.id.workButton);
        Button ProButton= (Button)findViewById(R.id.ProButton);
        Button OptButton =(Button)findViewById(R.id.OptButton);
        Button VisButton =(Button)findViewById(R.id.VisButton);

        Exibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                System.exit(0);

            }
        });
        workButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                       //TextView buckysText=(TextView)findViewById(R.id.buckysText);
                       //buckysText.setText("Work rate button works!");
                        //setContentView(R.layout.workrate);
                        openWorkrate();
                    }


                }

        );

        VisButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        //TextView buckysText=(TextView)findViewById(R.id.buckysText);
                        //buckysText.setText("Work rate button works!");
                        //setContentView(R.layout.workrate);
                        openVis();
                    }


                }

        );

        OptButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        //TextView buckysText=(TextView)findViewById(R.id.buckysText);
                        //buckysText.setText("Work rate button works!");
                        //setContentView(R.layout.workrate);
                        openOptimization();
                    }


                }

        );

        ProButton.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        //TextView buckysText=(TextView)findViewById(R.id.buckysText);
                        //buckysText.setText("Work rate button works!");
                        //setContentView(R.layout.projects);
                        openProjects();
                    }


                }


          );

    }

    public void openProjects()
    {
        Intent intent =new Intent(this, Projects.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_style, menu);
        return true;
    }

    public void openWorkrate()
    {
        Intent intent =new Intent(this, workrate.class);
        startActivity(intent);
        TextView buckysText=(TextView)findViewById(R.id.editText3);
        //buckysText.setText("Work rate button works!");
        //String rateF=buckysText;
    }
    public void openOptimization()
    {
        Intent intent =new Intent(this, Optimization.class);
        startActivity(intent);
    }

    public void openVis()
    {
        Intent intent =new Intent(this, Visualization.class);
        startActivity(intent);
    }

    public void addButtonClicked(View view) {
    }

    /////..................................










}
