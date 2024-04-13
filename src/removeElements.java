import java.util.ArrayList;
public class removeElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maleesha");
        names.add("Kavindu");
        names.add("Nadeeka");
        names.add("Imasha");
        names.add("Sanduni");
        System.out.println("Before Removing Elements :-"+names);
        String st = names.remove(3);
        System.out.println("Removed Element :-"+st);
        System.out.println("After Removing Elements  :-"+names);
    }
}
