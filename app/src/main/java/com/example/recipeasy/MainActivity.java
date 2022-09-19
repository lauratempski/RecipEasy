package com.example.recipeasy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();

    }

    public void initUI(){
        setContentView(R.layout.activity_main);

        nav = (BottomNavigationView) findViewById(R.id.navigation);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.homeIcon:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.favIcon:
                        Toast.makeText(MainActivity.this, "Favourites", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.addRecipeIcon:
                        Toast.makeText(MainActivity.this, "Add Recipe", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.listIcon:
                        startActivity(new Intent(MainActivity.this,ShoppigList.class));
                        return true;
                }
                return false;
            }
        });

    }
}