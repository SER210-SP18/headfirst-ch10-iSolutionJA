package com.example.daron.bitsandpizzaspart2;

import android.os.Bundle;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ActionBar actionBar = getActionBar();
        if (actionBar !=null)
            actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
