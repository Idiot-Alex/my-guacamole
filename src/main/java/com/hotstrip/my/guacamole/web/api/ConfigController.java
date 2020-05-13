package com.hotstrip.my.guacamole.web.api;

import com.hotstrip.my.guacamole.commom.Const;
import com.hotstrip.my.guacamole.model.Config;
import com.hotstrip.my.guacamole.model.R;
import com.hotstrip.my.guacamole.server.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Optional;

@Slf4j
@RestController
public class ConfigController {
    // default configId is 1L
    private static final Long DEFAULT_CONFIG_ID = 1L;

    @Resource
    private ConfigService configService;

    /**
     * check config api
     * if return code is 0, will be fine
     * else, will be edit config information
     * @return
     */
    @GetMapping(value = "/api/config/check")
    public Object checkConfig() {
        Optional<Config> optionalConfig = configService.findById(DEFAULT_CONFIG_ID);
        if (optionalConfig.isPresent()) {
            return R.ok("success").put(Const.DATA, optionalConfig.get());
        }
        return R.error(Const.ERROR_CODE_1, "no config");
    }

    /**
     * init config api
     * edit config when configId's value is 1L
     * @param initFlag
     * @return
     */
    @PostMapping(value = "/api/config/init")
    public Object init(Integer initFlag) {
        Config info = Config.builder()
                .configId(DEFAULT_CONFIG_ID)
                .initFlag(initFlag)
                .build();
        Optional<Config> optionalConfig = configService.findById(DEFAULT_CONFIG_ID);
        if (optionalConfig.isPresent()) {
            // edit
            info.setUpdateTime(new Date());
            configService.save(info);
            return R.ok("success");
        }
        // insert
        info.setCreateTime(new Date());
        configService.save(info);
        return R.ok("success");
    }
}
