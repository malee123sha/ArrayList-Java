import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("D");
        letters.add("A");
        letters.add("F");
        letters.add("B");
        letters.add("E");
        letters.add("C");
        System.out.println("Before Sorting :-"+letters);
        Collections.sort(letters);    //ArrayList Sorting
        System.out.println("After Sorting  :-"+letters);
    }
}
