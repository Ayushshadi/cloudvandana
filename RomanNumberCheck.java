import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an array and shuffle it
        List<Integer> myArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Collections.shuffle(myArray);
        System.out.println("Shuffled array: " + myArray);

        // Convert a Roman numeral to an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integerVal = romanToInteger(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + integerVal);

        // Check if the input is a pangram
        System.out.print("Enter a sentence to check if it's a pangram: ");
        String inputSentence = scanner.nextLine();
        boolean isPangram = isPangram(inputSentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    // Function to convert a Roman numeral to an integer
    public static int romanToInteger(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanNumerals.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    // Function to check if a string is a pangram
    public static boolean isPangram(String s) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        for (char c : s.toLowerCase().toCharArray()) {
            alphabet.remove(c);
            if (alphabet.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
