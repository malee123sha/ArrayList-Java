import java.util.ArrayList;
public class updateElement2 {
    public static void main(String[] args) {
        ArrayList<Integer>  n = new ArrayList<>();
        //Adding Elements to the ArrayList
        n.add(100);
        n.add(200);
        n.add(300);
        n.add(400);
        n.add(600);
        n.add(700);
        n.add(800);
        n.add(1000);
        System.out.println("Before Update       :-"+n);
        //Changing specifying the Index to be added
        n.add(4,500);
        System.out.println("After First Update  :-"+n);
        n.add(8,900);
        System.out.println("After Second Update :-"+n);
    }
}
