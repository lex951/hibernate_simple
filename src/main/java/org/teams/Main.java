package org.teams;

import org.teams.entity.Coach;
import org.teams.entity.Player;
import org.teams.entity.Team;
import org.teams.entity.TeamLevel;
import org.teams.dao.TeamDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> playersA=new ArrayList<>();
        Player playerA=new Player("Ivan", "Ivanov");
        Player playerA1=new Player("Ivan", "Popov");
        Player playerA2=new Player("Ivan", "Petrov");
        playersA.add(playerA1);
        playersA.add(playerA2);
        playersA.add(playerA);

        Coach coachA=new Coach("Sergey","Ivanov");

        Team teamA=new Team("A Team","Acity",TeamLevel.PROFESSIONAL);

        teamA.setPlayers(playersA);
        teamA.setCoach(coachA);

        new TeamDAO().saveTeam(teamA);



    }
}
