package com.example.healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgbtnSign = (ImageButton) this.findViewById(R.id.signup);
        imgbtnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Dangky.class);
                startActivity(intent);
            }
        });

        ImageButton imgbtnLog = (ImageButton) this.findViewById(R.id.login);
        imgbtnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đăng nhập thành công !!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
