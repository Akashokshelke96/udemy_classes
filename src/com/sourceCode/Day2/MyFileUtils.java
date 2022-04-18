package com.sourceCode.Day2;

public class MyFileUtils {
    public int subtract10FromLargerNumber(int number) throws FooRuntimeException{
        if(number < 10){
            throw new FooRuntimeException("Number is less than 10");
        }
        return number-10;

    }//building nex exceptions
    public class FooRuntimeException extends Exception{
        public FooRuntimeException(String message){
            super(message);

        }

    }
}
