package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pryamougolnik extends AppCompatActivity {
    private TextView resultS;
    private TextView resultP;
    private EditText field_1_pryamoug;
    private EditText field_2_pryamoug;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pryamougolnik);

        resultS = findViewById(R.id.textView3);
        resultP = findViewById(R.id.textView4);
        field_1_pryamoug = findViewById(R.id.field_1);
        field_2_pryamoug = findViewById(R.id.field_2);
        button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(field_1_pryamoug.getText().toString());
                float num2 = Float.parseFloat(field_2_pryamoug.getText().toString());
                float P = (num1 + num2) * 2;
                float S = num1 * num2;

                if (num1 <= 0 | num2 <= 0 | num1 == num2){
                    resultS.setText("");
                    resultP.setText("Такого прямоугольника не существует :(");
                }else {
                    resultS.setText("S: " + String.valueOf(S));
                    resultP.setText("P: " + String.valueOf(P));
                }
            }
        });
    }

    public void Menu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}