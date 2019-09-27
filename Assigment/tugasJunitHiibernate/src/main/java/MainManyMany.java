import com.enigma.config.HibernateConfig;
import com.enigma.model.Room;
import com.enigma.model.Students;
import com.enigma.model.SubjectStudent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.HashSet;
import java.util.List;

/**
 * * Create at 9/25/2019 9:22 PM @author Ilhamdoanggg
 **/
public class MainManyMany {
    public static void main(String[] args) {

        SessionFactory sessionFactory= HibernateConfig.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        SubjectStudent yangDidapet = session.get(SubjectStudent.class, 1);
        System.out.println(yangDidapet);
        List<Students>students = new HashSet<>();
//        List<Students>students =yangDidapet.;

            for (Students student: Students) {
                System.out.println(student.toString());
            }

        session.getTransaction().commit();

        /*session.beginTransaction();
        Room classYangDiDapat= session.get(Room.class, 1);
        System.out.println(classYangDiDapat.toString());
        Students studentYangDidapat=session.get(Students.class, 1);

        studentYangDidapat.setRoom(classYangDiDapat);
        session.save(studentYangDidapat);
        session.getTransaction().commit();*/

        }

    }
