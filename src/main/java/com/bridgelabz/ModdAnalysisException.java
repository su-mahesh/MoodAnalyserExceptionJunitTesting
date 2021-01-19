package com.bridgelabz;

public class ModdAnalysisException extends Exception{
    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType exceptionType;
    public ModdAnalysisException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }

}
