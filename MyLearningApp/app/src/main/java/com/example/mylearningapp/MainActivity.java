package com.example.mylearningapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;
    FirebaseUser user;
    NavigationView navigationView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();


        drawerLayout = findViewById(R.id.my_drawer);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        navController = Navigation.findNavController(this, R.id.main_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);

    }

    @Override
    protected void onStart() {
        super.onStart();
        user = FirebaseAuth.getInstance().getCurrentUser();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(toggle.onOptionsItemSelected(item)) return true;
        if(item.getItemId()==R.id.profile){
            if(user!=null){
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }else {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.pdf) {
            Toast.makeText(this, "pdf", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://learntocodewith.me/posts/programming-books/"));
            startActivity(i);
        } else if (menuItem.getItemId() == R.id.share) {
            Intent shareIntent = new Intent();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("Text/Plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "CodeVerse");
//            intent.putExtra(Intent.EXTRA_TEXT, body);
            startActivity(Intent.createChooser(intent, "Share via"));
//            shareIntent.setAction(Intent.ACTION_SEND);
//            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this app: [Codeverse]");
//            shareIntent.setType("text/plain");
//
//            Intent chooser = Intent.createChooser(shareIntent, "Share via");
        } else if (menuItem.getItemId() == R.id.about) {
            // Code to handle the "About" item selection
            Intent intent = new Intent(MainActivity.this, JsonMain.class);
            startActivity(intent);
            Toast.makeText(this, "Documentation", Toast.LENGTH_SHORT).show();
        }
        else if (menuItem.getItemId() == R.id.cmp) {
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.programiz.com/python-programming/online-compiler"));
            startActivity(i);

        }
        else if (menuItem.getItemId() == R.id.gfg) {
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.geeksforgeeks.org"));
            startActivity(i);

        }else if (menuItem.getItemId() == R.id.home) {
            // Code to handle the "About" item selection
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if (menuItem.getItemId() == R.id.pro) {
            if(user!=null){
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }else {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        }
        else if (menuItem.getItemId() == R.id.login) {
            // Code to handle the "About" item selection
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        else if (menuItem.getItemId() == R.id.logout) {
            Toast.makeText(this, "Exited App Successfully", Toast.LENGTH_SHORT).show();
            finishAffinity();
            return true;
        }
        return true;
    }
}