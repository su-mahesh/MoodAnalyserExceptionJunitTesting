package com.bridgelabz;

import java.util.Locale;

public class MoodAnanlyser {


    private String message;

    MoodAnanlyser(){
    }
    MoodAnanlyser(String message){
        this.message = message;
    }
    public String analyseMood()  {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}