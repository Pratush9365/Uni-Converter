package com.example.uniconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNumber;
    private TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextNumber = findViewById(R.id.editTextNumber);
        textview2 = findViewById(R.id.textview2);
         button.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("SetTextI18n")
             @Override
             public void onClick(View v) {
                // Toast.makeText(MainActivity.this, " write a number in kg", Toast.LENGTH_SHORT).show();// for click the button you may show some text on the screen.
                   String s = editTextNumber.getText().toString();//string is used to convert the text.
                    int Rs = Integer.parseInt(s);// this is for transfering the string s of edittextnumbe which is used in xml file.
                 double dollar = 33.8*Rs;
                 textview2.setText(+ dollar +" °F");// for print the value of kg after coverting the value by user.
             }
         });

    } // crtl+slash is a short cut key for comment
}