package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSad_ShouldReturnSad(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
        String mood = moodAnanlyser.analyseMood("this is sad message");
        System.out.println(mood);
    
    }
}

