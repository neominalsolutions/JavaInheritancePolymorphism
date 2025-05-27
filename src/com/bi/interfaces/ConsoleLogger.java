package com.bi.interfaces;

public class ConsoleLogger implements Logger {
    @Override
    public void log(Log log) {
        System.out.println(log);
    }


}
