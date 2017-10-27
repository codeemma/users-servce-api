package com.codeemma.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by emmanuel on 10/27/17.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 11123L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "sex")
    private String sex;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Address address;
    @Temporal(TemporalType.DATE)
    @Column(name = "dateCreated")
    private Date dateCreated;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "role_id")
//    private Role role;

    public User() {
    }

    public User(String firstName, String surname, String email, String username, String password, String sex) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.sex = sex;
    }
}
