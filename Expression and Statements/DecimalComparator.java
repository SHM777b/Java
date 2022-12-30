public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstVariable, double secondVariable) {
        int firstVariableInteger = (int) firstVariable;
        int firstVariableFractional = (int) (firstVariable * 1000 % 1000);

        int secondVariableInteger = (int) secondVariable;
        int secondVariableFractional = (int) (secondVariable * 1000 % 1000);

        if ((firstVariableInteger == secondVariableInteger) && (firstVariableFractional == secondVariableFractional)) {
            return true;
        }
        return false;
    }
}
