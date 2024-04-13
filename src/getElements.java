import java.util.ArrayList;
public class getElements {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(56);
        num.add(45);
        num.add(400);
        num.add(1000);
        Integer i = num.get(3);   //get method
        System.out.println("Index 3 Number :-"+i);
    }
}
