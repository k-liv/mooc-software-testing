package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mirror = new Mirror();

    @Test
    public void partialMirrorEven() {
        String result = mirror.mirrorEnds("abWXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void partialMirrorUneven() {
        String result = mirror.mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void fullMirrorUneven() {
        String result = mirror.mirrorEnds("abcba");
        Assertions.assertEquals("abcba", result);
    }

    @Test
    public void fullMirrorEven() {
        String result = mirror.mirrorEnds("abccba");
        Assertions.assertEquals("abccba", result);
    }

    @Test
    public void notMirror() {
        String result = mirror.mirrorEnds("abcd");
        Assertions.assertEquals("", result);
    }
}
