package com.web.webbackend.domain.dto;

import com.web.webbackend.domain.Outfit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Bikini {
    private static final Logger logger = LogManager.getLogger();

    public void wear() {
        logger.info("Wearing Bikini!");
    }


}
