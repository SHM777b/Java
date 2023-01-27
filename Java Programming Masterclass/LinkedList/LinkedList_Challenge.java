import java.util.Arrays;
import java.util.LinkedList;

public class NextMain {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        System.out.println(Arrays.toString(array));


    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        System.out.printf("addPlace has been called with %s %n", place.getTown());

        for (Place p : list) {
            System.out.println("iteration");
            System.out.printf("%s", p.getTown());
        }

        System.out.println("For loop has ended");
    }
}
