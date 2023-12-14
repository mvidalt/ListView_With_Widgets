package com.example.listview_with_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List hours = new List();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, hours)
                .commit();
    }


}