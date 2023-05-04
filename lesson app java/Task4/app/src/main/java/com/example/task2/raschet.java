package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class raschet extends AppCompatActivity {

    private EditText dlitelnost;
    private EditText procent;
    private EditText summa;
    private TextView month;
    private TextView itog;
    private Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raschet);

        dlitelnost = findViewById(R.id.editText);
        procent = findViewById(R.id.editText2);
        summa = findViewById(R.id.editText3);
        res = findViewById(R.id.button3);
        month = findViewById(R.id.textView2);
        itog = findViewById(R.id.textView3);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(dlitelnost.getText().toString());
                float num2 = Float.parseFloat(procent.getText().toString());
                float num3 = Float.parseFloat(summa.getText().toString());

                float D = num3 * num2 / 100;
                System.out.println("Доход в месяц:" + D);
                int i = 0;
                while(i < num1){
                    num3 += D;
                    i += 1;
                }

                month.setText("Доход в месяц:" + " " +  String.valueOf(D));
                itog.setText("Итоговый доход:" + " " + String.valueOf(num3));
            }
        });
    }
}