    package com.example.instagraph;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass((Post.class));

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("frzJ92647QOicG6vERp8HJZ2QXbfx0iPuvOvTqMS")
                .clientKey("OiE63AOj8XPbnOxQURvUEmhd0xkCbyimglqEGCn4")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
