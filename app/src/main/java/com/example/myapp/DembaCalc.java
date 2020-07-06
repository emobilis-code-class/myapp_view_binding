package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DembaCalc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demba_calc);

        final EditText edt1 =findViewById(R.id.edit1);
        final EditText edt2 = findViewById(R.id.edit2);
        final TextView txtResult = findViewById(R.id.result);
//        final TextView txtequat = findViewById(R.id.eq);
        Button btn_add = findViewById(R.id.add);
        Button btn_sub = findViewById(R.id.subtract);
        Button btn_mul = findViewById(R.id.multiply);
        Button btn_div = findViewById(R.id.divide);
        Button btn_clear = findViewById(R.id.cancel);

        final int num1 = Integer.parseInt(edt1.getText().toString());
        final int num2 = Integer.parseInt(edt2.getText().toString());
        final int a = num1 + num2;
        final int b = num1 - num2;
        final int c = num1 / num2;
        final int d = num1 * num2;
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().length() == 0){
                    edt1.setText("0");
                }
                if (edt2.getText().toString().length() == 0){
                    edt2.setText("0");
                }
                txtResult.setText(String.valueOf(a));
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().length() == 0){
                    edt1.setText("0");
                }
                if (edt2.getText().toString().length() == 0){
                    edt2.setText("0");
                }
                txtResult.setText(String.valueOf(b));
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().length() == 0){
                    edt1.setText("0");
                }
                if (edt2.getText().toString().length() == 0){
                    edt2.setText("0");
                }
                txtResult.setText(String.valueOf(d));
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().toString().length() == 0){
                    edt1.setText("0");
                }
                if (edt2.getText().toString().length() == 0){
                    edt2.setText("0");
                }
                if (num2 == 0){
                    edt2.setError("You can not divide by 0");
                }
//                txtequat.setText("");
                txtResult.setText(String.valueOf(c));
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                txtResult.setText("");
            }
        });
    }
}
