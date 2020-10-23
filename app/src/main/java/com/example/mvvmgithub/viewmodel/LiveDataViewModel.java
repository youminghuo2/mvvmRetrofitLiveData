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

    //将字段用MutableLiveData包装
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> encryptPwd = new MutableLiveData<>();

    private MutableLiveData<LiveDataLoginModel> loginModelMutableLiveData;

    //初始化获取相关LiveData对象
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

    //    定义点击事件
    public void LiveDataOnClick(View view) {
        LiveDataLoginModel liveDataLoginModel = new LiveDataLoginModel(username.getValue(), encryptPwd.getValue());
        //postValue和setValue区别，postValue()方法用在非UI线程，setValue用在UI线程，通过LiveData.postValue/setValue方法来修改LiveData包装的数据
        loginModelMutableLiveData.postValue(liveDataLoginModel);
    }

    //返回retrofit接口数据
    public LiveData<LoginEntity> getLiveDataLoginEntity() {
        return ApiService.create(Api.class).loginLiveData(username.getValue(), RxTool.Md5(encryptPwd.getValue()));
    }
}
