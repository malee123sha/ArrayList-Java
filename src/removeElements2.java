import java.util.ArrayList;
public class removeElements2 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(12);
        al.add(0);
        al.add(639);
        al.add(45);
        al.add(852);
        al.add(300);
        System.out.println("Initial Array List         :-"+al);
        //Remove Elements
        al.remove(1);
        System.out.println("After Removing Index       :-"+al);
        //Remove Element again
        al.remove(4);
        System.out.println("After Removing Index Again :-"+al);
        //Remove Element again
        al.remove(3);
        System.out.println("After Removing Index Again :-"+al);
    }
}
