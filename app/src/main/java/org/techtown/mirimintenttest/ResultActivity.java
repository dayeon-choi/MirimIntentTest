package org.techtown.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    int num1,num2, resultI;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent=getIntent();
        num1=Integer.parseInt(intent.getStringExtra("num1"));
        num2=Integer.parseInt(intent.getStringExtra("num2"));
        op=intent.getStringExtra("arithmetic");

        switch(op){
            case "+":
                resultI =num1+num2;
                break;
            case "-":
                resultI =num1-num2;
                break;
            case "*":
                resultI =num1*num2;
                break;
            case "/":
                resultI =num1/num2;
                break;
        }
        String result="="+resultI;
        textView=findViewById(R.id.result);
        textView.setText(result);

        button=findViewById(R.id.goback);
        button.setOnClickListener(gobackListener);
    }
    View.OnClickListener gobackListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}