package com.apps.user.testapp.retrofit.my;

import com.apps.user.testapp.App;
import com.apps.user.testapp.models.Ether;
import com.apps.user.testapp.models.Token;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

public class WalletApiHelper {

    private WalletApiHelper() {}

    public static List<Ether> getEthers(){
        try {
            Response<List<Ether>> response = App.getApi().getEthers().execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Token> getTokens(){
        try {
            Response<List<Token>> response = App.getApi().getTokens().execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
