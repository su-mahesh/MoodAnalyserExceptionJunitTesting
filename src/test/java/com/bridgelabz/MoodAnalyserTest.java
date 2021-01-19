package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageSad_ShouldReturnSad(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser("I am in Sad Mood");
        String mood = moodAnanlyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageHappyMood_ShouldReturnHappy(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser("I am in Happy Mood");
        String mood = moodAnanlyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNull_ShouldReturnHappy(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
        String mood = moodAnanlyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}