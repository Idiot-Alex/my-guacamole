package com.hotstrip.my.guacamole.server.impl;

import com.hotstrip.my.guacamole.model.Config;
import com.hotstrip.my.guacamole.repo.ConfigRepository;
import com.hotstrip.my.guacamole.server.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Slf4j
@Service
public class ConfigServiceImpl implements ConfigService {
    @Resource
    private ConfigRepository configRepository;

    @Override
    public Optional<Config> findById(long configId) {
        return configRepository.findById(configId);
    }

    @Override
    public void save(Config info) {
        configRepository.save(info);
    }
}
