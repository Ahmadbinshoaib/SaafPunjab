package com.example.saafpunjab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MarkAttendence extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView imageView;
    RecyclerView recyclerView;
    ArrayList<MenuStructure> contacts= new ArrayList<>();

    TabLayout tabLayout;
    ViewPager2 viewPager;
    MarkAttendenceFragments fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_attendence);

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


        //Tab Layout
        tabLayout= findViewById(R.id.tabLayout1);
        viewPager = findViewById(R.id.viewPager1);

        tabLayout.addTab(tabLayout.newTab().setText("SELF"));
        tabLayout.addTab(tabLayout.newTab().setText("WORKER"));

        FragmentManager fragmentManager= getSupportFragmentManager();
        fragmentAdapter = new MarkAttendenceFragments(fragmentManager, getLifecycle());
        viewPager.setAdapter(fragmentAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        MarkAttendence.closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


}