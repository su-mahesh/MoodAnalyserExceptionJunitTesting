package com.bridgelabz;

import java.util.Locale;

public class MoodAnanlyser {
    public String analyseMood(String message)  {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}