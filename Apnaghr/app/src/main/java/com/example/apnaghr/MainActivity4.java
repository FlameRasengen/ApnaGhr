package com.example.apnaghr;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.apnaghr.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain4Binding binding;
    ImageButton button_leave, button_complaint,button_guest,button_reallocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main4);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        button_leave=(ImageButton)findViewById(R.id.imageButton3);
        button_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }

        });

        button_complaint=(ImageButton)findViewById(R.id.imageButton4);
        button_complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(intent);
            }

        });

        button_guest=(ImageButton)findViewById(R.id.imageButton6);
        button_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intent);
            }

        });

        button_reallocation=(ImageButton)findViewById(R.id.imageButton5);
        button_reallocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this,MainActivity9.class);
                startActivity(intent);
            }

        });

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main4);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}