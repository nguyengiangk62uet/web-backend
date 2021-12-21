package com.web.webbackend;

import com.web.webbackend.domain.Dress;
import com.web.webbackend.domain.GirlFriend;
import com.web.webbackend.domain.Outfit;
import com.web.webbackend.domain.dto.Bikini;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebBackendApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WebBackendApplication.class, args);

        GirlFriend girlFriend = context.getBean(GirlFriend.class);

        girlFriend.outfit.wear();
    }

}
