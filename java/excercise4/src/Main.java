import com.enigma.model.*;

public class Main {
    public static void main(String[] args) {
        Creep grobag = new Creep(300,10);
        Skill lari = new Skill("jump", 50,100 );
        Skill tonjok = new Skill("tonjok", 50,1000 );
        Tower tower = new Tower("jump", 50,100 );
        Heros Wiro = new Heros(100, 50,"Assasin", "heros", 100, lari );
        Heros saitama = new Heros(1000, 500,"Assasin", "heros", 1000, tonjok );

        saitama.castSkill(Wiro);
        System.out.println(grobag.toString());
        System.out.println(saitama.toString());
        System.out.println(Wiro.toString());

    }
}
