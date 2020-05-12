package com.hotstrip.my.guacamole.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "t_client_label")
public class ClientLabel extends BaseBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientLabelId;
    private Long clientId;
    private Long labelId;
}
