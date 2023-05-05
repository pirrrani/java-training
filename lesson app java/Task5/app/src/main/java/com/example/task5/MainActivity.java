package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText str;
    private Button button;
    private Button button3;
    private Button button2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = findViewById(R.id.str);
        button = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startstr = str.getText().toString();
                String resstr = "";
                char ch;

                for (int i=0; i<startstr.length(); i++)
                {
                    ch= startstr.charAt(i);
                    resstr= ch+resstr;
                }

                str.setText(resstr, TextView.BufferType.EDITABLE);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startstr = str.getText().toString();
                String resstr = startstr.replaceAll("[aeiouyAEIOUY]","");
                str.setText(resstr, TextView.BufferType.EDITABLE);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startstr = str.getText().toString();
                String dopstr = "";
                String resstr = "";
                for(int i = 0; i < startstr.length(); i++){
                    if ((i + 1) % 2 == 0){
                        dopstr += startstr.charAt(i);
                        dopstr = dopstr.toUpperCase();
                        resstr += dopstr;
                        dopstr = "";
                    }else{
                        resstr += startstr.charAt(i);
                    }
                }
                str.setText(resstr, TextView.BufferType.EDITABLE);
            }
        });
    }
}