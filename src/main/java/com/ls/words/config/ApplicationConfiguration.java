package com.ls.words.config;

import org.springframework.context.annotation.*;

@Configuration
@ImportResource({"classpath:context.xml"})
public class ApplicationConfiguration {

    ApplicationConfiguration() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
