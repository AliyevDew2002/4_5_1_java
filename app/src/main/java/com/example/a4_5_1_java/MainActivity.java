package com.example.a4_5_1_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText id; EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        id=findViewById(R.id.et_user_id);
        pw=findViewById(R.id.et_user_pw);

        Button login=findViewById(R.id.b_login_id);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLogin();
            }
        });

    }
    void startLogin(){
        Intent intent=new Intent(this,MainActivity2.class);
        String Login="ID="+id.getText().toString()+", Password="+pw.getText().toString();
        intent.putExtra("login",Login);
        startActivity(intent);
    }
}