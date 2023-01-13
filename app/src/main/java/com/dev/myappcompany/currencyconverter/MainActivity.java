package com.dev.myappcompany.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view) {

        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInDollars = editText.getText().toString();

        Log.i("Info", editText.getText().toString());

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double convertToReal = (amountInDollarsDouble * 5.11);

        Toast.makeText
                (
                this,
                "U$D " + amountInDollars + " is R$ " + convertToReal, Toast.LENGTH_LONG
                ).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
