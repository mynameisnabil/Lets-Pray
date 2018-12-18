package com.example.test.letspray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method onclick, View view sebagai paramater
    public void jadwalsholat1(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivityjs.class);
        startActivity(intent);
    }

    public void radio1(View view) {
        Intent intent = new Intent(MainActivity.this,Dashboard.class);
        startActivity(intent);
    }

    public void kompas1(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivitykmps.class);
        startActivity(intent);
    }

    public void doa3(View view) {
        Intent intent = new Intent(MainActivity.this,doa.class);
        startActivity(intent);
    }

}
