import java.util.*;

public class StringPermutationWithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        ArrayList<String> result = permute(str, "");
        System.out.println("Permutations of the string are: " + result);
        sc.close();
    }
    public static ArrayList<String> permute(String str, String prefix) {
        ArrayList<String> permutations = new ArrayList<>();
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                ArrayList<String> sub = permute(rem, prefix + str.charAt(i));
                for (String s : sub) {
                    if (!permutations.contains(s)) {
                        permutations.add(s);
                    }
                }
            }
        }
        return permutations;
    }   

}


/*

// Import ArrayList class to store permutations
import java.util.ArrayList;

// Import Scanner class to take input from user
import java.util.Scanner;

public class StringPermutationWithoutDuplicate {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the full string input from user
        String str = sc.nextLine();

        // Call the permute method with the input string and an empty prefix
        // This will return all unique permutations of the string
        ArrayList<String> result = permute(str, "");

        // Print all permutations
        System.out.println("Permutations of the string are: " + result);

        // Close scanner to avoid memory leaks
        sc.close();
    }

    // Recursive function to generate all permutations of a string
    public static ArrayList<String> permute(String str, String prefix) {
        // Create an ArrayList to store current level permutations
        ArrayList<String> permutations = new ArrayList<>();

        // Base case: if string is empty, add prefix as one valid permutation
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Remove the chosen character (at index i) from the string
                String rem = str.substring(0, i) + str.substring(i + 1);

                // Recursively generate permutations of remaining string
                // Add the chosen character (str.charAt(i)) to the prefix
                ArrayList<String> sub = permute(rem, prefix + str.charAt(i));

                // Add unique permutations from the recursive call
                for (String s : sub) {
                    if (!permutations.contains(s)) { // Check to avoid duplicates
                        permutations.add(s);
                    }
                }
            }
        }
        // Return all unique permutations found
        return permutations;
    }   
}

*/