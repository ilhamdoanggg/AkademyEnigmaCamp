import com.enigma.model.Person;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 * ----------------------------------------------------
 * 9/18/2019 4:42 PM
 * ----------------------------------------------------
 * This file add from Project FileService
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person>person=new HashSet<>();

        try {
        System.out.println("Input Jumblah Data :");
        Integer jumblah =Integer.parseInt(reader.readLine());
        String [] name = new String[jumblah];
        Integer [] age = new Integer[jumblah];
        String [] gender = new String[jumblah];
        int number=1;
        for (int i = 0; i <jumblah ; i++) {
            System.out.println("Masukan Data ke-"+number++);
            System.out.print("Name :");
            name[i]=reader.readLine().trim();
            System.out.print("Age :");
            age[i]= Integer.parseInt(reader.readLine().trim());
            System.out.print("Gender :");
            gender[i]=reader.readLine();
            person.add(new Person(name[i],age[i],gender[i]));
        }
        /**
        * path pembuatan file
        * */
        Path currentRelativePath= Paths.get("src");
        File file = new File(currentRelativePath + "/database/local/data.txt");

            for (int j = 0; j <jumblah ; j++) {
                FileWriter fileWriter = new FileWriter(file,true);
                fileWriter.write(String.format("%1$-30s",name[j])+String.format("%1$-3s",age[j])+String.format("%1$-1s",gender[j])+'\n');
                BufferedWriter writerBuff = new BufferedWriter(fileWriter);
             /*   for (int k = 0; k < jumblah; k++) {
                    writerBuff.write(String.format());
                }*/
                fileWriter.close();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
