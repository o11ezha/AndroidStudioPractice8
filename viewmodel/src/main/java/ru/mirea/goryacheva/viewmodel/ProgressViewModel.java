package ru.mirea.goryacheva.viewmodel;

import android.os.Handler;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgressViewModel extends ViewModel {

    private static MutableLiveData<Boolean> isShowProgress = new MutableLiveData<>();

    // Показать прогресс в течении 10 сек.
    void showProgress() {
        isShowProgress.postValue(true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isShowProgress.postValue(false);
            }
        }, 10000);
    }

    // Возвращает состояние прогресса
    MutableLiveData<Boolean> getProgressState() {
        return isShowProgress;
    }
}