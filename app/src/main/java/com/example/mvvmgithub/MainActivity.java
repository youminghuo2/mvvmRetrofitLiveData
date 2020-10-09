package com.example.mvvmgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvmgithub.databinding.ActivityMainBinding;
import com.example.mvvmgithub.model.GetJoke;
import com.example.mvvmgithub.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.getJokeLiveData().observe(this, new Observer<GetJoke>() {
            @Override
            public void onChanged(GetJoke getJoke) {
                if (getJoke != null) {
                    activityMainBinding.setJoke(getJoke.getResult().get(0));
                }
            }
        });
    }
}