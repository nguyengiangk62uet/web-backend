package com.web.webbackend.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Dress implements Outfit {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void wear() {
        logger.info("Wearing Dress!");
    }
}
