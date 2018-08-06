package com.htp.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018/7/27.
 */
@SpringBootApplication
@ComponentScan(basePackages ="com.htp")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
