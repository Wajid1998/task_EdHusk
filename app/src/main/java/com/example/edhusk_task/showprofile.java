package com.example.edhusk_task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.edhusk_task.ui.login.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

import static com.example.edhusk_task.R.id.updateprofile;

public class showprofile extends AppCompatActivity {
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprofile);
        

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(showprofile.this, LoginActivity.class));
        }

        return super.onOptionsItemSelected(item);

    }
}