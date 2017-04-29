package com.example.juancho.gnews;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by juancho on 29/04/17.
 */

public interface Retrofiable {
    @GET("/v1/articles?source=the-next-web&sortBy=latest&apiKey=84787c46f43346f79284e87e8e8afdfd")
    Call<List<Noticia>> getNews();

}
