package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager;

        fragmentManager = getSupportFragmentManager();
        //setup the mainFragment to show.
        fragmentManager.beginTransaction().add(R.id.container, new helloFrag()).commit();
//        TextView myView;
//        myView = findViewById(R.id.textview);
//        myView.setText("hello ere?");
    }
}

//to get text entry and a button:
//find button is important
//for text entry, you want no text in a text box, but a hint giving, well, a hint

//how to do a view model
//how to do an on click listener (toast?)
