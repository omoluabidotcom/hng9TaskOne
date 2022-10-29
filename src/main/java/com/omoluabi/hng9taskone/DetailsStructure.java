package com.omoluabi.hng9taskone;

import org.springframework.stereotype.Component;

// get endpoint return type
@Component
public class DetailsStructure {

    // fields
    private String slackUsername;
    private Boolean backend;
    private int age;
    private String bio;

    // noargsconstructor
    DetailsStructure() {}

    // allargsconstructor
    DetailsStructure(String slackUsername, Boolean backend, int age, String bio) {

        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }

    // getters ans setters below

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setBackend(Boolean backend) {
        this.backend = backend;
    }

    public Boolean getBackend() {
        return backend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }
}
