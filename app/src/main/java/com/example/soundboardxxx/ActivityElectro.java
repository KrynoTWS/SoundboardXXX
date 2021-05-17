package com.example.soundboardxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityElectro extends AppCompatActivity {
    public Button btnBasic=(Button)findViewById(R.id.btnBasic);
    public Button btnElectro=(Button)findViewById(R.id.BtnElectro);
    public Button btnAnimals=(Button)findViewById(R.id.btnAnimals);
    public Button btnObjects=(Button)findViewById(R.id.btnObjects);
    public Button btnSoundRec=(Button)findViewById(R.id.btnSoundRec);
    public Button btnE1=(Button)findViewById(R.id.btnE1);
    public Button btnE2=(Button)findViewById(R.id.btnE2);
    public Button btnE3=(Button)findViewById(R.id.btnE3);
    public Button btnE4=(Button)findViewById(R.id.btnE4);
    public Button btnE5=(Button)findViewById(R.id.btnE5);
    public Button btnE6=(Button)findViewById(R.id.btnE6);
    public Button btnE7=(Button)findViewById(R.id.btnE7);
    public Button btnE8=(Button)findViewById(R.id.btnE8);
    public Button btnE9=(Button)findViewById(R.id.btnE9);
    public Button btnE10=(Button)findViewById(R.id.btnE10);
    public Button btnE11=(Button)findViewById(R.id.btnE11);
    public Button btnE12=(Button)findViewById(R.id.btnE12);
    public Button btnE13=(Button)findViewById(R.id.btnE13);
    public Button btnE14=(Button)findViewById(R.id.btnE14);
    public Button btnE15=(Button)findViewById(R.id.btnE15);
    public Button btnE16=(Button)findViewById(R.id.btnE16);
    public Button btnE17=(Button)findViewById(R.id.btnE17);
    public Button btnE18=(Button)findViewById(R.id.btnE18);
    public Button btnE19=(Button)findViewById(R.id.btnE19);
    public Button btnE20=(Button)findViewById(R.id.btnE20);
    public Button btnE21=(Button)findViewById(R.id.btnE21);
    public Button btnE22=(Button)findViewById(R.id.btnE22);
    public Button btnE23=(Button)findViewById(R.id.btnE23);
    public Button btnE24=(Button)findViewById(R.id.btnE24);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electro);
        btnBasic.setOnClickListener(v -> {
            Intent intB= new Intent(ActivityElectro.this,MainActivity.class);
            startActivity(intB);
        });
        btnElectro.setOnClickListener(v -> {
            Intent intE= new Intent(ActivityElectro.this,ActivityElectro.class);
            startActivity(intE);
        });
        btnAnimals.setOnClickListener(v -> {
            Intent intA= new Intent(ActivityElectro.this,ActivityAnimals.class);
            startActivity(intA);
        });
        btnObjects.setOnClickListener(v -> {
            Intent intO= new Intent(ActivityElectro.this,ActivityObjects.class);
            startActivity(intO);
        });
        btnSoundRec.setOnClickListener(v -> {
            Intent intSR= new Intent(ActivityElectro.this,ActivitySoundRec.class);
            startActivity(intSR);
        });
    }
}