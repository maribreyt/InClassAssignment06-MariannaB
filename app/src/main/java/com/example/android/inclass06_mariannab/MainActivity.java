package com.example.android.inclass06_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText one;
    EditText two;
    EditText three;
    CheckBox checkTransmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (EditText) findViewById(R.id.model);
        two = (EditText) findViewById(R.id.year);
        three = (EditText) findViewById(R.id.color);
        checkTransmission = (CheckBox) findViewById(R.id.automatic_checkbox);

    }

    public void submit(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String carName = one.getText().toString();

        String year = two.getText().toString();
        int finalYear = Integer.parseInt(year);

        String color = three.getText().toString();

        boolean autoMan = checkTransmission.isChecked();

        Car car = new Car(carName, finalYear, color, autoMan);
        intent.putExtra(Keys.CAR_KEY, car);
        startActivity(intent);

    }

}
