package com.example.mvvmgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.mvvmgithub.databinding.ActivityLiveDataBinding;
import com.example.mvvmgithub.entity.LoginEntity;
import com.example.mvvmgithub.model.LiveDataLoginModel;
import com.example.mvvmgithub.viewmodel.LiveDataViewModel;

public class LiveDataActivity extends AppCompatActivity {
    private ActivityLiveDataBinding activityLiveDataBinding;
    private LiveDataViewModel liveDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLiveDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_live_data);
        //通过ViewModelProvider得到ViewModel
        liveDataViewModel = new ViewModelProvider(this).get(LiveDataViewModel.class);
        activityLiveDataBinding.setLiveDataViewModel(liveDataViewModel);
        LiveDataMonitor();
    }

    private void LiveDataMonitor() {
        //得到ViewModel中的LiveData
        final MutableLiveData<LiveDataLoginModel> liveData = liveDataViewModel.getLoginModelMutableLiveData();
        //liveData.observe()观察ViewModel中数据的变化
        liveData.observe(this, new Observer<LiveDataLoginModel>() {
            @Override
            public void onChanged(LiveDataLoginModel liveDataLoginModel) {
                if (!TextUtils.isEmpty(activityLiveDataBinding.psdNicknameEdit.getText()) && !TextUtils.isEmpty(activityLiveDataBinding.psdEdit.getText())) {
                    LiveData<LoginEntity> liveDataLoginEntity = liveDataViewModel.getLiveDataLoginEntity();
                    liveDataLoginEntity.observe(LiveDataActivity.this, new Observer<LoginEntity>() {
                        @Override
                        public void onChanged(LoginEntity loginEntity) {
                            if (loginEntity.isSuccess()) {
                                if (loginEntity.getCode().equals("SUCCESS")) {
                                    Intent intent = new Intent(LiveDataActivity.this, MainActivity2.class);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(LiveDataActivity.this, loginEntity.getMsg(), Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(LiveDataActivity.this, loginEntity.getMsg(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}




