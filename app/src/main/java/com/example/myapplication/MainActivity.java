package com.example.myapplication;
import android.content.Intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.password);
        Info = (TextView) findViewById(R.id.Info);
        Login = (Button) findViewById(R.id.Login);
        Login.setOnClickListener(new View.onClickListener() {
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }

        private void validate(String Username, String Password)
        {
            if(Username == "Admin" && Password == "12345")
            {
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
            }
        }

    }

