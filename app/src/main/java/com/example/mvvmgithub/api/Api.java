package com.example.mvvmgithub.api;

import androidx.lifecycle.LiveData;

import com.example.mvvmgithub.entity.LoginEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("index/login")
    LiveData<LoginEntity> loginLiveData(
            @Query("username") String username,
            @Query("encryptPwd") String encryptPwd
    );

    @GET("index/login")
    Call<LoginEntity> loginObservableField(
            @Query("username") String username,
            @Query("encryptPwd") String encryptPwd
    );

}
