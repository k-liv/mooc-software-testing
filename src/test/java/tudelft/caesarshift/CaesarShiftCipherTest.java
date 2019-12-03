package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher = new CaesarShiftCipher();

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "potato,5,utyfyt", "potato,0,potato", "potato,26,potato" })
    public void positiveShift(String message, int shift, String expected) {
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "potato,-16,zydkdy", "potato,-28,nmryrm" })
    public void negativeShift(String message, int shift, String expected) {
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void invalidInput() {
        String result = cipher.CaesarShiftCipher("POTATO", 4);
        Assertions.assertEquals("invalid", result);
    }
}
