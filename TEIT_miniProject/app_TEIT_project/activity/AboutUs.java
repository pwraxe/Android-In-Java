package com.example.teit_miniproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class AboutUs extends AppCompatActivity {
    Toolbar about_tool;
    NavigationView about_navi;
    DrawerLayout about_drawer;
    ActionBarDrawerToggle about_abdt;
    Intent i;
    ImageButton facebook,googlePlus,twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        facebook = findViewById(R.id.facebook_id);
        googlePlus = findViewById(R.id.google_id);
        twitter = findViewById(R.id.twitter_id);

        about_tool = findViewById(R.id.about_toolbar);
        about_navi = findViewById(R.id.about_navigation);
        about_drawer = findViewById(R.id.about_drawer);
        setSupportActionBar(about_tool);
        about_abdt = new ActionBarDrawerToggle(this,about_drawer,about_tool,R.string.open,R.string.close);
        about_drawer.addDrawerListener(about_abdt);
        about_abdt.syncState();
        about_navi.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.home_screen:
                        i = new Intent(AboutUs.this,MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.department:
                        i = new Intent(AboutUs.this,Departments.class);
                        startActivity(i);
                        break;
                    case R.id.registration:
                        i = new Intent(AboutUs.this,Registration.class);
                        startActivity(i);
                        break;
                    case R.id.mission:
                        i = new Intent(AboutUs.this,SVITMission.class);
                        startActivity(i);
                        break;
                    case R.id.reach_us:
                        i = new Intent(AboutUs.this,ReachUs.class);
                        startActivity(i);
                        break;
                    case R.id.login_id:
                        i = new Intent(AboutUs.this,LoginPage.class);
                        startActivity(i);
                        break;

                }

                return false;
            }
        });






        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fb_url = "https://www.facebook.com/SVITSinnar/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(fb_url));
                startActivity(i);
            }
        });

        googlePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googlePlus_url = "https://plus.google.com/u/0/110571980129784584868";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(googlePlus_url));
                startActivity(i);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String twitter_url ="https://twitter.com/SVIT_sinnar";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(twitter_url));
                startActivity(i);
            }
        });

    }
}
