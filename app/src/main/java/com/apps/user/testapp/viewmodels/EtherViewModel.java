package com.apps.user.testapp.viewmodels;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.apps.user.testapp.models.Ether;

public class EtherViewModel extends BaseObservable {

    private Ether ether;
    private Context context;

    public EtherViewModel(Ether ether, Context context) {
        this.ether = ether;
        this.context = context;
    }

    @Bindable
    public String getHeader() {
        return ether.getName();
    }

    public void setHeader(String name) {
        ether.setName(name);
        notifyPropertyChanged(BR.header);
    }

    @Bindable
    public String getBody() {
        return ether.getId();
    }

    public void setBody(String id) {
        ether.setId(id);
        notifyPropertyChanged(BR.body);
    }

    @Bindable
    public String getFooter() {
        return String.valueOf(ether.getBalance());
    }

    public void setFooter(double balance) {
        ether.setBalance(balance);
        notifyPropertyChanged(BR.footer);
    }
}
