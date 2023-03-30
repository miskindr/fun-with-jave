import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;  // Import the Scanner class

public class ArrayL {
    public static void main(String[] args) {
        // create the Arraylist object and Scanner object
        ArrayList<String> names = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);

        // Create a list of names
        while (names.size() < 4){
            System.out.println("Enter a name: ");

            // get user input to put name into list
            String name = myObj.nextLine();

            names.add(name);

        }
        System.out.println("Here are the names in the Array List");
        // Go through the names in the list and print them out
        for (String i : names){
            System.out.println(i);
        }
    }
        

}
