package com.example.mvvmgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvvmgithub.databinding.ActivityMainBinding;

/**
 * edittest输入13151942718
 * 密码也是
 */
public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mContext = getApplicationContext();
        activityMainBinding.LiveDataBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, LiveDataActivity.class));
                finish();
            }
        });

        activityMainBinding.observableFieldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, ObservableFieldActivity.class));
                finish();
            }
        });
    }
}