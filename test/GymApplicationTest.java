import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by: Anton Rolin
 * Date: 15/10/2020
 * Time: 15:40
 * Project: Inlamningsuppgift_2
 * Copyright: MIT
 */
public class GymApplicationTest {
    GymApplication gym = new GymApplication();
    List<Person> customers = new FileReader().readFromFileAddToList("src/customers.txt");

    @Test
    public final void searchPersonTest(){

        assertNull(gym.searchPerson("Diamanda Djodi", customers));
        assertNull(gym.searchPerson("7608021235", customers));

        assertNotNull(gym.searchPerson("Diamanda Djedi", customers));
        assertNotNull(gym.searchPerson("7608021234", customers));

    }
}
