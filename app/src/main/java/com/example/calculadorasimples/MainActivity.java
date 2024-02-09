package com.example.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Double num1;
    public Double num2;
    public Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma = (Button) findViewById(R.id.buttonSomar);
        Button btnSubtrair = (Button) findViewById(R.id.buttonSubtrair);
        Button btnMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        Button btnDividir = (Button) findViewById(R.id.buttonDividir);

        TextView textViewResultado = (TextView)findViewById(R.id.textViewResultado);

        EditText editTextValor1 = (EditText)findViewById(R.id.editTextValor1);
        EditText editTextValor2 = (EditText)findViewById(R.id.editTextValor2);

        num1 = Double.parseDouble(editTextValor1.getText().toString());
        num2 = Double.parseDouble(editTextValor2.getText().toString());

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = num1 + num2;
                textViewResultado.setText(String.valueOf(resultado));
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = num1 - num2;
                textViewResultado.setText(String.valueOf(resultado));
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = num1 * num2;
                textViewResultado.setText(String.valueOf(resultado));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = num1 / num2;
                textViewResultado.setText(String.valueOf(resultado));
            }
        });
    }

}