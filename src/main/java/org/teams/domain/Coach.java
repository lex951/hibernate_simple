package org.teams.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "coaches")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false, length = 30)
    private String firstName;
    @Column(name = "surname", nullable = false, length = 30)
    private String lastName;

    @OneToOne()
    @JoinColumn(name = "coach_id")
    private Team team; //relation

    @Deprecated
    protected Coach(){
    }
}
