package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void treug(View v){
        Intent intent = new Intent(this, treugolnik.class);
        startActivity(intent);
    }

    public void pryamoug(View v){
        Intent intent = new Intent(this, pryamougolnik.class);
        startActivity(intent);
    }
}