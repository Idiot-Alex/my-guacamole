package com.hotstrip.my.guacamole;

import com.hotstrip.my.guacamole.repo.AdminRepository;
import com.hotstrip.my.guacamole.model.Admin;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
public class AdminTest extends AppTest {

    @Resource
    private AdminRepository adminRepository;

    @Test
    public void findAllTest() {
        List<Admin> list = adminRepository.findAll();
        log.info("total size: {}", list.size());
    }
}
