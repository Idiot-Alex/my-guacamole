package com.hotstrip.my.guacamole.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class ClientLabel extends BaseBean {
    private Long clientLabelId;
    private Long clientId;
    private Long labelId;
}
