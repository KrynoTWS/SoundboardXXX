package com.example.soundboardxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityAnimals extends AppCompatActivity {
    public Button btnBasic=(Button)findViewById(R.id.btnBasic);
    public Button btnElectro=(Button)findViewById(R.id.BtnElectro);
    public Button btnAnimals=(Button)findViewById(R.id.btnAnimals);
    public Button btnObjects=(Button)findViewById(R.id.btnObjects);
    public Button btnSoundRec=(Button)findViewById(R.id.btnSoundRec);
    public Button btnA1=(Button)findViewById(R.id.btnE1);
    public Button btnA2=(Button)findViewById(R.id.btnE2);
    public Button btnA3=(Button)findViewById(R.id.btnE3);
    public Button btnA4=(Button)findViewById(R.id.btnE4);
    public Button btnA5=(Button)findViewById(R.id.btnE5);
    public Button btnA6=(Button)findViewById(R.id.btnE6);
    public Button btnA7=(Button)findViewById(R.id.btnE7);
    public Button btnA8=(Button)findViewById(R.id.btnE8);
    public Button btnA9=(Button)findViewById(R.id.btnE9);
    public Button btnA10=(Button)findViewById(R.id.btnE10);
    public Button btnA11=(Button)findViewById(R.id.btnE11);
    public Button btnA12=(Button)findViewById(R.id.btnE12);
    public Button btnA13=(Button)findViewById(R.id.btnE13);
    public Button btnA14=(Button)findViewById(R.id.btnE14);
    public Button btnA15=(Button)findViewById(R.id.btnE15);
    public Button btnA16=(Button)findViewById(R.id.btnE16);
    public Button btnA17=(Button)findViewById(R.id.btnE17);
    public Button btnA18=(Button)findViewById(R.id.btnE18);
    public Button btnA19=(Button)findViewById(R.id.btnE19);
    public Button btnA20=(Button)findViewById(R.id.btnE20);
    public Button btnA21=(Button)findViewById(R.id.btnE21);
    public Button btnA22=(Button)findViewById(R.id.btnE22);
    public Button btnA23=(Button)findViewById(R.id.btnE23);
    public Button btnA24=(Button)findViewById(R.id.btnE24);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        btnBasic.setOnClickListener(v -> {
            Intent intB= new Intent(ActivityAnimals.this,MainActivity.class);
            startActivity(intB);
        });
        btnElectro.setOnClickListener(v -> {
            Intent intE= new Intent(ActivityAnimals.this,ActivityElectro.class);
            startActivity(intE);
        });
        btnAnimals.setOnClickListener(v -> {
            Intent intA= new Intent(ActivityAnimals.this,ActivityAnimals.class);
            startActivity(intA);
        });
        btnObjects.setOnClickListener(v -> {
            Intent intO= new Intent(ActivityAnimals.this,ActivityObjects.class);
            startActivity(intO);
        });
        btnSoundRec.setOnClickListener(v -> {
            Intent intSR= new Intent(ActivityAnimals.this,ActivitySoundRec.class);
            startActivity(intSR);
        });
    }
}