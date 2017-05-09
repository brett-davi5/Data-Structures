package com.brettdavis;

/**
 * Created by Family on 1/30/2017.
 */
public class Song{

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {  //this is a quick, great way to quickly print out some 'this' variables into a string
        return this.title + " : " + this.duration;
    }
}
