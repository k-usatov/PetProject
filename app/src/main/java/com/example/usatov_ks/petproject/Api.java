package com.example.usatov_ks.petproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by usatov_ks on 13.02.2018.
 */

public interface Api {
    @GET("posts")
    Call<List<Post>> getPosts();
}
