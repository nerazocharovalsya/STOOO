package com.nerazocharovalsya.stooo.ui.sto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет штучка для выбора СТО и записи на него");
    }

    public LiveData<String> getText() {
        return mText;
    }
}