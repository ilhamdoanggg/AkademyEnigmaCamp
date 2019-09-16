package com.enigma.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop {
    public static void main(String[] args) throws IOException {
        Mobiljalan mobiljalan = new Mobiljalan();
        BufferedReader baris = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan perintah :");
        String bergerak= baris.readLine();
        //mobiljalan.setCommand(bergerak);
        System.out.println();
    }
}
