import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

/**
 * Created by: Anton Rolin
 * Date: 09/10/2020
 * Time: 18:08
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
class PersonTest {

    public Person person = new Person("9110261234", "Liu Lingren", LocalDate.parse("2018-02-15"));

    @Test
    public final void getterTest(){
        assertTrue(person.getIdNumber().equals("9110261234"));
        assertTrue(person.getName().equals("Liu Lingren"));
        assertTrue(person.getMemberRegDate().equals(LocalDate.of(2018, 2, 15)));

        assertFalse(person.getIdNumber().equals("9110261233"));
        assertFalse(person.getName().equals("Liu Lindgren"));
        assertFalse(person.getMemberRegDate().equals(LocalDate.parse("2018-03-15")));
    }

}