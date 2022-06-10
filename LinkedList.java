import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) {

        ArrayList<String> Lista = new ArrayList<String>(5);
        Lista.add("A");
        Lista.add("B");
        Lista.add("C");
        Lista.add("D");
        Lista.add("E");
        System.out.println("Poczatkowa lista: ");
        for(int i=0; i<=Lista.size()-1;i++) {
            System.out.println(Lista.get(i));
        }
        System.out.println("Usuniete elementy: ");
        System.out.println(Lista.get(0));
        System.out.println(Lista.get(Lista.size()-1));
        Lista.remove(0);
        Lista.remove(Lista.size()-1);

        System.out.println("Lista bez pierwszej i ostatniej pozycji: ");
        for(int i=0; i<=Lista.size()-1;i++) {
            System.out.println(Lista.get(i));
        }
    }
}
