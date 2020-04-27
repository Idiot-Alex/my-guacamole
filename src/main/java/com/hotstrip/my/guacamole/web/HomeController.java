package com.hotstrip.my.guacamole.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(value = {"/", "/index.html"})
    public String home() {
        logger.info("home page...");
        return "index";
    }
}
