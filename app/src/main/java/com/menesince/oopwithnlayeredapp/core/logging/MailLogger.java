package com.menesince.oopwithnlayeredapp.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Logged the Mail : " + data);

    }
}
