import java.util.ArrayList;
public class insertElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maleesha");
        names.add("Kavindu");
        names.add("Nadeeka");
        names.add("Imasha");
        names.add("Sanduni");
        System.out.println("Before Adding Elements  :-"+names);
        names.add(1,"Rose");
        System.out.println("After Removing Elements :-"+names);
    }
}
