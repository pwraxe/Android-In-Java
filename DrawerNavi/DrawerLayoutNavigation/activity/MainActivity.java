package com.example.drawerlayoutnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
{
    DrawerLayout dl;
    Toolbar tb;
    ActionBarDrawerToggle adtb;
    Intent i;
    NavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dl = findViewById(R.id.drawer);
        tb = findViewById(R.id.toggle_bar);
        adtb = new ActionBarDrawerToggle(this,dl,tb,R.string.app_name,R.string.app_name);
        dl.addDrawerListener(adtb);
        adtb.syncState();
        nv = findViewById(R.id.naviView);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.dept :
                        i = new Intent(MainActivity.this,Department.class);
                        startActivity(i);
                        finish();
                        break;

                    case R.id.studSec :
                        i = new Intent(MainActivity.this,studentSection.class);
                        startActivity(i);
                        break;

                    case R.id.admission :
                        i = new Intent(MainActivity.this,Admission.class);
                        startActivity(i);
                        break;

                    case R.id.achive :
                        i = new Intent(MainActivity.this,Achivements.class);
                        startActivity(i);
                        break;

                    case R.id.alumini :
                        i = new Intent(MainActivity.this,Alumni.class);
                        startActivity(i);
                        break;

                    case R.id.about :
                        i = new Intent(MainActivity.this,AboutUs.class);
                        startActivity(i);
                        break;

                }

                return false;
            }
        });


    }
}
