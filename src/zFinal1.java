import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class zFinal1 {
        public static void main(String[] args) {
            //Import ArrayList class
            //Use List.of Method to add elements
            ArrayList<String> letters = new ArrayList<>(List.of("Z","K","C","P","U","M","L"));

            //For Loop
            for (int i = 0;i <letters.size();i++) {
                System.out.print(letters.get(i)+" ");
            }
            System.out.println();
            System.out.println("ArrayList Values :-"+letters);

            //ArrayList Size
            int l = letters.size();
            System.out.println("ArrayList Size is:-"+l);

            //Remove Elements
            String s = letters.remove(1);
            System.out.println("Removed Element  :-"+s);
            System.out.println("After Removing   :-"+letters);

            //Update Elements
            letters.set(1,"A");
            System.out.println("After Updating   :-"+letters);
            letters.set(4,"B");
            System.out.println("After Updating   :-"+letters);

            //Remove Elements
            String s1 = letters.remove(3);
            System.out.println("Removed Element  :-"+s1);
            System.out.println("After Removed    :-"+letters);

            //Change Elements
            letters.add(2,"C");
            System.out.println("After Changing   :-"+letters);

            //Sorting
            Collections.sort(letters);
            System.out.println("After Sorting    :-"+letters);

            //ArrayList Size
            int l2 = letters.size();
            System.out.println("ArrayList Size is:-"+l2);

            //Get Elements
            String a = letters.get(0);
            System.out.println("Index 0 Number is:-"+a);

            //Clear Elements
            letters.clear();
            System.out.println("After Clearing   :-"+letters);
        }
}
