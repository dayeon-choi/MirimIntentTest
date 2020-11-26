package org.techtown.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Button btn_compute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_compute=findViewById(R.id.go_computation);
        btn_compute.setOnClickListener(goButtonClickListener);
    }
    View.OnClickListener goButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            //intent.putExtra();
        }
    };
}