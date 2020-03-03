package com.example.sendmobilenodemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayNo extends AppCompatActivity
{

    TextView setmobile;
    Long MobileNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_no);

        setmobile = findViewById(R.id.display_text);
        Intent i = getIntent();
        MobileNo = i.getLongExtra("EXTRA_MOBILE",0);
        setmobile.setText(MobileNo+" ");



    }
}
