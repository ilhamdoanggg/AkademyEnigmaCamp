import com.enigma.model.Jalan;
import com.enigma.model.Mobil;
import com.sun.corba.se.spi.activation._ServerManagerImplBase;

import java.io.FilterReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan kordinat mobil x, y :");
        String titik = br.readLine();
        String[] value = titik.split(",");
        Jalan mobil = new Jalan(Integer.parseInt(value[0]), Integer.parseInt(value[1]));

        System.out.print("masukan jumblah bensin :" );
        String jumblahBensin = br.readLine();
        Integer bensin = Integer.parseInt(jumblahBensin);
        mobil.addFuel(bensin);

        System.out.print("masukan perintah :" );
        mobil.setCommand(br.readLine());
        mobil.runs();
        System.out.println(mobil.print());

    }
}
