import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet63 {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<String>();
        tree1.add("Czerwony");
        tree1.add("Niebieski");
        tree1.add("Pomaranczowy");
        tree1.add("Zolty");
        tree1.add("Brazowy");
        System.out.println("podstawowe tree1: ");
        System.out.println(tree1);
        System.out.println("tree 1 wypisane iteratorem: {");
        Iterator<String> iter = tree1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("}");
        TreeSet<String> tree2 = new TreeSet<String>();
        tree2.add("Bialy");
        tree2.add("Czarny");
        tree2.add("Fioletowy");
        System.out.println("podstawowe tree2: ");
        System.out.println(tree2);
        tree1.addAll(tree2);
        System.out.println("tree1 z elementami tree2: ");
        System.out.println(tree1);
        System.out.println("pierwszy i ostatni element tree 1: {");
        TreeSet<String> tree3 = new TreeSet<String>(tree1);
        System.out.println("Liczba elementow w tree3: ");
        System.out.println(tree3.size());
        System.out.println("czy tree1 i tree3 sa takie same ?");
        System.out.println(tree1.retainAll(tree3));
        System.out.println("tree1 od tylu: {");
        for( int i = tree1.size(); i >= 1; i--){
            System.out.println(tree1.last());
            tree1.remove(tree1.last());
        }
        System.out.println("}");
    }
}
