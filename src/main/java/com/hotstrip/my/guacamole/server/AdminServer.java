package com.hotstrip.my.guacamole.server;

import com.hotstrip.my.guacamole.model.Admin;

import java.util.List;

public interface AdminServer {
    List<Admin> findAll();
}
