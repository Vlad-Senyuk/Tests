package com.apps.user.testapp;

import android.app.Application;

import com.apps.user.testapp.retrofit.my.WalletApi;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class App extends Application {

    private Retrofit retrofit;
    private static WalletApi api;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://quarkbackend.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        api = retrofit.create(WalletApi.class);
    }

    public static WalletApi getApi() {
        return api;
    }
}
