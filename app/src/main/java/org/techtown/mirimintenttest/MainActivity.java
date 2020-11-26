package org.techtown.mirimintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Button btn_compute;
    EditText edit1,edit2;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.edit_1);
        edit2=findViewById(R.id.edit_2);

        radioGroup=findViewById(R.id.arithmetic);

        btn_compute=findViewById(R.id.go_computation);
        btn_compute.setOnClickListener(goButtonClickListener);
    }
    View.OnClickListener goButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("num1",edit1.getText().toString());
            intent.putExtra("num2",edit2.getText().toString());

            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.check_1:// +
                    intent.putExtra("arithmetic","+");
                    break;
                case R.id.check_2:// -
                    intent.putExtra("arithmetic","-");
                    break;
                case R.id.check_3:// *
                    intent.putExtra("arithmetic","*");
                    break;
                case R.id.check_4:// /
                    intent.putExtra("arithmetic","/");
            }
            startActivity(intent);
        }
    };
}