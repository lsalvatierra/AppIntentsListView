package com.example.appintentslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(MainActivity.this, "Se hizo click en el button1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Snackbar.make(v, "Mostrando SnackBar",Snackbar.LENGTH_LONG).show();
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                break;
            default:
                Toast.makeText(MainActivity.this, "Se hizo click en otro elemento distinto", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
