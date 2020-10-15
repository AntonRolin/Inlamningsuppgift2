import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by: Anton Rolin
 * Date: 10/10/2020
 * Time: 18:30
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
public class FileReader {

    public List<Person> readFromFileAddToList(String path){
        List<Person> customers = new ArrayList<>();

        try {
            Scanner fileInput = new Scanner(new File(path));

            while (fileInput.hasNextLine()) {
                String tempLine;
                tempLine = fileInput.nextLine();

                int i = tempLine.indexOf(',');
                String idNumber = tempLine.substring(0, i);
                String name = tempLine.substring(i + 1).trim();

                LocalDate memberRegDate = LocalDate.parse(fileInput.nextLine());

                Person person = new Person(idNumber, name, memberRegDate);
                person.setCurrentMember(isCurrentMember(person));
                customers.add(person);

            }
        }catch(IOException e){
            System.out.println("ERROR: COULD NOT FIND SPECIFIED FILE!");
        }

        return customers;
    }

    public boolean isCurrentMember(Person person){
        return person.getMemberRegDate().isAfter(LocalDate.now().minusYears(1));
    }

    public void printToFile(Person person){
        File file = new File("src/membervisits.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter writer = new PrintWriter(new FileWriter(file, true));
            writer.write(person.getIdNumber() + ";" + person.getName() + ";" + LocalDate.now() + "\n");
            writer.close();
        }catch(IOException e){
            System.out.println("ERROR: COULD NOT LOG VISIT!");
        }
    }
}
