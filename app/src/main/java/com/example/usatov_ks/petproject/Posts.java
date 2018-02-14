package com.example.usatov_ks.petproject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by usatov_ks on 13.02.2018.
 */

public class Posts {

    @SerializedName("userId")
    @Expose
    private int userId;


    @SerializedName("id")
    @Expose
    private int id;


    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("body")
    @Expose
    private String body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Posts withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Posts withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Posts withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Posts withBody(String body) {
        this.body = body;
        return this;
    }

}

