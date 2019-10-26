package com.enigma.fileservice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * |--------------------------------------------------------------------------
 * | 9/18/2019 11:52 AM
 * |--------------------------------------------------------------------------
 * |This file add from Project FileService
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class FileService {
    Integer number;

    Path currentRelativePath= Paths.get("src");
    File file = new File(currentRelativePath + "/database/local/data.txt");

    public FileService(Integer number) {
        this.number = number;
    }

     public void writeText(String text){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(text);
            fileWriter.append(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("salah lo");
        }
    }
    public String print(){
        return "number" + number;
    }
}
