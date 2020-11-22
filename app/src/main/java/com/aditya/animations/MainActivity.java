package com.aditya.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    String Tag = "Main Activity";
    Boolean imageView1isShown = true; //this will allow to change the image over and over again back and forth
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag, "--On Create--");
        ImageView imageView = (ImageView) findViewById(R.id.image_one);
        imageView.setX(-2000); //this will set the imageView_one outside of the screen to the left side
        imageView.animate().translationXBy(2000).rotation(3600).setDuration(2000); //translationXBY(2000 is dpi) will bring back the imageView_one back in the screen from the left to the right
                                                                                   //+ve is for right -Ve is for the left
    }
public void fade(View view)
{
    Log.i( Tag, "clicked");
    ImageView imageView = (ImageView) findViewById(R.id.image_one);
    ImageView imageView1 = (ImageView) findViewById(R.id.image_two);
    //animate function holds pre defined animations that are provided by android as an api
    //alpha 0 means that the image is not visible
    //alpha 1 means the image is visible
    //setDuration sets the duration of a certain animations sequences in the app 2000 is in milliseconds for that time the animations will last
    //rotation will rotate the image when clicked on it at a specific degree rotation(numeric value in degrees)

    //logic to change the image via animation back and forth via using fade animation
    if(imageView1isShown)
    {    imageView1isShown = false;
        imageView.animate().rotation(1800).alpha(0).setDuration(2000);
        imageView1.animate().rotation(3600).alpha(1).setDuration(2000);
    }
    else
    {    imageView1isShown = true;
        imageView.animate().rotation(3600).alpha(1).setDuration(2000);
        imageView1.animate().rotation(1800).alpha(0).setDuration(2000);
    }
}
}