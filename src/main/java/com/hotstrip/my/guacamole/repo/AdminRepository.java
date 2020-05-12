package com.hotstrip.my.guacamole.repo;

import com.hotstrip.my.guacamole.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
