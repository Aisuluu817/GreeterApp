package com.example.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Greet(View view) {
        EditText editText = findViewById(R.id.name);

        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Please, enter your name", Toast.LENGTH_SHORT).show();
        }
        else {
            String greeting = " Hello, ";
            String name = editText.getText().toString();
            TextView greetUser = findViewById(R.id.greeting);
            greetUser.setText(greeting + name + "\n Have a nice day!");

        }
    }
}