package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSad_ShouldReturnSad(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
        String mood = moodAnanlyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }
}

