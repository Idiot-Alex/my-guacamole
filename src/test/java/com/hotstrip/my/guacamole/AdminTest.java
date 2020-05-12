package com.hotstrip.my.guacamole;

import com.hotstrip.my.guacamole.repo.AdminRepository;
import com.hotstrip.my.guacamole.model.Admin;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;

public class AdminTest extends AppTest {

    @Resource
    private AdminRepository adminRepository;

    @Test
    public void findAllTest() {
        List<Admin> list = adminRepository.findAll();
        logger.info("total size: {}", list.size());
    }
}
