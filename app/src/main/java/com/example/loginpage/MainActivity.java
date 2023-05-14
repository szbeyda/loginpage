package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout login_panel;
    Button btn;
    EditText textUser, textPsw;
    String userId, userPsw, trueUser="Sahra", truePsw="1234";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_panel=findViewById(R.id.login_panel);
        btn=findViewById(R.id.btnlogin);
        textUser=findViewById(R.id.editTextUser);
        textPsw=findViewById(R.id.editTextPssw);

        Animation anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.loginpanel);
        login_panel.startAnimation(anim1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userId= textUser.getText().toString();
                userPsw= textPsw.getText().toString();
                if (!TextUtils.isEmpty(userId) && !TextUtils.isEmpty(userPsw) ){
                    if (userId.equals(trueUser) && userPsw.equals(truePsw)){
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra("intentUId", userId);//aktiviteler arası veri alış-verişi
                        startActivity(intent);

                    }else
                        Toast.makeText(MainActivity.this, "You entered the wrong username or password", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "username or password cannot be empty", Toast.LENGTH_SHORT).show();
                
            }
        }
        );

    }
}