package com.odisseia.note.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String name;
}
