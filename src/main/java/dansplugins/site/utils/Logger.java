/*
  Copyright (c) 2022 Daniel McCoy Stephenson
  Apache License 2.0
 */
package dansplugins.site.utils;

import dansplugins.site.dcwa;

/**
 * @author Daniel McCoy Stephenson
 * @since February 1st, 2022
 */
public class Logger {
    private static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * This can be used to send a debug message to the console.
     * @param message The message to log to the console.
     */
    public void log(String message) {
        if (dcwa.getInstance().isDebugEnabled()) {
            System.out.println("[DEBUG] " + message);
        }
    }
}