package com.example.saafpunjab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView imageView, empReg, markAtt, leaveform, containerTagging, reports, singAtt;
    RecyclerView recyclerView;
    TextView textView;
    ArrayList<MenuStructure> contacts= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout= findViewById(R.id.drawer_layout);
        imageView= findViewById(R.id.btnmenu);
        recyclerView= findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contacts.add(new MenuStructure("Bilal Ahmad", "354778c8", "Arfa Kareem", "Morning"));
        MenuRecyclerAdapter adapter = new MenuRecyclerAdapter(this, contacts);
        recyclerView.setAdapter(adapter);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        empReg= findViewById(R.id.empReg);
        empReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, EMPRegistration.class);
                startActivity(intent);
            }
        });

        markAtt= findViewById(R.id.markAtt);
        markAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MarkAttendence.class);
                startActivity(intent);
            }
        });

        leaveform= findViewById(R.id.leaveform);
        leaveform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, LeaveForm.class);
                startActivity(intent);
            }
        });

        containerTagging= findViewById(R.id.containerTagging);
        containerTagging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, ContainerTagging.class);
                startActivity(intent);
            }
        });


        reports= findViewById(R.id.reports);
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Reports1.class);
                startActivity(intent);
            }
        });

        textView= findViewById(R.id.attendence);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, ReportsAttendence.class);
                startActivity(intent);
            }
        });

        singAtt= findViewById(R.id.singleAt);
        singAtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, SingleAttendence.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
}