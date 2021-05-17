package com.example.soundboardxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityObjects extends AppCompatActivity {
    public Button btnBasic=(Button)findViewById(R.id.btnBasic);
    public Button btnElectro=(Button)findViewById(R.id.BtnElectro);
    public Button btnAnimals=(Button)findViewById(R.id.btnAnimals);
    public Button btnObjects=(Button)findViewById(R.id.btnObjects);
    public Button btnSoundRec=(Button)findViewById(R.id.btnSoundRec);
    public Button btnO1=(Button)findViewById(R.id.btnE1);
    public Button btnO2=(Button)findViewById(R.id.btnE2);
    public Button btnO3=(Button)findViewById(R.id.btnE3);
    public Button btnO4=(Button)findViewById(R.id.btnE4);
    public Button btnO5=(Button)findViewById(R.id.btnE5);
    public Button btnO6=(Button)findViewById(R.id.btnE6);
    public Button btnO7=(Button)findViewById(R.id.btnE7);
    public Button btnO8=(Button)findViewById(R.id.btnE8);
    public Button btnO9=(Button)findViewById(R.id.btnE9);
    public Button btnO10=(Button)findViewById(R.id.btnE10);
    public Button btnO11=(Button)findViewById(R.id.btnE11);
    public Button btnO12=(Button)findViewById(R.id.btnE12);
    public Button btnO13=(Button)findViewById(R.id.btnE13);
    public Button btnO14=(Button)findViewById(R.id.btnE14);
    public Button btnO15=(Button)findViewById(R.id.btnE15);
    public Button btnO16=(Button)findViewById(R.id.btnE16);
    public Button btnO17=(Button)findViewById(R.id.btnE17);
    public Button btnO18=(Button)findViewById(R.id.btnE18);
    public Button btnO19=(Button)findViewById(R.id.btnE19);
    public Button btnO20=(Button)findViewById(R.id.btnE20);
    public Button btnO21=(Button)findViewById(R.id.btnE21);
    public Button btnO22=(Button)findViewById(R.id.btnE22);
    public Button btnO23=(Button)findViewById(R.id.btnE23);
    public Button btnO24=(Button)findViewById(R.id.btnE24);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objects);
        btnBasic.setOnClickListener(v -> {
            Intent intB= new Intent(ActivityObjects.this,MainActivity.class);
            startActivity(intB);
        });
        btnElectro.setOnClickListener(v -> {
            Intent intE= new Intent(ActivityObjects.this,ActivityElectro.class);
            startActivity(intE);
        });
        btnAnimals.setOnClickListener(v -> {
            Intent intA= new Intent(ActivityObjects.this,ActivityAnimals.class);
            startActivity(intA);
        });
        btnObjects.setOnClickListener(v -> {
            Intent intO= new Intent(ActivityObjects.this,ActivityObjects.class);
            startActivity(intO);
        });
        btnSoundRec.setOnClickListener(v -> {
            Intent intSR= new Intent(ActivityObjects.this,ActivitySoundRec.class);
            startActivity(intSR);
        });
    }
}