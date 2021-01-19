package com.bridgelabz;

import java.util.Locale;

public class MoodAnanlyser {

    private String message;

    MoodAnanlyser(){
    }
    MoodAnanlyser(String message){
        this.message = message;
    }
    public String analyseMood() throws ModdAnalysisException {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new ModdAnalysisException("please enter proper message");
        }
    }

}
