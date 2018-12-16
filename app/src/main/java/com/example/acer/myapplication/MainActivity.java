package com.example.acer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.editText);
        tv = findViewById(R.id.textView);
        btn = findViewById(R.id.botton);

        View.OnClickListener onClickBtn=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(ed.getText());

                Toast tst = Toast.makeText(getApplicationContext(),ed.getText(),Toast.LENGTH_SHORT);

                tst.show();
            }

        };

        btn.setOnClickListener(onClickBtn);

    }

    protected void onStart(){
        super .onStart();

    }

    protected void onResume(){
        super .onResume();
    }

    protected void onPause(){
        super .onPause();
    }

    protected void onStop(){
        super .onStop();
    }

    protected void onDestroy(){
        super .onDestroy();
    }


}
