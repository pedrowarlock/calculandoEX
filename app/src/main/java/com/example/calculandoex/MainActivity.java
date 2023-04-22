package com.example.calculandoex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);


    }

    public void calculando(View view) {
        Calculando Calc = new Calculando();
        EditText editText1 = findViewById(R.id.editTextNumber1);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        double result;
        double value1 = getValue(editText1);
        double value2 = getValue(editText2);;

        if (value1 == -1 || value2 == -1) {
            Toast.makeText(this, "O valor informado não é um número válido: ", Toast.LENGTH_SHORT).show();
            return;
        }

        Spinner spinner = findViewById(R.id.spinner);
        int itemId = (int) spinner.getSelectedItemId();

        switch (itemId) {
            case 1:
                result = Calc.soma(value1, value2);
                setValueResult(result);
                break;
            case 2:
                result = Calc.subtracao(value1, value2);
                setValueResult(result);
                break;
            case 3:
                result = Calc.multiplicacao(value1, value2);
                setValueResult(result);
                break;
            case 4:
                result = Calc.divisao(value1, value2);
                setValueResult(result);
                break;
            case 5:
                result = Calc.exponenciacao(value1, value2);
                setValueResult(result);
                break;
            case 6:
                result = Calc.radiciacao(value1, value2);
                setValueResult(result);
                break;
            default:
                Toast.makeText(this, "Selecione uma operação", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public double getValue(EditText edit){
        String texto = edit.getText().toString();
        if (texto.matches("^-?\\d+(\\.\\d+)?$")) {
            return Double.parseDouble(texto);
        }
        return -1;
    }

    public void setValueResult(double value){
        EditText editText3 = findViewById(R.id.editTextNumber3);
        editText3.setText(String.valueOf(value));
    }

}

