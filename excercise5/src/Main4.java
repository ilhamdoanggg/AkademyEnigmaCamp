import com.enigma.model.Orang;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * |--------------------------------------------------------------------------
 * | 9/18/2019 12:22 AM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Main4{
    public static void main(String[] args) {
    Set<Orang> angga = new HashSet<>();
        angga.add(new Orang("Joe"));
        angga.add(new Orang("irfan"));
        angga.add(new Orang("nama"));
        angga.add(new Orang("sam"));
        angga.add(new Orang("adist"));
        angga.add(new Orang("roy"));
        angga.add(new Orang("arif"));
        angga.add(new Orang("rifai"));

    Set<Orang>Joe = new HashSet<>();
        Joe.add(new Orang("bambang"));
        Joe.add(new Orang("jono"));
        Joe.add(new Orang("udin"));
        Joe.add(new Orang("irfan"));
        Joe.add(new Orang("arif"));
        Joe.add(new Orang("roy"));
        Joe.add(new Orang("agam"));
        Joe.add(new Orang("ida"));

        Iterator<Orang> iterator = angga.iterator();

        while (iterator.hasNext()){
            Orang orang = iterator.next();
            System.out.println(orang.getNamaOrang());
            }

        Set<Orang> intersection = new HashSet<>(angga);
        System.out.print("Teman angga = ");
        for (Orang nama: angga){
            System.out.print(nama.getNamaOrang()+" ,");
        }

        System.out.println();
        System.out.print("Teman Joe = ");
        for (Orang nama: Joe){
            System.out.print(nama.getNamaOrang()+" ,");
        }

        System.out.println();
        intersection.retainAll(Joe);
        System.out.print("Mutual Friens = ");
        for (Orang nama: intersection){
            System.out.print(nama.getNamaOrang()+" ,");

        }
    }
}
