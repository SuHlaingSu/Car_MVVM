package com.sh.vmr_retro.webServices;

import com.sh.vmr_retro.jsonResponse.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SuHlaing on 26/4/19.
 */

public interface ApiInterface {

    @GET("article/get_articles_list")
    Call<ApiResponse>getCarsList();

}
