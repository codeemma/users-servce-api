package com.codeemma.model;

import javax.persistence.*;

/**
 * Created by emmanuel on 10/27/17.
 */
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private User user;

    @Column
    @Enumerated
    private RoleType roleType;

    public Role() {
    }

    public Role(User user, RoleType roleType) {
        this.id = id;
        this.user = user;
        this.roleType = roleType;
    }
}
