package com.sh.vmr_retro.viewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.sh.vmr_retro.jsonResponse.ApiResponse;
import com.sh.vmr_retro.model.entity.Car;
import com.sh.vmr_retro.webServices.ApiInterface;
import com.sh.vmr_retro.webServices.ServiceGenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends AndroidViewModel {

    MutableLiveData<List<Car>> live_car = new MutableLiveData<>();

    public MainActivityViewModel(Application application) {
        super(application);
    }

    public MutableLiveData<List<Car>> getLive_car() {
        return live_car;
    }

    public void getCarList()
    {
        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<ApiResponse> call = apiInterface.getCarsList();
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if(response.isSuccessful())
                {
                    live_car.postValue(response.body().getContent());
                }
                Log.i("Success",response.message());
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("Failed",t.getMessage());
            }
        });
    }
}
