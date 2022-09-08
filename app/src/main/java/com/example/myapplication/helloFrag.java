package com.example.myapplication;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class helloFrag extends Fragment {

    private HelloViewModel mViewModel;

    public static helloFrag newInstance() {
        return new helloFrag();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_hello, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(HelloViewModel.class);
        Button  btn1 = myView.findViewById(R.id.button2);
        EditText texts = myView.findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.setItem(texts.getText().toString());
                if (texts.getText().toString().compareTo("Tarnished") == 0){
                    Toast.makeText(requireContext(),"YOU DIED", Toast.LENGTH_SHORT).show();
                } else if (texts.getText().toString().compareTo("") == 0) {
                    Toast.makeText(requireContext(),"Hello World!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(requireContext(), "Hello " + texts.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                Log.d("mViewModel observed name ", texts.getText().toString());
            }
        });
        return myView;
} }

