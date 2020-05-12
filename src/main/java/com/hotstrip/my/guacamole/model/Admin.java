package com.hotstrip.my.guacamole.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Admin extends BaseBean {
    private Long adminId;
    private String userName;
    private String password;
}
