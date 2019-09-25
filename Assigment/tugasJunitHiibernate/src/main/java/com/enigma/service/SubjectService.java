package com.enigma.service;

import com.enigma.config.HibernateConfig;
import com.enigma.model.Subject;
import org.hibernate.Session;

/**
 * * Create at 9/26/2019 4:00 AM @author Ilhamdoanggg
 **/
public class SubjectService {


    public static void create(Subject subject){
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Subject subjects = new Subject();

        session.beginTransaction();
        session.getTransaction();
        session.save(subjects);
        session.getTransaction().commit();
    }
}
