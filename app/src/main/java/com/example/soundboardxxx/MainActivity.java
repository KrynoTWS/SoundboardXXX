package com.example.soundboardxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnBasic=(Button)findViewById(R.id.btnBasic);
    public Button btnElectro=(Button)findViewById(R.id.BtnElectro);
    public Button btnAnimals=(Button)findViewById(R.id.btnAnimals);
    public Button btnObjects=(Button)findViewById(R.id.btnObjects);
    public Button btnSoundRec=(Button)findViewById(R.id.btnSoundRec);
    public Button btn1=(Button)findViewById(R.id.btn1);
    public Button btn2=(Button)findViewById(R.id.btn2);
    public Button btn3=(Button)findViewById(R.id.btn3);
    public Button btn4=(Button)findViewById(R.id.btn4);
    public Button btn5=(Button)findViewById(R.id.btn5);
    public Button btn6=(Button)findViewById(R.id.btn6);
    public Button btn7=(Button)findViewById(R.id.btn7);
    public Button btn8=(Button)findViewById(R.id.btn8);
    public Button btn9=(Button)findViewById(R.id.btn9);
    public Button btn10=(Button)findViewById(R.id.btn10);
    public Button btn11=(Button)findViewById(R.id.btn11);
    public Button btn12=(Button)findViewById(R.id.btn12);
    public Button btn13=(Button)findViewById(R.id.btn13);
    public Button btn14=(Button)findViewById(R.id.btn14);
    public Button btn15=(Button)findViewById(R.id.btn15);
    public Button btn16=(Button)findViewById(R.id.btn16);
    public Button btn17=(Button)findViewById(R.id.btn17);
    public Button btn18=(Button)findViewById(R.id.btn18);
    public Button btn19=(Button)findViewById(R.id.btn19);
    public Button btn20=(Button)findViewById(R.id.btn20);
    public Button btn21=(Button)findViewById(R.id.btn21);
    public Button btn22=(Button)findViewById(R.id.btn22);
    public Button btn23=(Button)findViewById(R.id.btn23);
    public Button btn24=(Button)findViewById(R.id.btn24);
    public MediaPlayer mp1=MediaPlayer.create(MainActivity.this,R.raw.B_AIRHORN);
    public MediaPlayer mp2=MediaPlayer.create(MainActivity.this,R.raw.B_BRUH);
    public MediaPlayer mp3=MediaPlayer.create(MainActivity.this,R.raw.B_WOW);
    public MediaPlayer mp4=MediaPlayer.create(MainActivity.this,R.raw.B_WASTED);
    public MediaPlayer mp5=MediaPlayer.create(MainActivity.this,R.raw.B_PLAYINGMINECRAFT);
    public MediaPlayer mp6=MediaPlayer.create(MainActivity.this,R.raw.B_OOF);
    public MediaPlayer mp7=MediaPlayer.create(MainActivity.this,R.raw.B_MONKE);
    public MediaPlayer mp8=MediaPlayer.create(MainActivity.this,R.raw.B_CantTouchThis);
    public MediaPlayer mp9=MediaPlayer.create(MainActivity.this,R.raw.B_UHOHSTINKY);
    public MediaPlayer mp10=MediaPlayer.create(MainActivity.this,R.raw.B_DADDY_YES);
    public MediaPlayer mp11=MediaPlayer.create(MainActivity.this,R.raw.B_NATHAN_KNEW);
    public MediaPlayer mp12=MediaPlayer.create(MainActivity.this,R.raw.B_SUPRISE_MOTHEFUCKA);
    public MediaPlayer mp13=MediaPlayer.create(MainActivity.this,R.raw.B_ItsFreeRealEstate);
    public MediaPlayer mp14=MediaPlayer.create(MainActivity.this,R.raw.B_DEUSVOLT);
    public MediaPlayer mp15=MediaPlayer.create(MainActivity.this,R.raw.B_DEEZNUTS);
    public MediaPlayer mp16=MediaPlayer.create(MainActivity.this,R.raw.B_MAN_SCREAMING);
    public MediaPlayer mp17=MediaPlayer.create(MainActivity.this,R.raw.B_LnO_Dun_Dun);
    public MediaPlayer mp18=MediaPlayer.create(MainActivity.this,R.raw.B_IlluminatiConfirmed);
    public MediaPlayer mp19=MediaPlayer.create(MainActivity.this,R.raw.B_HA_GAAAAAAAAAAAAY);
    public MediaPlayer mp20=MediaPlayer.create(MainActivity.this,R.raw.B_CHOMP);
    public MediaPlayer mp21=MediaPlayer.create(MainActivity.this,R.raw.B_FART);
    public MediaPlayer mp22=MediaPlayer.create(MainActivity.this,R.raw.B_DRUMS);
    public MediaPlayer mp23=MediaPlayer.create(MainActivity.this,R.raw.B_LEEROYJENKINS);
    public MediaPlayer mp24=MediaPlayer.create(MainActivity.this,R.raw.B_DamnDaniel);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBasic.setOnClickListener(v -> {
            Intent intB= new Intent(MainActivity.this,MainActivity.class);
            startActivity(intB);
        });
        btnElectro.setOnClickListener(v -> {
            Intent intE= new Intent(MainActivity.this,ActivityElectro.class);
            startActivity(intE);
        });
        btnAnimals.setOnClickListener(v -> {
            Intent intA= new Intent(MainActivity.this,ActivityAnimals.class);
            startActivity(intA);
        });
        btnObjects.setOnClickListener(v -> {
            Intent intO= new Intent(MainActivity.this,ActivityObjects.class);
            startActivity(intO);
        });
        btnSoundRec.setOnClickListener(v -> {
            Intent intSR= new Intent(MainActivity.this,ActivitySoundRec.class);
            startActivity(intSR);
        });
        btn1.setOnClickListener(v -> mp1.start());
        btn2.setOnClickListener(v -> mp2.start());
        btn3.setOnClickListener(v -> mp3.start());
        btn4.setOnClickListener(v -> mp4.start());
        btn5.setOnClickListener(v -> mp5.start());
        btn6.setOnClickListener(v -> mp6.start());
        btn7.setOnClickListener(v -> mp7.start());
        btn8.setOnClickListener(v -> mp8.start());
        btn9.setOnClickListener(v -> mp9.start());
        btn10.setOnClickListener(v -> mp10.start());
        btn11.setOnClickListener(v -> mp11.start());
        btn12.setOnClickListener(v -> mp12.start());
        btn13.setOnClickListener(v -> mp13.start());
        btn14.setOnClickListener(v -> mp14.start());
        btn15.setOnClickListener(v -> mp15.start());
        btn16.setOnClickListener(v -> mp16.start());
        btn17.setOnClickListener(v -> mp17.start());
        btn18.setOnClickListener(v -> mp18.start());
        btn19.setOnClickListener(v -> mp19.start());
        btn20.setOnClickListener(v -> mp20.start());
        btn21.setOnClickListener(v -> mp21.start());
        btn22.setOnClickListener(v -> mp22.start());
        btn23.setOnClickListener(v -> mp23.start());
        btn24.setOnClickListener(v -> mp24.start());
    }
}