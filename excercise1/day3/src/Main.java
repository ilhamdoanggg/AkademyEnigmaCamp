import com.enigma.model.Circle;
import com.enigma.model.Mobil;
import com.enigma.model.Mobiljalan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader baris = new BufferedReader(new InputStreamReader(System.in));

        Mobiljalan mobil = new Mobiljalan();
        System.out.print("masukan jumblah bensin :");
        String jumblahBensin = baris.readLine();

/*
        System.out.print("Masukan Posisi Awal mobil anda :");
        String titik = baris.readLine();
        String[] value = titik.split("[,?.@]+");

        //System.out.println(value);
        String titikx = value[0];
        String titiky = value[1];
        System.out.println("titik x = " +titikx+ " titik y = " +titiky);

*/
        System.out.print("Masukan perintah :");
        String bergerak= baris.readLine();
        String[] valueBergerak = bergerak.split("[,?.@]+");
        for (){


        }
        //
        //String titiky= baris.readLine();
        //titikx.toCharArray();*/
////     jumblahArray   for (String a : value){
//            //Integer titikx =
//            System.out.println(a);
//        }
        //System.out.println(titik);

        //System.out.println(Arrays.(value));

        //titikx.();
        /*System.out.print("Masukan Posisi Awal mobil anda :");
        String titiky= baris.readLine();
        titikx.toCharArray();*/
        //System.out.print("poin awal anda " + titikx +"," /*titiky*/ );

     //   Mobiljalan mobiljalan = new Mobiljalan();
        //mobiljalan.isFluel();




/*        Circle roda = new Circle();
        roda.r=30;
        System.out.println(roda.print());

        System.out.println("===========>");

        Circle roda2 = new Circle();
        roda.r=30;
        System.out.println(roda.print());*/
    }
}
