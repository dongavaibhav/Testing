package com.example.testing;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    @GET("/todos")
    Call<List<RetroUsers>> getAllUsers();

}
