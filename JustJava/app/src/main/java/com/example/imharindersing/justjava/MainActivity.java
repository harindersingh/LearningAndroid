package com.example.imharindersing.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        quantity += 1;
        display(quantity);
    }

    public void decrement(View view){
        if(quantity == 0){
            return;
        }
        quantity -= 1;
        display(quantity);
    }

    public void submitOrder(View view){
        int price = quantity * 50;
        String priceMessage = "Total item count " + quantity + " coffees\nThat would be $"
                + price;
        displayMessage(priceMessage);
    }

    private void display(int number){
        TextView quantityTextView = (TextView) findViewById
                (R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById
                (R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
