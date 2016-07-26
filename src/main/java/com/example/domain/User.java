package com.example.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * User Entity.
 */
@Entity
@Getter
@Builder
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @Setter
    private String name;

    @Setter
    private String nickname;

    @Column(nullable = false)
    @Setter
    private String birthday;

    @Tolerate
    public User() {
    }

    public static User create(String name, String nickname, String birthday) {
        return builder()
                .name(name)
                .nickname(nickname)
                .birthday(birthday)
                .build();
    }
}
