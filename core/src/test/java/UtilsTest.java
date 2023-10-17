import org.example.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    @Test
    void isAllPositiveNumbers (){
        assertTrue(Utils.isAllPositiveNumbers("15", "234234","1111","1","2332438324723"));
    }
}
