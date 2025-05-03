package ru.dimitry.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView messageText;
    Button btnBack;
    public void init(){
        messageText = findViewById(R.id.label_receive_date);
        btnBack = findViewById(R.id.btn_back);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();

    }
}