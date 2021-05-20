package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText txt1,txt2;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==btn){
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());
                    if(num1!=0){
                        double kq = num2/(num1*num1);
                        result.setText("Kết quả:" + kq);
                    }
                    else{
                        result.setText("Không tính được!");
                    }
                }
            }
        });
    }

    private void init() {
        btn = findViewById(R.id.button_submit);
        txt1 = findViewById(R.id.text_input1);
        txt2 = findViewById(R.id.text_input2);
        result = findViewById(R.id.text_result);

    }
}