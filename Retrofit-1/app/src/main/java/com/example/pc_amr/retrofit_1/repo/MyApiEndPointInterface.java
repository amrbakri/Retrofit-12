package com.example.pc_amr.retrofit_1.repo;

import com.example.pc_amr.retrofit_1.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by PC-Amr on 15/09/2017.
 */

public interface MyApiEndPointInterface {
    @GET("/search/repositories")
    Call<User> getRepo(@Query("q") String name);
}
