package org.teams.dao;

import org.hibernate.Session;
import org.teams.HibernateUtil;
import org.teams.entity.Coach;
import org.teams.entity.Team;

public class TeamDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    public void saveTeam(Team team) {
        session.beginTransaction();
        session.persist(team);
        session.getTransaction().commit();
    }

    public Team findTeam(long id) {
        return session.get(Team.class, id); // Различия методов get и load LOAD DEPRECATED

    }

    public void updateTeam(Team team) {
        session.beginTransaction();
        session.merge(team); // UPDATE
        session.getTransaction().commit();
    }

    public void deleteCTeam(Team team) {
        session.beginTransaction();
        session.remove(team); // DELETE
        session.getTransaction().commit();

    }
}
