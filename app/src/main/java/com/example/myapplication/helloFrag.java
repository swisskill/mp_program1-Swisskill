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
//        TextView tv1 = null;
//        mViewModel.getItemLD().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                tv1.setText("Parameter1: " +s);
//            }
//        });
        EditText texts = myView.findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                hey maybe get the data
                mViewModel.setItem(texts.getText().toString());
                if (texts.getText().toString().compareTo("Tarnished") == 0){
                    Toast.makeText(requireContext(),"YOU DIED", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(requireContext(), "Hello " + texts.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                Log.d("mViewModel observed name ", texts.getText().toString());
            }
        });
        return myView;
} }


//hey when you're in a frag, do the require context. In main activity, do getApplicationContext
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(HelloViewModel.class);
//        // TODO: Use the ViewModel
//    }
//three methods. prob use