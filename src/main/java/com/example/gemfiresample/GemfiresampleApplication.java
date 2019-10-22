package com.example.gemfiresample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@SpringBootApplication
@EnableEntityDefinedRegions(basePackages = "com.example.gemfiresample.model")
public class GemfiresampleApplication {

    public static void main(String[] args) {
		SpringApplication.run(GemfiresampleApplication.class, args);
	}

}
