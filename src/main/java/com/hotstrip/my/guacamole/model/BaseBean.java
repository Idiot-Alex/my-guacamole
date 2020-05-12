package com.hotstrip.my.guacamole.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class BaseBean {
    private Date createTime;
    private Date updateTime;
    private Integer status;
}
