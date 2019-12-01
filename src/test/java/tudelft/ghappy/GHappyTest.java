package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy gHappy = new GHappy();

    @Test
    public void happyStartsWithG() {
        boolean result = gHappy.gHappy("ggarwva");
        Assertions.assertEquals(true, result);
    }
}
