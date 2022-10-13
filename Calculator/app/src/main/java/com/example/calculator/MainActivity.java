package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private Button btnResultado;
    private TextView tsResultado;
    private TextView tsMostrarResultado;
    private EditText txNumber1;
    private EditText txNumber2;
    int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNumber1 = findViewById(R.id.etNum1);
        txNumber2 = findViewById(R.id.etNum2);
        tsResultado = findViewById(R.id.txResult);
        tsMostrarResultado = findViewById(R.id.tsMostarOp);
        btnSumar = findViewById(R.id.btnS);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsMostrarResultado.setText("Suma");
                var = suma(Integer.parseInt(txNumber1.getText().toString()),Integer.parseInt(txNumber2.getText().toString())) ;
            }
        });
        btnRestar = findViewById(R.id.btnR);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsMostrarResultado.setText("Resta");
                var = resta(Integer.parseInt(txNumber1.getText().toString()),Integer.parseInt(txNumber2.getText().toString()));
            }
        });
        btnMultiplicar = findViewById(R.id.btnM);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsMostrarResultado.setText("Multiplicación");
                var = multiplicacion(Integer.parseInt(txNumber1.getText().toString()),Integer.parseInt(txNumber2.getText().toString())) ;
            }
        });
        btnDividir = findViewById(R.id.btnD);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsMostrarResultado.setText("División");
                var = division(Integer.parseInt(txNumber1.getText().toString()),Integer.parseInt(txNumber2.getText().toString()));
            }
        });

        btnResultado = findViewById(R.id.btnResult);
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tsResultado.setText(var + "");
            }
        });
    }

    public int suma (int a, int b){
        return a + b;
    }
    public int resta (int a, int b){
        return a-b;
    }
    public int multiplicacion (int a, int b){
        return a * b;
    }
    public int division (int a, int b){
        int result = 0;

        if(b!=0){
            result = a/b;
        }
        return result;
    }

}