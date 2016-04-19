package com.example;

import com.udacity.gradle.jokes.JokeSmith;

public class JokeWizard {
    public String getJoke() {
        JokeSmith jokeSmith = new JokeSmith();
        return jokeSmith.getJoke();
    }
}
