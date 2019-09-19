package com.enigma.model;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ----------------------------------------------------
 * 9/18/2019 20:29 PM
 * ----------------------------------------------------
 * This file add from Project FileService
 *
 * @author Ilhamdoanggg hanya manusia
 **/

public class GeneratePeople {
    String []name = new String[3];
    String []age = new String[3];
    String []gender = new String[3];

    public void ReadFile(){

        Path currentRelativePath= Paths.get("src");
        File file = new File(currentRelativePath + "/database/local/data.txt");
        List<String> texts = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while (true){
                String txt =br.readLine();
                if (txt==null){
                    break;
                }
                texts.add(txt);
            }
            System.out.print("Jumlah teman = ");
            System.out.println(texts.size());

            for (int i = 0; i < texts.size() ; i++) {
                name[i] = texts.get(i).substring(0,30).trim();
                age[i] = texts.get(i).substring(30,33).trim();
                gender[i] = texts.get(i).substring(33,34).trim();
                System.out.println(name[i]);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String print() {
        return "PeopleGenerator{" +
                "name=" + Arrays.toString(name) +
                ", umur=" + Arrays.toString(age) +
                ", gender=" + Arrays.toString(gender) +
                '}';
    }
}
