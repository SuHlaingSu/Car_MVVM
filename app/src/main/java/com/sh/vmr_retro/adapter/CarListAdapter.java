package com.sh.vmr_retro.adapter;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sh.vmr_retro.R;
import com.sh.vmr_retro.model.entity.Car;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CarListAdapter extends ListAdapter<Car,CarListAdapter.ViewHolder> {

    List<Car> carList;

    public CarListAdapter() {
        super(new CarItemCallBack());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.car_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Car carObj = carList.get(position);
        viewHolder.mTitle.setText(carObj.getContent().get(position).getDescription());
        if(carObj.getmImage()!= null)
        {
            Picasso.get().load(carObj.getmImage()).into(viewHolder.mImage);
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mTitle;
        public ViewHolder( View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.thumbnails);
            mTitle = itemView.findViewById(R.id.txt_title);
        }
    }
}
