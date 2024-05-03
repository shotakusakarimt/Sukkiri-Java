package shoumatu10;

public class PoisonMatango extends Matango{
     int poisonCount=5;
     
     public PoisonMatango(char suffix){
        super(suffix);
    }
   
   public void attck(Hero h){
    System.out.println("お化けキノコ"+this.suffix+"の攻撃");
    System.out.println("10のダメージ");
    h.hp-=10;
    if(this.poisonCount!=0){
        System.out.println("さらに毒の胞子をばらまいた");
        int damage=h.hp/5;
        h.hp-=damage;
        System.out.println(damage+"ポイントのダメージ！");
        this.poisonCount-=1;
    }
   }

}