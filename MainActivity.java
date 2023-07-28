package com.example.dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_FIRST_TIME = "first_time";
    public SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        boolean isFirstTime = sharedPreferences.getBoolean(KEY_FIRST_TIME, true);

        if (isFirstTime) {

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(KEY_FIRST_TIME, false);
            editor.apply();

            public void exporsitor(View) v) {
                Intent Expositor = new Intent(this, MainActivity2.class);
                startActivity(Expositor);


                public void asistente (View) v) {
                    Intent Asistente = new Intent(this, MainActivity3.class);
                    startActivity(Asistente);
                }
            }
        }
    }
}

