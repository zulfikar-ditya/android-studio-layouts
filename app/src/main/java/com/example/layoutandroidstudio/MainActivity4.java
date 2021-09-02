package com.example.layoutandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void next (View view) {
        Intent nextIntent = new Intent(MainActivity4.this, MainActivity5.class);
        startActivity(nextIntent);
    }

    public void close(View view) {
        finish();
    }
}