package com.google.samples.apps.application220151118;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        Intent intent = null;
        try {
            intent = new Intent(MainActivity.this, Class.forName("com.quezx.analytics.ui.activity.LauncherActivity"));
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.e( "onCreate: ", ""+e);
        }

    }
}
