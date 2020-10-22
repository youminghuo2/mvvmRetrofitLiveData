package com.example.mvvmgithub.model;

/**
 * @Author zcy
 * @CreateDate: 2020/10/22
 */
public class LiveDataLoginModel {
    private String username;
    private String encryptPwd;

    public LiveDataLoginModel(String username, String encryptPwd) {
        this.username = username;
        this.encryptPwd = encryptPwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptPwd() {
        return encryptPwd;
    }

    public void setEncryptPwd(String encryptPwd) {
        this.encryptPwd = encryptPwd;
    }
}
