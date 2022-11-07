package org.teams.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false, length = 30)
    private String firstName;
    @Column(name = "surname", nullable = false, length = 30)
    private String lastName;
    @ManyToOne()
    private Team team; //relation

    @Deprecated
    protected Player(){}
}
