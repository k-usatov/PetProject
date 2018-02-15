package com.example.usatov_ks.petproject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by usatov_ks on 13.02.2018.
 */

public class Post {

    @SerializedName("userId")
    private int userId;


    @SerializedName("id")
    private int id;


    @SerializedName("title")
    private String title;


    @SerializedName("body")
    private String body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Post withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Post withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post withBody(String body) {
        this.body = body;
        return this;
    }

}

