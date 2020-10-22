package com.example.mvvmgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmgithub.api.Api;
import com.example.mvvmgithub.api.ApiService;
import com.example.mvvmgithub.databinding.ActivityObservableFieldBinding;
import com.example.mvvmgithub.entity.LoginEntity;
import com.example.mvvmgithub.viewmodel.ObservableFieldViewModel;
import com.tamsiree.rxkit.RxTool;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ObservableFieldActivity extends AppCompatActivity {
    private ActivityObservableFieldBinding activityPsdLoginBinding;
    private Context mContext;
    private ObservableFieldViewModel observableFieldViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observable_field);

        activityPsdLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_observable_field);
        mContext = getApplicationContext();
        observableFieldViewModel = new ObservableFieldViewModel();
        activityPsdLoginBinding.setObservableFieldViewModel(observableFieldViewModel);

        activityPsdLoginBinding.achieveSmsBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<LoginEntity> login = ApiService.create(Api.class).loginObservableField(observableFieldViewModel.getNickName(), RxTool.Md5(observableFieldViewModel.getPassword()));
                login.enqueue(new Callback<LoginEntity>() {
                    @Override
                    public void onResponse(Call<LoginEntity> call, Response<LoginEntity> response) {
                        if (response.isSuccessful()) {
                            if (response.body().getCode().equals("SUCCESS")) {
                                Intent intent2 = new Intent(ObservableFieldActivity.this, MainActivity2.class);
                                startActivity(intent2);
                            } else {
                                Toast.makeText(mContext, response.body().getMsg(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginEntity> call, Throwable t) {

                    }
                });
            }
        });
    }
}