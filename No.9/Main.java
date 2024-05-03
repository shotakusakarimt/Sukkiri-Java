
public class Main {
    public static void main(String[] args){
    Hero h1=new Hero();
    h1.name="しょうた";
    h1.hp=100;
    Hero h2=new Hero();
    h2.name="れん";
    h2.hp=200;
    Wizard w=new Wizard();
    w.name="かいと";
    w.hp=50;
    w.heal(h1);
    w.heal(h2);
    //w.heal(w);
    }
}
