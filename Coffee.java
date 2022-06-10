package Coffee;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args){
        var Kawy = new ArrayList<String>();
        Kawy.add("espresso");
        Kawy.add("latte");
        Kawy.add("cappuccino");
        Kawy.add("mocha");
        Kawy.add("auLait");
        Kawy.add("macchiato");


        int g = 0;
        System.out.println("( " + Kawy.get(g) + ", " + Kawy.get(g+1) + ", " +Kawy.get(g+2) + ", " +Kawy.get(g+3) +  ", " + Kawy.get(g+4) + ", " + Kawy.get(g+5) + " )");
        Iterator<String> kawa = Kawy.iterator();
        for(int j = 0; j<=5; j++) {
            System.out.println(kawa.next());
        }
        for(String x:Kawy){
            System.out.println(x.toUpperCase());
        }
        for(int i=0; i<=Kawy.size(); i++) {
            String str = Kawy.get(i);
            String actualValue = str.substring(0,4);
            System.out.println(actualValue);
        }
    }
}
