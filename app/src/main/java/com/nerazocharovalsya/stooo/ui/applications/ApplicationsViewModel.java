package com.nerazocharovalsya.stooo.ui.applications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ApplicationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ApplicationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет штучка с оставленными заявками и их статусом");
    }

    public LiveData<String> getText() {
        return mText;
    }
}