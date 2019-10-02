package com.enigma.dao;

import com.enigma.config.HibernateConfiguration;
import com.enigma.model.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class RoomDao {

    public static void create(Room room) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(room);
        session.getTransaction().commit();
        session.close();
    }

    public static List<Room> getById(Integer id){
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        /*error di sini*/
        List<Room> room = session.createQuery("from com.enigma.model.Room where id =5").getResultList();
        session.getTransaction().commit();
        session.close();
        return room;
    }

}
