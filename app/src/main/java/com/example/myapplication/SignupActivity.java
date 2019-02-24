package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    private EditText username_S;
    private EditText password_S;
    private EditText email_S;
    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username_S = (EditText) findViewById(R.id.username);
        password_S = (EditText) findViewById(R.id.password);
        email_S = (EditText) findViewById(R.id.email_S);
        create = (Button) findViewById(R.id.Create);

        create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

    }
}
