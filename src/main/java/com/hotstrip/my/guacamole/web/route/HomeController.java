package com.hotstrip.my.guacamole.web.route;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index.html"})
    public String home() {
        log.info("home page...");
        return "index";
    }
}
