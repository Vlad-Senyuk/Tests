package com.apps.user.testapp.retrofit.my;

import com.apps.user.testapp.models.Ether;
import com.apps.user.testapp.models.Token;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WalletApi {

    @GET("/getfile/uxname/wallets")
    Call<List<Ether>> getEthers();

    @GET("/getfile/uxname/tokens")
    Call<List<Token>> getTokens();
}
