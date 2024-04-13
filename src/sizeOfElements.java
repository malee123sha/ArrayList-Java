import java.util.ArrayList;
public class sizeOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(20);
        num.add(100);
        num.add(789);
        num.add(2000);
        num.add(34);
        num.add(12);
        int x = num.size();   //ArrayList Size
        System.out.println("ArrayList Size :-"+x);
    }
}
