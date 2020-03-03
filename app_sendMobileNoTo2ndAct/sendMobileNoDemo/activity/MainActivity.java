package com.example.sendmobilenodemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText edit_mobile;
    Long Mobile;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_mobile = findViewById(R.id.mobile_id);
        send = findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

    }
    private void sendData()
    {
        Mobile = Long.parseLong(edit_mobile.getText().toString());
        Intent i = new Intent(this,DisplayNo.class);
        i.putExtra("EXTRA_MOBILE",Mobile);
        startActivity(i);

    }
}
