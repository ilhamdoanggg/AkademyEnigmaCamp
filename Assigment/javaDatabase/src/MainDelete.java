import com.enigma.model.Students;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * * Create at 9/24/2019 1:01 AM @author Ilhamdoanggg
 **/
public class MainDelete {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input yang mau di cari lo ");
        String hapus = reader.readLine();

        List<Students>students= StudentService.getAllStudents();
        for (Students student:students) {
            System.out.println(student.toString());

        }
    }
}
