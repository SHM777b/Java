public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        // NOTE: 1 mile per hour is 1.609 kilometers per hour
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609d);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
