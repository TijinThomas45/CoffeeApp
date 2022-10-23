package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**

 This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    int noofcoffes=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder (View view){

        String pricemessage= "Total ₹" + (noofcoffes * 15) + "\nThank you! ";
        displayMessage(pricemessage);
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment (View view){
        noofcoffes= noofcoffes + 1;
        display(noofcoffes);
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement (View view){
        noofcoffes=noofcoffes - 1  ;
        display(noofcoffes);
    }
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_View);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_View);
        priceTextView.setText(message);
    }
}
