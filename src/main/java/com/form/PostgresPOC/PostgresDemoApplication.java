package com.form.PostgresPOC;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.form.PostgresPOC"})
public class PostgresDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostgresDemoApplication.class, args);
    }
}
