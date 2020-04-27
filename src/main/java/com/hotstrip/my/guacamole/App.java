package com.hotstrip.my.guacamole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("application start...");
        SpringApplication.run(App.class, args);
    }

    /*@Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }*/
}
