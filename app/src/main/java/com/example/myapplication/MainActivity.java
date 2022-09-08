package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
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
        HelloViewModel mViewModel;

        mViewModel = new ViewModelProvider(this).get(HelloViewModel.class);
        mViewModel.getItemLD().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String v) {
//                tv1.setText("Parameter1: " +v);
                Log.d("mViewModel observed name ", v);
            }

        });;
        //you need to declare and get viewmodel running
        //set up an observer as well



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
