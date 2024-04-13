import java.util.ArrayList;
public class addElementsBetweenTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(1,10);  //add missing element
        System.out.println(num);
    }
}
