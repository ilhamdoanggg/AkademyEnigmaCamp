package com.enigma.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * * Create at 5:16 PM @author Ilhamdoanggg
 **/
public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory(){
        Configuration configuration = new Configuration();
        sessionFactory=configuration.configure("hibernate.cfg.xml").buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null) sessionFactory=buildSessionFactory();
        return sessionFactory;
    }
}
