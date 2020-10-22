import java.io.IOException;
import java.util.*;

/**
 * Created by: Anton Rolin
 * Date: 12/10/2020
 * Time: 18:27
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
public class MainDemo {
    public static void main(String[] args) throws IOException {
        List<Person> customers;

        FileReader reader = new FileReader();
        customers = reader.readFromFileAddToList("src/customers.txt");

        GymApplication program = new GymApplication();
        Scanner scan = new Scanner(System.in);

        while(true) {
            program.userInputOutput(customers);
            System.out.println();
            System.out.println("Vill du mata in fler personer?");
            System.out.println("1. Ja");
            System.out.println("2. Nej");
            String input = scan.nextLine();
            if (!input.equals("1"))
                break;
        }
    }
}
