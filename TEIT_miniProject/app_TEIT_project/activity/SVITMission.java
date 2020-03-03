package com.example.teit_miniproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class SVITMission extends AppCompatActivity {
    Toolbar mission_tool;
    NavigationView mission_navi;
    DrawerLayout mission_drawer;
    ActionBarDrawerToggle mission_abdt;
    Intent i;
    TextView ClgNameMission;
    ImageButton facebook,googlePlus,twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svit__mission);
        facebook = findViewById(R.id.facebook_id);
        googlePlus = findViewById(R.id.google_id);
        twitter = findViewById(R.id.twitter_id);

        mission_tool = findViewById(R.id.mission_toolbar);
        mission_navi = findViewById(R.id.mission_navigation);
        mission_drawer = findViewById(R.id.mission_drawer);
        setSupportActionBar(mission_tool);
        ClgNameMission = findViewById(R.id.clgNameMission_id);
        ClgNameMission.setSelected(true);
        mission_abdt = new ActionBarDrawerToggle(this,mission_drawer,mission_tool,R.string.open,R.string.close);
        mission_drawer.addDrawerListener(mission_abdt);
        mission_abdt.syncState();
        mission_navi.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.home_screen:
                        i = new Intent(SVITMission.this,MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.department:
                        i = new Intent(SVITMission.this,Departments.class);
                        startActivity(i);
                        break;
                    case R.id.registration:
                        i = new Intent(SVITMission.this,Registration.class);
                        startActivity(i);
                        break;
                    case R.id.about:
                        i = new Intent(SVITMission.this,AboutUs.class);
                        startActivity(i);
                        break;
                    case R.id.reach_us:
                        i = new Intent(SVITMission.this,ReachUs.class);
                        startActivity(i);
                        break;
                    case R.id.login_id:
                        i = new Intent(SVITMission.this,LoginPage.class);
                        startActivity(i);
                        break;

                }

                return false;
            }
        });

        //ImageButton facebook,googlePlus,twitter;
        //facebook = findViewById(R.id.facebook_id);
        //googlePlus = findViewById(R.id.google_id);
        //twitter = findViewById(R.id.twitter_id);


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
