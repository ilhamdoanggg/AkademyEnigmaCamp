import com.enigma.model.Creep;
import com.enigma.model.Heros;
import com.enigma.model.Skill;
import com.enigma.model.Tower;
import com.sun.corba.se.impl.oa.toa.TOA;

public class Main {
    public static void main(String[] args) {
        Creep grobag = new Creep(300,10);
        Skill lari = new Skill("jump", 50,100 );
        Skill tonjok = new Skill("tonjok", 50,100 );
        Tower tower = new Tower("jump", 50,100 );
        Heros Wiro = new Heros(100, 50,"Assasin", "heros", 100, lari );
        Heros saitama = new Heros(1000, 500,"Assasin", "heros", 1000, tonjok );

        saitama.castSKill(grobag);
        System.out.println(grobag.toString());
        System.out.println(saitama.toString());
        System.out.println(Wiro.toString());

    }
}
