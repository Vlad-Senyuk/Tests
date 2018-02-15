package com.apps.user.testapp.viewmodels;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.apps.user.testapp.models.Token;

public class TokenViewModel extends BaseObservable {

    private Token token;
    private Context context;

    public TokenViewModel(Token token, Context context) {
        this.token = token;
        this.context = context;
    }

    @Bindable
    public String getHeader() {
        return token.getTitle() == null ? "Token" : token.getTitle();
    }

    public void setHeader(String title) {
        token.setTitle(title);
        notifyPropertyChanged(BR.header);
    }

    @Bindable
    public String getBody() {
        return token.getAddress();
    }

    public void setBody(String address) {
        token.setAddress(address);
        notifyPropertyChanged(BR.body);
    }

    @Bindable
    public String getFooter() {
        return String.valueOf(token.getBalance());
    }

    public void setFooter(double balance) {
        token.setBalance(balance);
        notifyPropertyChanged(BR.footer);
    }
}
