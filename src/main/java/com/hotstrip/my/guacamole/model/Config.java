package com.hotstrip.my.guacamole.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "t_config")
public class Config extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long configId;
    private Integer initFlag;
    private String guacdHostName;
    private Integer guacdPort;
}
