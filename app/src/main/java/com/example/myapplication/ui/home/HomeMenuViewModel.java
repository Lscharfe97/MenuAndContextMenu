package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeMenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Meine ToDos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}