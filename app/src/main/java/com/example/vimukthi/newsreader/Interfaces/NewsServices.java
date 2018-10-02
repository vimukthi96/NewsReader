package com.example.vimukthi.newsreader.Interfaces;

import com.example.vimukthi.newsreader.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsServices {
    @GET("v2/sources?apiKey=API_KEY")//this api is wrong
    Call<WebSite>getSources();

}
