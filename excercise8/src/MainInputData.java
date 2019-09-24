import com.enigma.model.Students;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;

/**
 * * Create at 9/23/2019 10:55 AM @author Ilhamdoanggg
 **/

public class MainInputData {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Jumblah data ");
        Integer search =Integer.parseInt( reader.readLine());
            for (int i = 0; i < search; i++) {
                System.out.print("ID");
                Integer id =Integer.parseInt( reader.readLine());
                System.out.print("Name ");
                String name = reader.readLine();
                System.out.print("Tempat Lahir ");
                String  tempatLahir = reader.readLine();
                System.out.print("Tanggal Lahir ");
                Date tanggalLahir =Date.valueOf( reader.readLine());
                System.out.print("Kelamin ");
                String gender = reader.readLine();

                System.out.println( id + name +tempatLahir + tanggalLahir + gender);
                /*System.out.println(id, name, tempatLahir, tanggalLahir, gender);*/
                Students students =new Students(id, name, tempatLahir, tanggalLahir,gender);
                StudentService.create(students);
            }

        List<Students>students= StudentService.getAllStudents();
        for (Students student:students) {
            System.out.println(student.toString());

        }

    }
}
