package com.ouchin.MajesticCup.entity;

import com.ouchin.MajesticCup.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String username;
    private String password;

    @Builder.Default
    private Set<UserRole> roles = Set.of(UserRole.USER);

    private LocalDateTime createdAt;
}
