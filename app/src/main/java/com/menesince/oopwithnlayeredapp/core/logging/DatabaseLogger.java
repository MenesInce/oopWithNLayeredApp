package com.menesince.oopwithnlayeredapp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged the database : " + data);
    }
}
