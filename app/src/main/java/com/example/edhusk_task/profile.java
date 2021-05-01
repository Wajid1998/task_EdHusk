package com.example.edhusk_task;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.widget.Button;

import com.example.edhusk_task.ui.login.LoginActivity;
import com.example.edhusk_task.ui.login.LoginViewModel;

import static com.example.edhusk_task.R.id.updateprofile;

public class profile extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    UpdateMe updateMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        @SuppressLint("WrongViewCast") UpdateMe mUpdateMe =findViewById(updateprofile);
        mUpdateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, showprofile.class));

            }

        });
    }
}