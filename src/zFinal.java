import java.util.ArrayList;
import java.util.Collections;
public class zFinal {
    public static void main(String[] args) {
        //Import ArrayList class
        ArrayList <Integer> n = new ArrayList<>();

        //Add Elements
        n.add(900);
        n.add(56);
        n.add(3230);
        n.add(89);
        System.out.println(n);

        //ArrayList Size
        int s = n.size();
        System.out.println("ArrayList Size is;-"+s);

        //Remove Elements
        n.remove(3);
        n.remove(0);
        System.out.println(n);

        //ArrayList Size
        int s1 = n.size();
        System.out.println("ArrayList Size is;-"+s1);

        //Clear Elements
        n.clear();
        System.out.println(n);

        //ArrayList Size
        int s2 = n.size();
        System.out.println("ArrayList Size is;-"+s2);

        //Add Elements
        n.add(50);
        n.add(0);
        n.add(10);
        n.add(4569);
        n.add(78);
        System.out.println(n);

        //ArrayList Size
        int s3 = n.size();
        System.out.println("ArrayList Size is;-"+s3);

        //Change Elements
        n.add(0,10);
        n.add(1,20);
        System.out.println(n);

        //ArrayList Size
        int s4 = n.size();
        System.out.println("ArrayList Size is;-"+s4);

        //Remove Elements
        n.remove(5);
        n.remove(4);
        System.out.println(n);

        //Update Elements
        n.set(4,30);
        n.set(1,40);
        n.set(3,20);
        System.out.println(n);

        //ArrayList Size
        int s5 = n.size();
        System.out.println("ArrayList Size is;-"+s5);

        //ArrayList Sorting
        Collections.sort(n);
        System.out.println(n);

        //Get Elements
        Integer i = n.get(2);
        System.out.println("Index 3 Number :-"+i);
    }
}
