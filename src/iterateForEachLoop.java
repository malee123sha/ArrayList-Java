import java.util.ArrayList;
public class iterateForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //Add elements to the ArrayList
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Alto");
        cars.add("Hybrid");
        //Use get method within the for-each loop
        for(String x : cars) {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println(cars);
    }
}


