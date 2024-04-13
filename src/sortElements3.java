import java.util.ArrayList;
import java.util.Collections;
public class sortElements3 {
        public static void main(String[] args) {
            ArrayList<Integer> myNum = new ArrayList<>();
            myNum.add(2);
            myNum.add(536);
            myNum.add(0);
            myNum.add(8634);
            myNum.add(1000);
            System.out.println("Before Sorting:-"+myNum);
            Collections.sort(myNum); //Sorting
            for (int y : myNum) {
                System.out.print(y+" * ");
            }
            System.out.println();
            System.out.println("After Sorting :-"+myNum);
        }
}
