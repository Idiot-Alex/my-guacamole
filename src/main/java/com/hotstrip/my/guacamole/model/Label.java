package com.hotstrip.my.guacamole.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Label extends BaseBean {
    private Long labelId;
    private String labelName;
}
