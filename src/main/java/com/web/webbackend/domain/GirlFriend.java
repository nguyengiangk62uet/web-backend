package com.web.webbackend.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class GirlFriend {
    @Autowired
    public Outfit outfit;
}
