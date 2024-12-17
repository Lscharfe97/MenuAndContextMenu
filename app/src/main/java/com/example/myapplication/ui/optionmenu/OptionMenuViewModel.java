package com.example.myapplication.ui.optionmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OptionMenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OptionMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Das ist das Anpassen des Textes. Wenn ich super viel schreiben sollte, sollte es im besten Fall nicht scheiße aussehen. \n Mal schauen was wird. Was wird." +
                "/n" +
                "\n" +
                "" +
                "Wie läufts mit line Breaks? ");



    }

    public LiveData<String> getText() {
        return mText;
    }
}