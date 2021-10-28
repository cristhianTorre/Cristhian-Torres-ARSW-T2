package edu.eci.arsw.coronavirusStats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.coronavirusAPI"})
public class CoronavirusAPIApplication {
    public static void main (String[] args){
        SpringApplication.run(CoronavirusAPIApplication.class,args);
    }
}
