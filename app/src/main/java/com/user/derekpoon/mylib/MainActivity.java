package com.user.derekpoon.mylib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static com.user.derekpoon.trigolibrary.Compute.rectangleArea;
import static com.user.derekpoon.trigolibrary.Compute.triangleArea;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(rectangleArea(3.3,5.85));
        System.out.println(triangleArea(33,42,54));

    }
}
