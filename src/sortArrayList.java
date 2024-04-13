import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(2);
        num.add(536);
        num.add(0);
        num.add(5632);
        num.add(52);
        num.add(863);
        num.add(45);
        num.add(1000);
        System.out.println("Before Sorting:-"+num);
        Collections.sort(num);    //ArrayList Sorting
        System.out.println("After Sorting :-"+num);
    }
}
