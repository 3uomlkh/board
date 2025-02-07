package com.example.board.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "member")
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    private Integer age;

    public Member() {

    }

    public Member(String userName, Integer age, String password) {
        this.userName = userName;
        this.age = age;
        this.password = password;
    }
}
