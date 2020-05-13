package com.hotstrip.my.guacamole.repo;

import com.hotstrip.my.guacamole.model.Config;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<Config, Long> {
}
