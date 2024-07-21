package com.kabin.springbootrest.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    public void logMethodCall() {
        logger.info("Method called.");
    }
}
