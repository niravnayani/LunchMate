package com.example.nickhalden.lunchmate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    ImageView defLocation, priceRange, restaurantRestriction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        defLocation = (ImageView) findViewById(R.id.imageViewDefaultLocation);
        defLocation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle("Default Location");
                builder.setMessage("Set the default location to your office's location or where you are most often located during the work week and set the radius the maximum distance that you are available to go to from your default location for an hour lunch!")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //do things
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        priceRange = (ImageView) findViewById(R.id.imageViewPriceRange);
        priceRange.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle("Restaurant Price Range");
                builder.setMessage("Please select the price range of restaurants that you would like to attend lunches at. ")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //do things
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        restaurantRestriction = (ImageView) findViewById(R.id.imageViewRestrictions);
        restaurantRestriction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle("Restaurant Restrictions");
                builder.setMessage("Based on your set location and restaurant price range selection the following restaurants are available for lunches in your area. Please select the restaurants that you would like to exclude for your lunches because of dietary or other reasons!")
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //do things
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });


    }
}
