package com.example.myapplication;

import android.util.Log;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

public class HelloViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    //maybe the id thing? no clue
    private MutableLiveData<String> item = new MutableLiveData<String>();

    LiveData<String> getItemLD() {
        if (item.getValue() == null) item.setValue("default");
        return item;
    }

    String getItem() {
        return item.getValue();
    }

    void setItem(String n) {
        Log.d("VM", "data is " + n);
        item.setValue(n);
    }
}