package com.example.mvvmgithub.api;

import androidx.lifecycle.LiveData;

import com.example.mvvmgithub.model.GetJoke;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("getJoke")
    LiveData<GetJoke> getJokeText(
            @Query("page") int page,
            @Query("count") int count,
            @Query("type") String type
    );
}
