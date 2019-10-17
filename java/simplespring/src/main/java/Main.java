import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        Student tony = new Student(1,"Kokon Dao","tangerang", new Date(), "M");
        Student tonton = new Student(3,"Dadang Herdadung","tangerang", new Date(), "F");
        Student tonto = new Student(2,"Dadang Herdadung","tangerang", new Date(), "F");
        Student tontn = new Student(4,"Dadang Herdadung","tangerang", new Date(), "F");

        StudentDao studentDao= (StudentDao) context.getBean("studentDao");

        studentDao.save(tony);
        studentDao.save(tonton);
        studentDao.save(tontn);
        studentDao.save(tonto);

        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println(studentService.countMale());
        System.out.println(studentService.countFemale());


     /*   Student tony = new Student(1,"Kokon Dao","tangerang", new Date(), "M");
        Student tonton = new Student(3,"Dadang Herdadung","tangerang", new Date(), "F");
        Student tontn = new Student(3,"Dadang Herdadung","tangerang", new Date(), "F");
        Student tonto = new Student(3,"Dadang Herdadung","tangerang", new Date(), "F");

        StudentDao studentDao= new StudentDao();
        studentDao.save(tony);
        studentDao.save(tonton);
        studentDao.save(tontn);
        studentDao.save(tonto);

        StudentService studentService =new StudentService(studentDao);

        System.out.println();*/
    }
}
