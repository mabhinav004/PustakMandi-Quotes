package com.ishika.pustakmandiquotes.ui.feed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class feedViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public feedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is feed fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}