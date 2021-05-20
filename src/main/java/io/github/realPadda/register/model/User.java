package io.github.realPadda.register.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, name="login")
    private String username;
    @Column(name="senha")
    private String password;
}
