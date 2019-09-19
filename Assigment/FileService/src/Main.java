import com.enigma.fileservice.Circle;
import com.enigma.fileservice.FileService;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        Circle bola = new Circle(1);

        FileService fileService = new FileService(bola.r);


    }
}
