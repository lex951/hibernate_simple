package org.teams.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "teams")
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;
    private String city;
    @Enumerated(EnumType.STRING)
    private TeamLevel level;

    @OneToOne(cascade = CascadeType.ALL) //  колонка team_id появится в таблице coaches
    private Coach coach;
    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    private List<Player> players=new ArrayList<>(); //relation

    public Team(String name, String city, TeamLevel level) {
        this.name = name;
        this.city = city;
        this.level = level;
    }
}
