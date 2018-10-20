package com.example.ana.rates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void compoundCalculate(MenuItem item) {
        Intent compound = new Intent(this, CompoundActivity.class);
        startActivity(compound);
    }

    public void simpleCalculate(MenuItem item) {
        Intent simple = new Intent(this, SimpleActivity.class);
        startActivity(simple);
    }

}
