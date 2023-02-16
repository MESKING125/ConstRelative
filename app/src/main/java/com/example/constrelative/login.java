package com.example.constrelative;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username, password;
    Button loginButton;
    TextView textView;
    String email, passwords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);
        textView = (TextView) findViewById(R.id.textView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if (username.equals("admin") &&
                        password.equals("admin")){



                    // to save our data with key and value.


                    startActivity(new Intent(login.this, MainActivity.class));
                    Toast.makeText(getApplicationContext(), "Login berhasil", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(getApplicationContext(), "Sukses Login", Toast.LENGTH_SHORT).show()
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
