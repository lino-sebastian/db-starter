package com.post.meridiem.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DBUser {
    @Generated
    private int userId;
    @PrimaryKey
    private String email;
    private String password;
}
