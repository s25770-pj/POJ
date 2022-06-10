package ArrayList;

import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args){
        ArrayList<Integer> liczby_pierwsze = new ArrayList<Integer>();
        for(Integer i=-1; i<=100; i++){
            liczby_pierwsze.add(i+1);
            i++;
        }
        for(Integer j=1; j<=50; j++) {
            System.out.println(j + " liczba parzysta: " + liczby_pierwsze.get(j));
        }
    }
}
