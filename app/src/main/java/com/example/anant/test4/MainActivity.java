package com.example.anant.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quantity);
        TextView textView = (TextView) findViewById(R.id.quantity_text_view);
        textView.setText("" + quantity);
    }

    public void decrement(View v){
        if(quantity!=0) {
            quantity = quantity - 1;
            display(quantity);
        }
    }

    public void increment(View v){
        quantity=quantity+1;
        display(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView textView = (TextView) findViewById(R.id.quantity_text_view);
        textView.setText("" + number);
    }
}
