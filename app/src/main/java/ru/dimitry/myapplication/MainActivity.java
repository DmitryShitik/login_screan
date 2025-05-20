package ru.dimitry.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText password;
    Button btnLogin;

    public void init(){
        login = findViewById(R.id.input_login);
        password = findViewById(R.id.input_pass);
        btnLogin = findViewById(R.id.btn_login);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnLogin.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("login",login.getText().toString());
            intent.putExtra("password",password.getText().toString());
            startActivity(intent);
        });
    }
}