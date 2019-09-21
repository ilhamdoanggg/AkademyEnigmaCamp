package com.enigma.model;

import javax.jws.Oneway;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * ----------------------------------------------------
 * 9/18/2019 20:29 PM
 * ----------------------------------------------------
 * This file add from Project FileService
 *
 * @author Ilhamdoanggg hanya manusia
 **/
public class GeneratePeople {

    List<String > name = new ArrayList<>();
    List<String > age = new ArrayList<>();
    List<String > gender = new ArrayList<>();

    public void ReadFile(){
        /**
         * path pembuatan file
         * */
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
                name.add(texts.get(i).substring(0,30).trim());
                age.add(texts.get(i).substring(30,33).trim());
                gender.add(texts.get(i).substring(33,34).trim());
                }

            Integer umur1 = Integer.parseInt(texts.get(0).substring(31,34).trim());
            Integer umur2 = Integer.parseInt(texts.get(1).substring(31,34).trim());
            Integer umur3 = Integer.parseInt(texts.get(2).substring(31,34).trim());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "GeneratePeople{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
