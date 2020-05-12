package com.hotstrip.my.guacamole.repo;

import com.hotstrip.my.guacamole.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Long> {
}
