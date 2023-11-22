package com.sparta.ft;

import java.util.logging.*;

public class App {

    public static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args ) {

        ConsoleHandlerSetup.setupConsoleHandler(logger);
        FileHandlerSetup.setupFileHandler(logger);
        LoggerSetup.setupLogger(logger);

        logger.log(Level.INFO, "This is an info message");
        logger.log(Level.WARNING, "This is a warning message");
        logger.log(Level.FINE, "This is a fine Hello message");

    }
}
