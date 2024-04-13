import java.util.ArrayList;
public class iterateForLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //Add elements to the ArrayList
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Alto");
        cars.add("Hybrid");
        //Use get method within the for loop
        for(int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)+" ");
        }
        System.out.println();
        System.out.println(cars);
    }
}
