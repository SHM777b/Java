import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

    // CHALLENGE 1
    /*
    Write a string literal regular expression that will match the following String.
    Use the String.matches() method to verify your answer.
    String challenge1 = "I want a bike."
     */
        String challenge1 = "I want a bike.";

        System.out.println(challenge1.matches(".+ bike\\.$"));
    // CHALLENGE 2
    /*
    Write a string literal regular expression that will match the following Strings.
    Use the String.matches() method to verify your answer.
    String challenge1 = "I want a bike.";
    String challenge2 = "I want a ball.";
     */
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("^I want a b\\w+\\.$"));
        System.out.println(challenge2.matches("^I want a b\\w+\\.$"));

    // CHALLENGE 3
    /*
    In the last challenge, we used the same regular expression twice. Use the Matcher.matches() method to check for matches,
    instead of String.matches(), for the regular expression that uses \w+.
     */
        String challenge3 = "^I want a b\\w+\\.$";

        Pattern patternChallenge3 = Pattern.compile(challenge3);

        Matcher matcherChallenge31 = patternChallenge3.matcher(challenge1);
        Matcher matcherChallenge32 = patternChallenge3.matcher(challenge2);

        System.out.println(matcherChallenge31.matches());
        System.out.println(matcherChallenge32.matches());

    // CHALLENGE 4
    /*
    Replace all occurrences of blank with an underscore for the following string. Print out the resulting string.
     String challenge4 = "Replace all blanks with underscore";
     */

        String challenge4 = "Replace all blanks with underscore";
        System.out.println(challenge4.replaceAll("\\s", "_"));


    // CHALLENGE 5
    /*
    Write a regular expression that will match the following string in its entirety. Use the String.matches() method to
    verify your answer
    String challenge5 = "aaabccccccccdddefffg";
     */

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+")); // Using the character class
        System.out.println(challenge5.matches("[a-g]+")); // Using the range

    // CHALLENGE 6
    /*
    Write a regular expression that will only match the challenge 5 string in its entirety
     */

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$")); // Using the quantifier
    // CHALLENGE 7
    /*
    Write a regular expression that will match a string that starts with a series of letters. The letters must be followed
    by a period. After the period, there must be series of digits. The string "kjisl.22" would match. The string "f5.12a"
    would not. Use this string to test your regular expression:
    String challenge7 = "abcd.135";
     */
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[a-zA-Z]+\\.\\d+$"));

    // CHALLENGE 8
    /*
    Modify the regular expression from the challenge 7 to use a group, so that we can print all the digits that occur in
    a string that contains multiple occurrences of the pattern. Write all the code required to accomplish this (create a
    pattern and matcher, etc.). Use the following string to test your code:
    String challenge8 = "abcd.135uvqz.7tzik.999";
     */

        String challenge8 = "abcd.135uvqz.7tzik.999";
        String challenge8RegEx = "[a-zA-Z]+\\.(\\d+)";

        Pattern challenge8Pattern = Pattern.compile(challenge8RegEx);
        Matcher challenge8Matcher = challenge8Pattern.matcher(challenge8);

        while (challenge8Matcher.find()) {
            System.out.println("Occurrence: " + challenge8Matcher.group(1));
        }

    // CHALLENGE 9
    /*
    Let's suppose we're reading strings that match the patters we used in challenge 7 and 8 from a file.
    Tabs are used to separate the matches, with one exception. The last match is followed by a newline.
    Our revised challenge 8 string would look like this:
    String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

    revise the regular expression accordingly and extract all the numbers, as we did in challenge 8.
     */

        System.out.println("-".repeat(20));
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String challenge9RegEx = "[a-zA-Z]+\\.(\\d+)\\s";
        Pattern challenge9Pattern = Pattern.compile(challenge9RegEx);
        Matcher challenge9Matcher = challenge9Pattern.matcher(challenge9);

        while (challenge9Matcher.find()) {
            System.out.println("Occurrence: " + challenge9Matcher.group(1));
        }

    // CHALLENGE 10
    /*
    Instead of printing out the numbers themselves, print out their start and end indices. use the same string we used in
    challenge 9. Make those indices inclusive. For example, the start index printed for 135 should be 5, and the end index
    should be 7.
     */

        System.out.println("-".repeat(20));
        challenge9Matcher.reset();
        while (challenge9Matcher.find()) {
            System.out.println("Occurrence: " + challenge9Matcher.group(1) + " starts at " +
                    challenge9Matcher.start(1) +
                    " ends at " + (challenge9Matcher.end(1) - 1));
        }

    // CHALLENGE 11
    /*
    Suppose we have the following string containing points on a graph within curly braces.
    Extract what is in the curly braces
    String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
     */
        System.out.println("-".repeat(20));
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String regEx11 = "\\{(\\d+), (\\d+)\\}";

        Pattern pattern11 = Pattern.compile(regEx11);
        Matcher matcher11 = pattern11.matcher(challenge11);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (matcher11.find()) {
            try {
                numbers.add(Integer.parseInt(matcher11.group(1)));
                numbers.add(Integer.parseInt(matcher11.group(2)));
            } catch(NumberFormatException e) {
                System.out.println("Found this: " + matcher11.group(1) + "and this: " + matcher11.group(2));
                System.out.println("Did not manage to convert them into integers");
            };

        }

        System.out.println(numbers);


    // CHALLENGE 12
    /*
    Write a regular expression that will match a 5-digit US zip code. Use "11111" as your test string
     */
        System.out.println("-".repeat(20));
        String challenge12 = "11111";
        String regEx12 = "^\\d{5}$";
        Pattern pattern12 = Pattern.compile(regEx12);
        Matcher matcher12 = pattern12.matcher(challenge12);

        System.out.println(matcher12.matches());


    // CHALLENGE 13
    /*
    US zip codes can be followed by a dash and another four numbers. Write a regular expression that will match those zip
    codes. Use "11111-1111" as your test string.
     */

        System.out.println("-".repeat(20));
        String challenge13 = "11111-1111";
        String regEx13 = "^\\d{5}-\\d{4}$";
        Pattern pattern13 = Pattern.compile(regEx13);
        Matcher matcher13 = pattern13.matcher(challenge13);

        System.out.println(matcher13.matches());
    // CHALLENGE 14
    /*
    Write a regular expression that will match 5-digit US zop codes, and zip codes that contain the optional 4-digits
    preceded by a dash.
     */

        System.out.println(challenge12.matches("^\\d{5}-?\\d{0,4}"));
        System.out.println(challenge13.matches("^\\d{5}-?\\d{0,4}"));
    }
} 
