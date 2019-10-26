import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readline{
    String display(){
        return"java nih";
    }

    public static void main(String[] args) throws IOException {
        Readline o = new Readline() ;
        System.out.printf(o.display());
/*
        BufferedReader baris = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(Integer.parseInt(baris.readLine()));
        String jumblahdata = baris.readLine();*/


    }
//    static Integer
}