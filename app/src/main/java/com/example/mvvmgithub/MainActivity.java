package com.example.mvvmgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

import com.example.mvvmgithub.api.Api;
import com.example.mvvmgithub.api.ApiService;
import com.example.mvvmgithub.databinding.ActivityMainBinding;
import com.example.mvvmgithub.model.GetJoke;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ApiService.create("https://api.apiopen.top/", Api.class).getJokeText().observe(this, new Observer<GetJoke>() {
            @Override
            public void onChanged(GetJoke getJoke) {
                Log.d("--", getJoke.toString());
                activityMainBinding.text.setText(getJoke.getResult().get(0).getText());
                activityMainBinding.name.setText(getJoke.getResult().get(0).getName());
            }
        });
    }
}