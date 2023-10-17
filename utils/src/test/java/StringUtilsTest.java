import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void strIsPositiveNumberTest(){
        StringUtils stringUtils = new StringUtils();

        boolean isPositiveNumber = stringUtils.isPositiveNumber("45");

        assertTrue(isPositiveNumber);
    }

    @Test
    public void strIsNegativeNumberTest(){
        StringUtils stringUtils = new StringUtils();

        boolean isNegativeNumber = stringUtils.isPositiveNumber("-45");

        assertFalse(isNegativeNumber);
    }
}
