package com.example.mvvmgithub.viewmodel;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmgithub.api.Api;
import com.example.mvvmgithub.api.ApiService;
import com.example.mvvmgithub.entity.LoginEntity;
import com.example.mvvmgithub.model.LiveDataLoginModel;
import com.tamsiree.rxkit.RxTool;

/**
 * @Author zcy
 * @CreateDate: 2020/10/22
 */
public class LiveDataViewModel extends ViewModel {
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> encryptPwd = new MutableLiveData<>();

    private MutableLiveData<LiveDataLoginModel> loginModelMutableLiveData;

    public MutableLiveData<LiveDataLoginModel> getLoginModelMutableLiveData() {
        if (loginModelMutableLiveData == null) {
            loginModelMutableLiveData = new MutableLiveData<>();
        }
        return loginModelMutableLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

    public void LiveDataOnClick(View view) {
        LiveDataLoginModel liveDataLoginModel = new LiveDataLoginModel(username.getValue(), encryptPwd.getValue());
        loginModelMutableLiveData.postValue(liveDataLoginModel);
    }

    public LiveData<LoginEntity> getLiveDataLoginEntity() {
        return ApiService.create(Api.class).loginLiveData(username.getValue(), RxTool.Md5(encryptPwd.getValue()));
    }
}
