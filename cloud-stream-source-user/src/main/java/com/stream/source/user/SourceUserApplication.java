package com.stream.source.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.app.jdbc.source.JdbcSourceConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JdbcSourceConfiguration.class)
public class SourceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourceUserApplication.class, args);
    }
}
