package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public  static final String EXTRA_MESSAGE = "com.example.myapp1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        // Do something
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "zhang san";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
