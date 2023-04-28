package com.saidworks.jsontojavaclasses;

import com.saidworks.jsontojavaclasses.io.JsonToJavaClassConversion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JsonToJavaClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonToJavaClassesApplication.class, args);
    }



    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            String pathToDirectory = "src/main/resources/jsonmodels";
            JsonToJavaClassConversion jsonToJavaClassConversion = new JsonToJavaClassConversion();
            jsonToJavaClassConversion.applyForDirectory(pathToDirectory);
        };
    }

}
