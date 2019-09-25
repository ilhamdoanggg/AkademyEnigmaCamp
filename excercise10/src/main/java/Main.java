import com.enigma.config.HibernateConfigs;
import com.enigma.model.Students;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * * Create at 9/25/2019 4:08 PM @author Ilhamdoanggg
 **/
public class Main {
    public static void main(String[] args) {



    SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    }
}
