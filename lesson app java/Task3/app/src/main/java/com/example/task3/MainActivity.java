package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText from_num, to_num, del_num;
    private Button start_button;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from_num = findViewById(R.id.from_num);
        to_num = findViewById(R.id.to_num);
        del_num = findViewById(R.id.del_num);
        res = findViewById(R.id.res);
        start_button = findViewById(R.id.start_button);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fnum = Integer.parseInt(from_num.getText().toString());
                int tnum = Integer.parseInt(to_num.getText().toString());
                int dnum = Integer.parseInt(del_num.getText().toString());
                String s = "";

                if(dnum != 0 | fnum != tnum | tnum != 0) {
                    for (int i = fnum; i <= tnum; i++) {
                        if (i % dnum == 0) {
                            s = s + Integer.toString(i) + "; ";
                        }
                    }
                    res.setText(s);
                    res.setMovementMethod(new ScrollingMovementMethod());
                }else{
                    res.setText("----------Некорректный ввод данных-------------");
                }

            }
        });
    }
}