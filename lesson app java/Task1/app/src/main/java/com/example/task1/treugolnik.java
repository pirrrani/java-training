package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class treugolnik extends AppCompatActivity {

    private TextView resultS;
    private TextView resultP;
    private EditText field_1_treug;
    private EditText field_2_treug;
    private EditText field_3_treug;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treugolnik);

        resultS = findViewById(R.id.textView);
        resultP = findViewById(R.id.textView2);
        field_1_treug = findViewById(R.id.field_1);
        field_2_treug = findViewById(R.id.field_2);
        field_3_treug = findViewById(R.id.field_3);
        button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(field_1_treug.getText().toString());
                float num2 = Float.parseFloat(field_2_treug.getText().toString());
                float num3 = Float.parseFloat(field_3_treug.getText().toString());

                float P = num1 + num2 + num3;
                float Pp = P / 2;
                float S = (float) Math.sqrt(Pp * (Pp - num1) * (Pp - num2) * (Pp - num3));

                if (num1 <= 0 | num2 <= 0 | num3 <= 0){
                    resultS.setText("Такого треугольника не существует :(");
                    resultP.setText("");
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