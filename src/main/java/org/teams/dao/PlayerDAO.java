package org.teams.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.teams.HibernateUtil;
import org.teams.entity.Coach;
import org.teams.entity.Player;

public class PlayerDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    // Прочитать про AUTOCOMMIT MODE: true, false

    public void savePlayer(Player player) {
        session.beginTransaction();
        session.persist(player);
        session.getTransaction().commit();
    }

    public Player findPlayer(long id) {
        return HibernateUtil.getSessionFactory().openSession().get(Player.class, id); // Различия методов get и load LOAD DEPRECATED

    }

    public void updatePlayer(Player player) {
        session.beginTransaction();
        session.merge(player); // UPDATE
        session.getTransaction().commit();
    }

    public void deletePlayer(Player player) {
        session.beginTransaction();
        session.remove(player); // DELETE
        session.getTransaction().commit();

    }


}
