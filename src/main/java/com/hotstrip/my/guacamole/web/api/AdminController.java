package com.hotstrip.my.guacamole.web.api;

import com.hotstrip.my.guacamole.model.Admin;
import com.hotstrip.my.guacamole.server.AdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
public class AdminController {

    @Resource
    private AdminServer adminServer;

}
