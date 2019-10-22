package com.example.gemfiresample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@SpringBootApplication
@CacheServerApplication(port=40421,autoStartup=true,maxConnections=3,locators="localhost[10334]")
@EnableEntityDefinedRegions(basePackages = "com.example.gemfiresample.model")
public class GemfiresampleApplication {

    public static void main(String[] args) {
		SpringApplication.run(GemfiresampleApplication.class, args);
	}

}
