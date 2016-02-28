package com.ls.words.config;

import org.springframework.context.annotation.*;
/**
 * Created by Sergey_PC on 25.02.2016.
 */

@Configuration
@ImportResource({"classpath:context.xml"})
public class ApplicationConfiguration {

    ApplicationConfiguration() {
    }
}
