package com.bridgelabz;

public class MoodAnanlyser {
    public String analyseMood(String message)  {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
