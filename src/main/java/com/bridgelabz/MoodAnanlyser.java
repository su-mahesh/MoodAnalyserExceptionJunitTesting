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
            if(message.length() == 0)
                throw new ModdAnalysisException(ModdAnalysisException.ExceptionType.ENTERED_EMPTY, "please enter proper message");
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new ModdAnalysisException(ModdAnalysisException.ExceptionType.ENTERED_NULL, "please enter proper message");
        }
    }

}
