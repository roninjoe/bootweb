package com.ronin.bootweb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * This is the "main" of the application, and is pointed to the the jar 
 * manifest.  It bootstraps the embedded Tomcat server after wiring up all 
 * the classes.
 */
@SpringBootApplication
public class BootwebApplication {
        public static void main(String[] args) {
                SpringApplication.run(BootwebApplication.class, args);
        }
}