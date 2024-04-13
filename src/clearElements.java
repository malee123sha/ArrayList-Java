import java.util.ArrayList;
public class clearElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maleesha");
        names.add("Kavindu");
        names.add("Nadeeka");
        names.add("Imasha");
        names.add("Sanduni");
        System.out.println("Before Clearing :-"+names);
        names.clear();
        System.out.println("After Clearing  :-"+names);
    }
}
