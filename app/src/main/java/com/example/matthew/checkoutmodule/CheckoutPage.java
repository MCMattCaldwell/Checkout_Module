package com.example.matthew.checkoutmodule;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


public class CheckoutPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);

        shareExperienceButton();
        ratePassengersButton();
        calculateFareButton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkout_page, menu);
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

    //on pressed button, redirects to share page
    private void shareExperienceButton(){
        Button shareExpButton = (Button) findViewById(R.id.button);
        shareExpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(CheckoutPage.this, ShareExperience.class)); //forwards to share page
            }
        });
    }

    //on pressed button, redirects to rate passengers page
    private void ratePassengersButton(){
        Button rateButton = (Button) findViewById(R.id.button2);
        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(CheckoutPage.this, ratePassengers.class)); //forwards to rate page
            }
        });
    }

    //on pressed button, redirects to fare display
    private void calculateFareButton(){
        Button fareButton = (Button) findViewById(R.id.button3);
        fareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(CheckoutPage.this, FareCalculator.class)); //forwards to fare display page
            }
        });
    }
}

