package com.enigma.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * * Create at 9/25/2019 9:17 PM @author Ilhamdoanggg
 **/
public class HibernateConfig {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory(){

        try {
            /*create session factory from hibernate.dfg.xml
             * */
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
//            SessionFactory sessionFactory =
//                    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        catch (Throwable ex){
            System.err.println("Initial SessionFactory Creation Faild." + ex);
            ex.printStackTrace();
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null) sessionFactory=buildSessionFactory();
        return sessionFactory;
    }
}
