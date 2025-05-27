package com.bi.interfaces;

import java.io.IOException;

// High Level Class
public class BadLogService {

    // 2 tane Low Level Class bağlı.
    private TextLogger textLogger = new TextLogger();
    private ConsoleLogger consoleLogger = new ConsoleLogger();

    public BadLogService(TextLogger textLogger) {
        this.textLogger = textLogger;
    }

    public BadLogService(ConsoleLogger consoleLogger) {
        this.consoleLogger = consoleLogger;
    }

    public void log(Log log) throws IOException {
        if(this.consoleLogger != null) {
            this.consoleLogger.log(log);
        } else if(this.textLogger != null) {
            this.textLogger.log(log);
        }

    }
}
