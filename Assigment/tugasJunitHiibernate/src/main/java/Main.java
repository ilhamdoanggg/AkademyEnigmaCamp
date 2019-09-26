import com.enigma.config.HibernateConfig;
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

        }

    }
