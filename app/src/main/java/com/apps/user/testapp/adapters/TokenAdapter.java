package com.apps.user.testapp.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.apps.user.testapp.R;
import com.apps.user.testapp.databinding.TokenItemBinding;
import com.apps.user.testapp.viewmodels.TokenViewModel;
import com.apps.user.testapp.models.Token;

import java.util.List;

public class TokenAdapter extends RecyclerView.Adapter<TokenAdapter.BindingHolder> {

    private List<Token> tokens;
    private Context context;

    public TokenAdapter(List<Token> tokens, Context context) {
        this.tokens = tokens;
        this.context = context;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TokenItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.token_item, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        TokenItemBinding binding = holder.binding;
        binding.setToken(new TokenViewModel(tokens.get(position), context));
    }

    @Override
    public int getItemCount() {
        return tokens.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private TokenItemBinding binding;

        public BindingHolder(TokenItemBinding binding) {
            super(binding.wallerCard);
            this.binding = binding;
        }
    }
}