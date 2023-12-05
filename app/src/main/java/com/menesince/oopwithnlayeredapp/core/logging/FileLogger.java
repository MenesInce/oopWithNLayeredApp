package com.menesince.oopwithnlayeredapp.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Logged the file : " + data);
    }
}
