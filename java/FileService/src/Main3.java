import com.enigma.model.GeneratePeople;

/**
 * ----------------------------------------------------
 * 9/18/2019 5:12 PM
 * ----------------------------------------------------
 * This file add from Project FileService
 *
 * @author Ilhamdoanggg hanya manusia
 **/

public class Main3 {
    public static void main(String[] args) {
        GeneratePeople generatePeople = new GeneratePeople();
        generatePeople.ReadFile();
        System.out.println(generatePeople.print());
    }
}
