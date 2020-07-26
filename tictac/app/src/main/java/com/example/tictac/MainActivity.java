package com.example.tictac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean play = true;
    int count = 0;
    LinkedList<String> Moves = new LinkedList<String>();
    public void create_list() {
        Moves.add("1");
        Moves.add("2");
        Moves.add("3");
        Moves.add("4");
        Moves.add("5");
        Moves.add("6");
        Moves.add("7");
        Moves.add("8");
        Moves.add("9");
    }
    HashMap<String, String> tileDic = new HashMap<>();
    public void create_dic(){
        tileDic.put("1", "-");
        tileDic.put("2", "-");
        tileDic.put("3", "-");
        tileDic.put("4", "-");
        tileDic.put("5", "-");
        tileDic.put("6", "-");
        tileDic.put("7", "-");
        tileDic.put("8", "-");
        tileDic.put("9", "-");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create_list();
        create_dic();
    }

    public void finish(){
        for (int i = 1; i < 10; i++) {
            String name = "button" + i;
            int id = getResources().getIdentifier(name, "id",  getPackageName());
            findViewById(id).setEnabled(false);
        }
    }

    public void deleteItem(String elem) {
        Moves.remove(elem);
        if (Moves.isEmpty()){ play = false; }

        if (!play) {
            TextView outcome = findViewById(R.id.textView2);
            outcome.setText("No winner!");
        }
    }

    public void check () {
        TextView outcome = findViewById(R.id.textView2);
        if (tileDic.get("1").equals(tileDic.get("2")) && tileDic.get("1").equals(tileDic.get("3")) && !tileDic.get("1").equals("-")) {
            play = false;
            if (tileDic.get("1").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("1").equals("O")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("4").equals(tileDic.get("5")) && tileDic.get("4").equals(tileDic.get("6")) && !tileDic.get("4").equals("-")) {
            play = false;
            if (tileDic.get("4").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("4").equals("O")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("7").equals(tileDic.get("8")) && tileDic.get("7").equals(tileDic.get("9")) && !tileDic.get("7").equals("-")) {
            play = false;
            if (tileDic.get("7").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("7").equals("O")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("1").equals(tileDic.get("4")) && tileDic.get("1").equals(tileDic.get("7")) && !tileDic.get("1").equals("-")) {
            play = false;
            if (tileDic.get("4").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("4").equals("O")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("2").equals(tileDic.get("5")) && tileDic.get("2").equals(tileDic.get("8")) && !tileDic.get("2").equals("-")) {
            play = false;
            if (tileDic.get("2").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("2").equals("o")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("3").equals(tileDic.get("6")) && tileDic.get("3").equals(tileDic.get("9")) && !tileDic.get("3").equals("-")) {
            play = false;
            if (tileDic.get("3").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("3").equals("O")){ outcome.setText("0 wins"); }
        }
        else if (tileDic.get("1").equals(tileDic.get("5")) && tileDic.get("1").equals(tileDic.get("9")) && !tileDic.get("1").equals("-")) {
            play = false;
            if (tileDic.get("1").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("1").equals("O")){ outcome.setText("O wins"); }
        }
        else if (tileDic.get("7").equals(tileDic.get("5")) && tileDic.get("3").equals(tileDic.get("7")) && !tileDic.get("3").equals("-")) {
            play = false;
            if (tileDic.get("7").equals("X")){ outcome.setText("X wins"); }
            else if (tileDic.get("7").equals("O")){ outcome.setText("O wins"); }
        }

        if (!play) {
            Log.d("processCat", "CALLING END");
            finish();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void setO () {
        if (!Moves.isEmpty()) {
            Random rand = new Random();
            String tileNum = Moves.get(rand.nextInt(Moves.size()));
            tileDic.replace(tileNum, "-", "O");
            String buttonToO = "button" + tileNum;
            int ident = getResources().getIdentifier(buttonToO, "id", getPackageName());
            Button b = findViewById(ident);
            Moves.remove(tileNum);
            b.setEnabled(false);
            b.setText("O");
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void press(View v) {
        v.setEnabled(false);
        String toDelete = "";
        switch (v.getId()) {
            case R.id.button1:
                toDelete = "1";
                break;
            case R.id.button2:
                toDelete = "2";
                break;
            case R.id.button3:
                toDelete = "3";
                break;
            case R.id.button4:
                toDelete = "4";
                break;
            case R.id.button5:
                toDelete = "5";
                break;
            case R.id.button6:
                toDelete = "6";
                break;
            case R.id.button7:
                toDelete = "7";
                break;
            case R.id.button8:
                toDelete = "8";
                break;
            case R.id.button9:
                toDelete = "9";
                break;
        }
        deleteItem(toDelete);
        Log.d("processCat", toDelete);
        tileDic.replace(toDelete, "-", "X");
        Button b = (Button) v;
        b.setText("X");
        count++;
        if (count >= 3){ check(); }
        setO();

        if (count >= 3){ check(); }
        Log.d("processCat", "Set O");

    }
}
