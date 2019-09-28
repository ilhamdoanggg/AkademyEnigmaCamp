package com.enigma;

import com.enigma.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * * Create at 9/28/2019 6:43 PM @author Ilhamdoanggg
 **/
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateConfig.getSessionFactory();
        Session session =sessionFactory.getCurrentSession();

        session.beginTransaction();

        session.getTransaction().commit();
    }
}
