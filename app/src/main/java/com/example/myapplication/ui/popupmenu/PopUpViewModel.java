package com.example.myapplication.ui.popupmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PopUpViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PopUpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hier gibt es Infos zum Pop-Up Menü");
    }

    public LiveData<String> getText() {
        return mText;
    }
}