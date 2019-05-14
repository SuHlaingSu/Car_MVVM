package com.sh.vmr_retro.adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import com.sh.vmr_retro.model.entity.Car;

public class CarItemCallBack extends DiffUtil.ItemCallback<Car> {

        @Override
        public boolean areItemsTheSame(@NonNull Car oldItem, @NonNull Car newItem) {
            return oldItem.getmId() == newItem.getmId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Car oldItem, @NonNull Car newItem) {
            return oldItem.equals(newItem);
        }

}
