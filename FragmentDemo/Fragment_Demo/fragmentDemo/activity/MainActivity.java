package com.example.fragmentdemo;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    Fragment frag ;
    CardView Computer,IT,Chemical,Electrical,Mechanical;

    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragment(v);

    }

    public void openFragment(View v)
    {


        Computer = findViewById(R.id.card_computer);
        IT = findViewById(R.id.card_it);
        Chemical = findViewById(R.id.card_chemical);
        Electrical = findViewById(R.id.card_electrical);
        Mechanical = findViewById(R.id.card_mechanical);

        if(v == Computer)
        {
            frag = new ComputerFrag();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == IT)
        {
            frag = new IT();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == Chemical)
        {
            frag = new Chemical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == Electrical)
        {
            frag = new Electrical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }
        if(v == Mechanical)
        {
            frag = new Mechanical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }



    }

}
