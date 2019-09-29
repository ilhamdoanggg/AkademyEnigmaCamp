import com.enigma.config.HibernateConfig;
import com.enigma.model.Room;
import com.enigma.model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * * Create at 9/25/2019 9:22 PM @author Ilhamdoanggg
 **/
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateConfig.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        List<Students>students=session.createCriteria(Students.class).list();

        for (Students student : students) {
            System.out.println(student.toString());
        }
        session.getTransaction().commit();
/*
            Room classYangDiDapat= session.get(Room.class, 1);
            List<Students>students= classYangDiDapat.getStudents();

            for (Students student : students) {
                System.out.println(student.toString());
            }*/


        /*session.beginTransaction();
        Room classYangDiDapat = session.get(Room.class, 1);
        System.out.println(classYangDiDapat.toString());
        Students studentYangDidapat=session.get(Students.class, 1);

        studentYangDidapat.setRoom(classYangDiDapat);
        session.save(studentYangDidapat);
        session.getTransaction().commit();*/

        }

    }
