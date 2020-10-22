package com.example.mvvmgithub.viewmodel;

import android.util.Log;
;

import androidx.databinding.ObservableField;

import androidx.lifecycle.ViewModel;

import com.example.mvvmgithub.model.ObservableFieldLoginModel;


/**
 * @Author zcy
 * @CreateDate: 2020/10/22
 */
public class ObservableFieldViewModel extends ViewModel {
    private ObservableField<ObservableFieldLoginModel> observableFieldLoginModelObservableField;
    private static final String TAG = "PsdViewModel";

    public ObservableFieldViewModel() {
        ObservableFieldLoginModel ObservableFieldLoginModel = new ObservableFieldLoginModel();
        observableFieldLoginModelObservableField = new ObservableField<>();
        observableFieldLoginModelObservableField.set(ObservableFieldLoginModel);
    }

    public String getNickName() {
        Log.e(TAG, "getNickName()");
        return observableFieldLoginModelObservableField.get().username;
    }

    public String setNickName(String username) {
        Log.e(TAG, "setNickName()->" + username);
        return observableFieldLoginModelObservableField.get().username = username;
    }

    public String getPassword() {
        Log.e(TAG, "getPassword()");
        return observableFieldLoginModelObservableField.get().encryptPwd;
    }

    public String setPassword(String encryptPwd) {
        Log.e(TAG, "setPassword()->" + encryptPwd);
        return observableFieldLoginModelObservableField.get().encryptPwd = encryptPwd;
    }

}
