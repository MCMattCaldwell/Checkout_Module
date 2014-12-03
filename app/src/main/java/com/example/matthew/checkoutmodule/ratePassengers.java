package com.example.matthew.checkoutmodule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;



public class ratePassengers extends Activity {
    public String rating_1;
    public String rating_2;
    public String rating_3;
    public String rating_4;
    private RatingBar ratingBar_1;
    private RatingBar ratingBar_2;
    private RatingBar ratingBar_3;
    private RatingBar ratingBar_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_passengers);


        //passenger1
        TextView textperson_1 = (TextView) findViewById(R.id.textView5);
        textperson_1.setText("example value");

        //passenger2
        TextView textperson_2 = (TextView) findViewById(R.id.textView6);
        textperson_2.setText("example value");

        //passenger3
        TextView textperson_3 = (TextView) findViewById(R.id.textView7);
        textperson_3.setText("example value");

        //passenger4
        TextView textperson_4 = (TextView) findViewById(R.id.textView11);
        textperson_4.setText("example value");

        submitRatingsButton();
        cancelRatingsButton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rate_passengers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //to do: submit button redirects to checkout, while submitting ratings
    private void submitRatingsButton(){
        ratingBar_1 = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar_2 = (RatingBar) findViewById(R.id.ratingBar2);
        ratingBar_3 = (RatingBar) findViewById(R.id.ratingBar3);
        ratingBar_4 = (RatingBar) findViewById(R.id.ratingBar4);
        Button submitButton = (Button) findViewById(R.id.button5);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                rating_1 = String.valueOf(ratingBar_1);
                rating_2 = String.valueOf(ratingBar_2);
                rating_3 = String.valueOf(ratingBar_3);
                rating_4 = String.valueOf(ratingBar_4);
                startActivity(new Intent(ratePassengers.this, CheckoutPage.class)); //forwards to share page
            }
        });
    }

    private void cancelRatingsButton(){
        Button cancelButton = (Button) findViewById(R.id.button6);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(ratePassengers.this, CheckoutPage.class)); //forwards to share page
            }
        });
    }
}
