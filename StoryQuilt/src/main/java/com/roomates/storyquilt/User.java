package com.roomates.storyquilt;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by chris on 12/4/13.
 */
public class User implements Serializable{
    String email, name;
    int age, reports, posts;
    boolean isBanned;
    ArrayList<String> writing, reading;


    public User(){} //Firebase required constructor

    public User(String email, String name, int age, int reports, int posts, boolean isBanned,
                ArrayList<String> writing, ArrayList<String> reading){
        this.email = email;
        this.name = name;
        this.age = age;
        this.reports = reports;
        this.posts = posts;
        this.isBanned = isBanned;
        this.writing = writing;
        this.reading = reading;
    }

    //Firebase Get Methods
    public String getEmail() {return this.email;}
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getReports(){
        return this.reports;
    }
    public int getPosts(){
        return this.posts;
    }
    public boolean getIsBanned(){
        return this.isBanned;
    }
    public ArrayList<String> getWriting(){
        return this.writing;
    }
    public ArrayList<String> getReading(){ return this.reading; }

    //Setting the id from Firebase
    public void setEmail(String value){
        this.email = value;
    }

    //Format Email to Firebase Friendly format
    public static String formatEmail(String email){
        return email.replace(".","").replace("@", "");
    }
}
