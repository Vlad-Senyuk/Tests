package com.apps.user.testapp;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.user.testapp.adapters.EtherAdapter;
import com.apps.user.testapp.adapters.TokenAdapter;
import com.apps.user.testapp.retrofit.my.WalletApiHelper;

public class TokenFragment extends Fragment {

    private RecyclerView walletRecyclerView;
    private TokenAdapter tokenAdapter;

    public TokenFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_token, container, false);

        walletRecyclerView = view.findViewById(R.id.tokenRecyclerView);
        walletRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        new NetworkTask().execute();

        return view;
    }

    private class NetworkTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            tokenAdapter = new TokenAdapter(WalletApiHelper.getTokens(), getContext());
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            walletRecyclerView.setAdapter(tokenAdapter);
        }
    }
}
