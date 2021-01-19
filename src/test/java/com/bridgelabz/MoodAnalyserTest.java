package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.bridgelabz.ModdAnalysisException;

public class MoodAnalyserTest {

    @Test
    public void givenMessageSad_ShouldReturnSad() throws ModdAnalysisException {
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser("I am in Sad Mood");
        String mood = moodAnanlyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageHappyMood_ShouldReturnHappy()throws ModdAnalysisException{
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser("I am in Happy Mood");
        String mood = moodAnanlyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNull_ShouldThroeThrowException(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ModdAnalysisException.class);
            mood = moodAnanlyser.analyseMood();
        } catch (ModdAnalysisException e) {
            e.printStackTrace();
        }

    }
}