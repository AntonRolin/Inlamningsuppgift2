import java.util.List;
import java.util.Scanner;

/**
 * Created by: Anton Rolin
 * Date: 12/10/2020
 * Time: 19:53
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
public class GymApplication {

    public void userInputOutput(List<Person> customers) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in namn eller personnummer: ");
        String input = scan.nextLine();

        Person searchPerson = searchPerson(input, customers);

        if (searchPerson == null) {
            System.out.println("Personen finns inte registrerad i systemet!");
        }
        else if (searchPerson.getIsCurrentMember()){
            System.out.println("Personens medlemskap är aktivt!");
            FileReader writer = new FileReader();
            writer.printToFile(searchPerson);
            }
        else{
            System.out.println("Personens medlemskap har gått ut!");
        }
    }

    public Person searchPerson(String input, List<Person> customers){

        for (Person person: customers) {
            if(input.equalsIgnoreCase(person.getIdNumber()) || input.equalsIgnoreCase(person.getName()))
                return person;
        }
        return null;
    }
}
