package com.bi.interfaces;

// LogLevel -> Critical, Security,Info,Debug

// Loglama işlemi için kullanacağımız sınıf
public class Log {
    private String message;
    private String level;

    public Log(String message, String level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return this.level + ": " + this.message;
    }
}
