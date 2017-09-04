package com.user.derekpoon.mylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.user.derekpoon.trigolibrary.Compute.rectangleArea;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(rectangleArea(3,5));
    }
}
