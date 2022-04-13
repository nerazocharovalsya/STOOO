package com.nerazocharovalsya.stooo.ui.car;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет штучка для добавления машины и информации о ней");
    }

    public LiveData<String> getText() {
        return mText;
    }
}