package com.example.mvvmgithub.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mvvmgithub.api.Api;
import com.example.mvvmgithub.api.ApiService;
import com.example.mvvmgithub.model.GetJoke;
import com.example.mvvmgithub.retrofit.Constants;


public class MainViewModel extends AndroidViewModel {
    private LiveData<GetJoke> liveDataGetJoke;

    public MainViewModel(@NonNull Application application) {
        super(application);
        liveDataGetJoke = ApiService.create(Constants.SERVER_URL, Api.class).getJokeText(1,1,"video");
    }

    public LiveData<GetJoke> getJokeLiveData() {
        return liveDataGetJoke;
    }
}
