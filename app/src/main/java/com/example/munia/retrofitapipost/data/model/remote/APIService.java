package com.example.munia.retrofitapipost.data.model.remote;

import com.example.munia.retrofitapipost.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by munia on 9/8/2018.
 */

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);
}
