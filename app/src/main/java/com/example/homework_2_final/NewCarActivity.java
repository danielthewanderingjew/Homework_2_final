package com.example.homework_2_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcar);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText brand = findViewById(R.id.brand);
                EditText model = findViewById(R.id.model);
                EditText year = findViewById(R.id.year);
                EditText price = findViewById(R.id.price);
                Car car = new Car(R.drawable.toyota_corolla_vii_e100,brand.getText().toString(),model.getText().toString(),year.getText().toString(),price.getText().toString());

                Intent i = new Intent();
                i.putExtra("car", car);
                setResult(1,i);
                finish();



            }
        });

    }
}