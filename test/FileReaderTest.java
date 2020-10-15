import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by: Anton Rolin
 * Date: 13/10/2020
 * Time: 18:48
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
class FileReaderTest {

    FileReader fileReader = new FileReader();

    @Test
    public final void readFromFileAddToListTest(){
       List<Person> customers = fileReader.readFromFileAddToList("src/customers.txt");

        assertNotNull(customers);
    }

    @Test
    public final void isCurrentMemberTest(){
        Person person1 = new Person("321093321", "Kalle", LocalDate.parse("2020-06-14"));
        assertTrue(fileReader.isCurrentMember(person1));

        Person person2 = new Person("321093321", "Kalle", LocalDate.parse("2019-06-14"));
        assertFalse(fileReader.isCurrentMember(person2));
    }
}
