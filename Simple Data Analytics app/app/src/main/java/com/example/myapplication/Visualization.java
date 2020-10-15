package com.example.myapplication;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.util.Log;


public class Visualization extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE=1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualization);
        Button LindoButton =(Button) findViewById(R.id.LindoButton);
        imageView2= (ImageView) findViewById(R.id.imageView2);

        //disable camera if user has no camera
        if(!hasCamera())
            LindoButton.setEnabled(false);
        getSupportActionBar().setTitle("EA Visualization");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_style, menu);
        return true;
    }

    //checks if user has a camera
    private boolean hasCamera()
    {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    //launching the camera
    public void launchCamera( View view )
    {
        Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
        //Take a picture and pass results along to onActivityResult
        startActivityForResult(intent,REQUEST_IMAGE_CAPTURE );
    }

    //if you want to return the image taken


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_IMAGE_CAPTURE&&resultCode==RESULT_OK)
        {
            //Get the photo
            Bundle extras = data.getExtras();
            Bitmap photo= (Bitmap) extras.get("data");
            imageView2.setImageBitmap(photo);



        }
    }









}
