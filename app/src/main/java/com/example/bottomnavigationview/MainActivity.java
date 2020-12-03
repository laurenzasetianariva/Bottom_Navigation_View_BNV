package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    RecyclerView recyclerView;
//    List<Versions> versionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        recyclerView = findViewById(R.id. recyclerView);
//
//        initData();
//        setRecyclerView();


        BottomNavigationView navigationview = findViewById(R.id.navigation_menu);
        navigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.favorite){
                    //create three fragments
                    FavoriteFragment fragment = new FavoriteFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout, fragment);
                    fragmentTransaction.commit();
                }


                if(id == R.id.home){
                    //create three fragments
                    HomeFragment fragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout, fragment);
                    fragmentTransaction.commit();
                }


                if(id == R.id.profile){
                    //create three fragments
                    ProfileFragment fragment = new ProfileFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout, fragment);
                    fragmentTransaction.commit();
                }


                return true;
            }
        });

        navigationview.setSelectedItemId(R.id.home);
    }

//    private void setRecyclerView() {
//        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
//        recyclerView.setAdapter(versionsAdapter);
//        recyclerView.setHasFixedSize(true);
//
//    }
//
//    private void initData() {
//        versionsList = new ArrayList<>();
//        versionsList.add(new Versions("Android 10", "version 10", "Api Level 29", "Description"))
//
//    }

}