package com.example.mvvmgithub.retrofit;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.example.mvvmgithub.api.ApiResponse;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

public class LiveDataCallAdapterFactory extends CallAdapter.Factory {
    private static final String TAG = LiveDataCallAdapterFactory.class.getSimpleName();

    @Nullable
    @Override
    public CallAdapter<?, ?> get(@Nullable Type returnType, @Nullable Annotation[] annotations,@Nullable Retrofit retrofit) {
        if (getRawType(returnType) != LiveData.class) {
            return null;
        }
        Type observableType = getParameterUpperBound(0, (ParameterizedType) returnType);
        Type rawType = getRawType(observableType);
        boolean isApiResponse = true;
        if (rawType != ApiResponse.class) {
            isApiResponse=false;
        }
        if (observableType instanceof ParameterizedType){
            throw new IllegalArgumentException("resource must be parameterized");
        }
        return new LiveDataCallAdapter<>(observableType, isApiResponse);
    }
}
