package com.star.sync.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: hanjiafu
 * Date: 18-4-19
 * Time: 下午8:26
 * Detail:
 */
@SpringBootApplication
public class app extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(app.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
    }
}
