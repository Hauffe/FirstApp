package br.pucpr.appdev.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText frstNum;
    private EditText secNum;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frstNum = findViewById(R.id.frstNum);
        secNum = findViewById(R.id.secNum);

    }

    public void btnSomaOnClick(View view){
        Double result = operacao(Double.parseDouble(frstNum.getText().toString()), Double.parseDouble(secNum.getText().toString()), 1);
        if(count < 5){
            Toast.makeText(this, "Resultado: " + result, Toast.LENGTH_LONG).show();
            count++;
        }else{
            Toast.makeText(this, "chega!", Toast.LENGTH_LONG).show();
            count = 0;
        }
    }

    public void btnSubOnClick(View view){
        Double result = operacao(Double.parseDouble(frstNum.getText().toString()), Double.parseDouble(secNum.getText().toString()), 2);
        if(count < 5){
            Toast.makeText(this, "Resultado: " + result, Toast.LENGTH_LONG).show();
            count++;
        }else{
            Toast.makeText(this, "chega!", Toast.LENGTH_LONG).show();
            count = 0;
        }
    }

    public double operacao(double val1, double val2, int operacao){
        double result = 0;
        switch (operacao){
            case 1:
                result = val1 + val2;
                break;
            case 2:
                result = val1 - val2;
                break;
        }
        return result;
    }

}
