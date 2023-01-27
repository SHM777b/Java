import java.util.Arrays;
import java.util.Random;

/*
Create a program using arrays, that sorts a list of integers, in descending order.

First, create an array of randomly generated integers.
Print the array before oyu sort it.
Print the array after you sort it.

You can choose to creat a new sorted array or sort the current array.
 */
public class Main {

    public static void main(String[] args) {
        // Let's start with creating an array with a length of 10 filled with random integers between 0 and 199 and
        // printing out its content.
        int[] s = new int[10];
        Random random = new Random();
        for (int i = 0; i < s.length; i++) {
            s[i] = random.nextInt(200);
        }
        System.out.println("The original array:  " + Arrays.toString(s));

        // Now let's create a copy of the array s, called s2, to do the manipulations and print its content too.
        int[] s2 = Arrays.copyOf(s, s.length); // in ascended order
        Arrays.sort(s2);
        System.out.println("Sorted array in ascending order: " +
                            Arrays.toString(s2));

        // Let's initialize a third array, s3, with the elements set to zero and fill it with the reverse order of the s2
        // array
        int[] s3 = new int[s2.length];

        // Now let's revers the order in s2
        for (int i = 0; i < s2.length; i++) {
            s3[i] = s2[s2.length - 1 - i];
        }

        System.out.println("Sorted array in descending order: " +
                Arrays.toString(s3));


        // Another way to have the sorted array with descending order is to develop your own sorting algorithm.
        int[] s_sorted = sortIntegers(s);
        System.out.println("Sorted array in descending order: " + Arrays.toString(s_sorted));

        int a = 5;
        modifyInt(a);
        System.out.println(a);

        int[] b = new int[3];
        modifyArray(b);
        System.out.println(Arrays.toString(b));

    }

    public static void modifyArray(int[] c) {
        c[0] = 2;
    }

    public static void modifyInt(int b) {
        b = 2;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
