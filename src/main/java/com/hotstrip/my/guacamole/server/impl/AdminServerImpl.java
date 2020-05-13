package com.hotstrip.my.guacamole.server.impl;

import com.hotstrip.my.guacamole.model.Admin;
import com.hotstrip.my.guacamole.repo.AdminRepository;
import com.hotstrip.my.guacamole.server.AdminServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServerImpl implements AdminServer {
    @Resource
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }
}
