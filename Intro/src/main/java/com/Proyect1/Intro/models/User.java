package com.Proyect1.Intro.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode

public class User {

    @Getter @Setter @Column(name = "id")
    @Id
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String Name;
    @Getter @Setter @Column(name = "last")
    private String Last;
    @Getter @Setter @Column(name = "email")
    private String Email;
    @Getter @Setter @Column(name = "phone")
    private Long Phone; // Declarado como int
    @Getter @Setter @Column(name = "password")
    private String Password; // Declarado como String
}
