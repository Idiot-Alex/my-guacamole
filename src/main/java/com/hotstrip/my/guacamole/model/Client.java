package com.hotstrip.my.guacamole.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "t_client")
public class Client extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String clientName;
    // remote client connect properties
    private String hostName;
    private Integer port;
    private String userName;
    private String password;
    private String protocol;
}
