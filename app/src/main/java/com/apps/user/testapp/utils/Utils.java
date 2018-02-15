package com.apps.user.testapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;

public class Utils {

    private Utils(){}

    public static boolean isInternetConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

}
