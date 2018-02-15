package com.apps.user.testapp.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.apps.user.testapp.R;
import com.apps.user.testapp.databinding.EtherItemBinding;
import com.apps.user.testapp.viewmodels.EtherViewModel;
import com.apps.user.testapp.models.Ether;

import java.util.List;

public class EtherAdapter extends RecyclerView.Adapter<EtherAdapter.BindingHolder> {

    private List<Ether> ethers;
    private Context context;

    public EtherAdapter(List<Ether> ethers, Context context) {
        this.ethers = ethers;
        this.context = context;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        EtherItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.ether_item, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        EtherItemBinding binding = holder.binding;
        binding.setEther(new EtherViewModel(ethers.get(position), context));
    }

    @Override
    public int getItemCount() {
        return ethers.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private EtherItemBinding binding;

        public BindingHolder(EtherItemBinding binding) {
            super(binding.wallerCard);
            this.binding = binding;
        }
    }
}