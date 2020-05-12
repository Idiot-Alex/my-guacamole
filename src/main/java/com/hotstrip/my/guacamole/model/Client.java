package com.hotstrip.my.guacamole.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Client extends BaseBean {
    private Long clientId;
    private String clientName;
    // remote client connect properties
    private String hostName;
    private Integer port;
    private String userName;
    private String password;
    private String protocol;
}
