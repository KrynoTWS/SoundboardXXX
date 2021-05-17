package com.example.soundboardxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivitySoundRec extends AppCompatActivity {
    public Button btnBasic=(Button)findViewById(R.id.btnBasic);
    public Button btnElectro=(Button)findViewById(R.id.BtnElectro);
    public Button btnAnimals=(Button)findViewById(R.id.btnAnimals);
    public Button btnObjects=(Button)findViewById(R.id.btnObjects);
    public Button btnSoundRec=(Button)findViewById(R.id.btnSoundRec);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_rec);
        btnBasic.setOnClickListener(v -> {
            Intent intB= new Intent(ActivitySoundRec.this,MainActivity.class);
            startActivity(intB);
        });
        btnElectro.setOnClickListener(v -> {
            Intent intE= new Intent(ActivitySoundRec.this,ActivityElectro.class);
            startActivity(intE);
        });
        btnAnimals.setOnClickListener(v -> {
            Intent intA= new Intent(ActivitySoundRec.this,ActivityAnimals.class);
            startActivity(intA);
        });
        btnObjects.setOnClickListener(v -> {
            Intent intO= new Intent(ActivitySoundRec.this,ActivityObjects.class);
            startActivity(intO);
        });
        btnSoundRec.setOnClickListener(v -> {
            Intent intSR= new Intent(ActivitySoundRec.this,ActivitySoundRec.class);
            startActivity(intSR);
        });
    }
}