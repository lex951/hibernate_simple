package org.teams.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false, length = 30)
    private String name;
    @Column(name = "city", nullable = false, length = 30)
    private String city;
    @OneToOne
    @JoinColumn(name = "team_id") //  колонка team_id появится в таблице coaches
    private Coach coach;
    @OneToMany(mappedBy = "team")
    private List<Player> players; //relation
    @Enumerated(EnumType.STRING)
    private TeamLevel level;

    public Team() {
    }
}
