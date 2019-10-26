package com.enigma.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * * Create at 9/28/2019 5:16 PM @author Ilhamdoanggg
 **/
public class HibernateConfig {

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