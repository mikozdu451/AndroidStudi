package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer test = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void belkot(View v){
        stopSound();
        Random rand = new Random();
        int setText = rand.nextInt(5);
        switch (setText){
            case 0:
                test = MediaPlayer.create(this, R.raw.milijeden);
                test.start();
                break;
            case 1:
                test = MediaPlayer.create(this,R.raw.milidwa);
                test.start();
                break;
            case 2:
                test = MediaPlayer.create(this,R.raw.militrzy);
                test.start();
                break;
            case 3:
                test = MediaPlayer.create(this,R.raw.milicztery);
                test.start();
                break;
            case 4:
                test = MediaPlayer.create(this,R.raw.milipienc);
                test.start();
                break;

        }
    }

    public void playSound(View v) {
        stopSound();
        switch (v.getId()) {
            case R.id.siema:
                test = MediaPlayer.create(this,R.raw.siema);
                test.start();
                break;
            case R.id.energy:
                test = MediaPlayer.create(this, R.raw.energy);
                test.start();
                break;
            case R.id.sprawa:
                test = MediaPlayer.create(this, R.raw.sprawa);
                test.start();
                break;
            case R.id.wiesz:
                test = MediaPlayer.create(this, R.raw.wieszoco);
                test.start();
                break;
            case R.id.opor:
                test = MediaPlayer.create(this, R.raw.opor);
                test.start();
                break;
            case R.id.nogajeden:
                test = MediaPlayer.create(this, R.raw.nogajeden);
                test.start();
                break;
            case R.id.nogadwa:
                test = MediaPlayer.create(this, R.raw.nogadwa);
                test.start();
                break;
            case R.id.nogatrzy:
                test = MediaPlayer.create(this, R.raw.nogatrzy);
                test.start();
                break;
            case R.id.nogacztery:
                test = MediaPlayer.create(this, R.raw.nogacztery);
                test.start();
                break;
            case R.id.szybciej:
                test = MediaPlayer.create(this, R.raw.szybciej);
                test.start();
                break;
            case R.id.wleczecie:
                test = MediaPlayer.create(this, R.raw.wleczecie);
                test.start();
                break;
            case R.id.niemoge:
                test = MediaPlayer.create(this, R.raw.niemoge);
                test.start();
                break;
            case R.id.panie:
                test = MediaPlayer.create(this, R.raw.panie);
                test.start();
                break;
            case R.id.droid:
                test = MediaPlayer.create(this, R.raw.droid);
                test.start();
                break;
            case R.id.niechce:
                test = MediaPlayer.create(this, R.raw.niechce);
                test.start();
                break;
            case R.id.bary:
                test = MediaPlayer.create(this, R.raw.bary);
                test.start();
                break;
            case R.id.pieknie:
                test = MediaPlayer.create(this, R.raw.pienknie);
                test.start();
                break;
            case R.id.git:
                test = MediaPlayer.create(this, R.raw.git);
                test.start();
                break;
            case R.id.racja:
                test = MediaPlayer.create(this, R.raw.racja);
                test.start();
                break;
            case R.id.elo:
                test = MediaPlayer.create(this, R.raw.elo);
                test.start();
                break;
            case R.id.lej:
                test = MediaPlayer.create(this, R.raw.lej);
                test.start();
                break;
            case R.id.frytki:
                test = MediaPlayer.create(this, R.raw.frytki);
                test.start();
                break;
            case R.id.slodki:
                test = MediaPlayer.create(this, R.raw.slodki);
                test.start();
                break;
            case R.id.zkad:
                test = MediaPlayer.create(this, R.raw.zkad);
                test.start();
                break;
            case R.id.tak:
                test = MediaPlayer.create(this, R.raw.tak);
                test.start();
                break;
            case R.id.nie:
                test = MediaPlayer.create(this, R.raw.nie);
                test.start();
                break;
            case R.id.definitywnie:
                test = MediaPlayer.create(this, R.raw.definitywnie);
                test.start();
                break;
            case R.id.klika:
                test = MediaPlayer.create(this, R.raw.klika);
                test.start();
                break;
            case R.id.siec:
                test = MediaPlayer.create(this, R.raw.sieci);
                test.start();
                break;
            case R.id.nuda:
                test = MediaPlayer.create(this, R.raw.nuda);
                test.start();
                break;
            case R.id.lapska:
                test = MediaPlayer.create(this, R.raw.lapska);
                test.start();
                break;
            case R.id.wyklad:
                test = MediaPlayer.create(this, R.raw.wyklad);
                test.start();
                break;
            case R.id.ocet:
                test = MediaPlayer.create(this, R.raw.ocet);
                test.start();
                break;
            case R.id.textView:
                test = MediaPlayer.create(this, R.raw.tekst);
                test.start();
                break;

        }

    }
    public void stopSound() {
        test.stop();

    }
}
