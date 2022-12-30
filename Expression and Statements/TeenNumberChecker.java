public class TeenNumberChecker {

    public static boolean hasTeen(int firstInteger, int secondInteger, int thirdInteger) {

        if (isTeen(firstInteger) || isTeen(secondInteger) || isTeen(thirdInteger)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if ((age >= 13) && (age <= 19)) {
            return true;
        }
        return false;
    }
}
