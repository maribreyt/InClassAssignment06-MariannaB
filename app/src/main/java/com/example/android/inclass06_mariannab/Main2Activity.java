package com.example.android.inclass06_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        one = (TextView) findViewById(R.id.car_summary);

        Intent intent = getIntent();
        Car car = (Car) intent.getSerializableExtra(Keys.CAR_KEY);
        one.setText(car.toString());
    }

}
