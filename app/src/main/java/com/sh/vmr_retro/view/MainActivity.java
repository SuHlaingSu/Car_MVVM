package com.sh.vmr_retro.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.sh.vmr_retro.R;
import com.sh.vmr_retro.adapter.CarListAdapter;
import com.sh.vmr_retro.model.entity.Car;
import com.sh.vmr_retro.viewModel.MainActivityViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String TAG = MainActivity.class.getName();

    RecyclerView rv_car;
    MainActivityViewModel viewModel;
    CarListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        viewModel.getCarList();
        rv_car = findViewById(R.id.rv_carList);
        rv_car.setHasFixedSize(true);
        LinearLayoutManager linearVertical = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        //attach linear layout to recyclerview
        rv_car.setLayoutManager(linearVertical);
        adapter = new CarListAdapter();
        viewModel.getLive_car().observe(this, new Observer<List<Car>>() {
            @Override
            public void onChanged(@Nullable List<Car> cars) {
                Log.d(TAG,"DATA RECEIVES "+cars.size());
                adapter.submitList(cars);
            }
        });

    }
}
