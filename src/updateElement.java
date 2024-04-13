import java.util.ArrayList;
public class updateElement {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Maleesha");
        names.add("Kavindu");
        names.add("Nadeeka");
        names.add("Imasha");
        names.add("Sanduni");
        System.out.println("Before Changing Elements:-"+names);
        names.set(2,"Udara");
        System.out.println("After Changing Elements :-"+names);
    }
}
