package com.example.appintentslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lvDatos;
    List<String> listAndroidVersion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvDatos = findViewById(R.id.lvDatos);
        listAndroidVersion = new ArrayList<>();
        listAndroidVersion.add("Pie");
        listAndroidVersion.add("Oreo");
        listAndroidVersion.add("Nougat");
        listAndroidVersion.add("Marshmallow");
        listAndroidVersion.add("Lollipop");
        listAndroidVersion.add("Kitkat");
        listAndroidVersion.add("Jellybean");

        ArrayAdapter adaptadorVerAndroid = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                listAndroidVersion
        );
        lvDatos.setAdapter(adaptadorVerAndroid);

        lvDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(parent == lvDatos){
            String versionAndroid = listAndroidVersion.get(position);
            Toast.makeText(Main2Activity.this, "Clickeo-> "+ versionAndroid, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(Main2Activity.this, "Error!!", Toast.LENGTH_LONG).show();
        }
    }
}
