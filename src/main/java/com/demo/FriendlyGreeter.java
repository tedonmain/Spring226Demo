package com.demo;

public class FriendlyGreeter extends GreeterBase {

    @Override
    public String greet(){
        greetCount++;
        return "Friendly Greeting " + greetCount;
    }
}
