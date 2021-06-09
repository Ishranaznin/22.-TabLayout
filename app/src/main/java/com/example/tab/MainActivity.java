package com.example.tab;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.tab.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    EditText serch;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        serch=findViewById(R.id.searchEdit);
drawerLayout=findViewById(R.id.drawer_layout);
navigationView=findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_message:
                    Toast.makeText(getApplicationContext(),"Message",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_chat:
                    Toast.makeText(getApplicationContext(),"Chat",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_profile:
                    Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_send:
                    Toast.makeText(getApplicationContext(),"Send",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_share:
                    Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_SHORT).show();
                    return true;
            }
            return true;
        }
    });

    }







}