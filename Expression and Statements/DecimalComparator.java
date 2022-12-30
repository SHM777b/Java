/* 
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
*/

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
