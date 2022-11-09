package org.teams.dao;

import org.hibernate.Session;
import org.teams.HibernateUtil;
import org.teams.entity.Coach;

public class CoachDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    // Прочитать про AUTOCOMMIT MODE: true, false

    public void saveCoach(Coach coach) {
        session.beginTransaction();
        session.persist(coach);
        session.getTransaction().commit();
    }

    public Coach findCoach(long id) {
        return HibernateUtil.getSessionFactory().openSession().get(Coach.class, id); // Различия методов get и load LOAD DEPRECATED

    }

    public void updateCoach(Coach coach) {
        session.beginTransaction();
        session.merge(coach); // UPDATE
        session.getTransaction().commit();
    }

    public void deleteCoach(Coach coach) {
        session.beginTransaction();
        session.remove(coach); // DELETE
        session.getTransaction().commit();

    }


}
