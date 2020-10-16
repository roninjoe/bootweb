package com.ronin.bootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This class can be used to customize Spring MVC.  In this case,
 * we register a redirect to the Swagger UI.
 */
@Configuration
@EnableSwagger2
public class WebConfiguration implements WebMvcConfigurer {
    @Override 
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/swagger-ui.html");
    }
}
