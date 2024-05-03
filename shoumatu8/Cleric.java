import java.util.*;

public class Cleric{
   String name;
   int HP;
   final int maxHP=50;
   int MP;
   final int maxMP=10;
}
public void selfAid(){
     System.out.println(this.name+"はセルフエイドを唱えた");
     this.HP=this.maxHP;
     this.MP-=5;
}

public int pray(int sec){
    System.out.println(this.name+"は"+sec+"秒、祈りを行った");
    int fortune=new java.util.Random().nextInt(3)+sec;
    int fortuneActual=Math.min(this.maxMP-this.MP,fortune);
    this.MP+=fortuneActual;
    System.out.println(this.name+"のMPが"+fortuneActual+"回復した");
        return fortuneActual;
}

public void main(String[] args){
    int input=new java.util.Scanner(System.in).nextInt();
    pray(input);
}