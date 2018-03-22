package com.abhinav.restowner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText name,password;
    String restName,restPassword;
    Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        proceed = (Button)findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restName=name.getText().toString();
                restPassword = password.getText().toString();
                String pass = restName+"123";
                if(restName.isEmpty() || restPassword.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please fill all the required details",Toast.LENGTH_SHORT).show();
                }
                else{
                    if((restName.equals(getString(R.string.rest_1)) || restName.equals( getString(R.string.rest_2)) || restName.equals(getString(R.string.rest_3))|| restName.equals(getString(R.string.rest_4)) || restName.equals(getString(R.string.rest_5)))&&(restPassword.equals(pass))){
                        name.setText("");
                        password.setText("");
                        startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    }
                    else{
                        Toast.makeText(LoginActivity.this,"Please enter the valid details",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
