package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    LinkedList<String> Moves = new LinkedList<String>();

    public void disable(View v) {
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled");
        Log.d("succes", "Button diabled");
    }

/*    public void change(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        if (tv.getText().toString().equals("1")) {
            tv.setText("2");
        }
        else {
            tv.setText("1");
        }
    }*/

    public void submit(View v){
        TextView t = findViewById(R.id.editText);
        String input = t.getText().toString();
        TextView tv = (TextView)findViewById(R.id.textView3);
        tv.setText(input);
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }

}
