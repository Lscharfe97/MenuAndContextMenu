package com.example.myapplication.ui.contextmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContextMenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContextMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hier gibt es Infos zum Kontextmenü");
    }

    public LiveData<String> getText() {
        return mText;
    }
}