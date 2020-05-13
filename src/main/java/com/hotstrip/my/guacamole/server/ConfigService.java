package com.hotstrip.my.guacamole.server;

import com.hotstrip.my.guacamole.model.Config;

import java.util.Optional;

public interface ConfigService {

    Optional<Config> findById(long configId);

    void save(Config info);
}
