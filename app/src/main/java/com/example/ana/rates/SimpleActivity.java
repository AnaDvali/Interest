package com.example.ana.rates;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }

    public void calculateSimple(View view){
        Formula formula = new Formula();
        EditText p = (EditText)findViewById(R.id.principal);
        EditText r = (EditText)findViewById(R.id.rate);
        EditText t = (EditText)findViewById(R.id.years);
        double principal = Double.parseDouble(p.getText().toString());
        double rate = Double.parseDouble(r.getText().toString());
        int years = Integer.parseInt(t.getText().toString());
        double simple = formula.simpleInterest(principal, rate, years);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Simple Interest");
        alert.setMessage("You will have "+String.format("%.2f", simple)+"$ in "+years+" years");
        alert.setNegativeButton("Okay", null);
        alert.create();
        alert.show();
    }
}
