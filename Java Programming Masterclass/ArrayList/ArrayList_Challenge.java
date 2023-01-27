import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {


        while(true) {
            printActions();
            String userInput = scanner.nextLine();

            if (userInput.equals("0")) {
                System.out.println("\nExiting the program...");
                break;
            } else if (userInput.equals("1")) {
                addItem();
            } else if (userInput.equals("2")) {
                removeItem();
            }
        }
    }

    private static void printActions() {
        String textBlock = """
                    Available actions:
                    0 - Shutdown
                    1 - Add item(s) to list (comma delimited)
                    2 - Remove any items (comma delimited)
                    
                    Enter a number for which action you want to do:""";

        System.out.print(textBlock + " ");
    }

    private static void addItem() {
        System.out.println("Please enter the comma delimited items to add to the list:");
        String userInput = scanner.nextLine();
        String[] input = cleanUserInput(userInput);
        for (String item : input) {
            if (groceryList.indexOf(item) < 0) {
                groceryList.add(item);
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("The updated list is: " + groceryList + "\n");
    }

    private static void removeItem() {
        System.out.println("Please enter the comma delimited items to remove from the list:");
        String userInput = scanner.nextLine();
        String[] input = cleanUserInput(userInput);
        groceryList.removeAll(List.of(input));
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("The updated list is: " + groceryList + "\n");
    }

    private static String[] cleanUserInput(String userInput) {
        String[] input = userInput.split(",");
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].trim().toLowerCase();
        }
        return input;
    }
}
