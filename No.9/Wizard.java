package renshu;

public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
        h.hp+=10;
        System.out.println(h.name+"のHPを10ポイント回復した");
    }
}
