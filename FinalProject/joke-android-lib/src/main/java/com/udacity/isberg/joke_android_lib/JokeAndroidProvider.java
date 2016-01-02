package com.udacity.isberg.joke_android_lib;

import android.app.Activity;

import com.udacity.JokeJavaProvider;

public class JokeAndroidProvider extends Activity {

    private JokeJavaProvider jokeJavaProvider = new JokeJavaProvider();

    public String getJoke() {

        return jokeJavaProvider.getJoke();
    }
}

 //Suggestion: use tools:overrideLibrary="com.udacity.isberg.joke_android_lib" to force usage