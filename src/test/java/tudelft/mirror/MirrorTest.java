package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorInMiddle() {
        // "abXYZba" → "ab"
        Assertions.assertEquals("ab", new Mirror().mirrorEnds("abXYZba"));
    }

    @Test
    public void singleCharMirror() {
        // "abca" → "a"
        Assertions.assertEquals("a", new Mirror().mirrorEnds("abca"));
    }

    @Test
    public void fullStringOddLength() {
        // "aba" → "aba"
        Assertions.assertEquals("aba", new Mirror().mirrorEnds("aba"));
    }

    @Test
    public void emptyString() {
        Assertions.assertEquals("", new Mirror().mirrorEnds(""));
    }

    @Test
    public void noMirror() {
        // "abcd" → ""
        Assertions.assertEquals("", new Mirror().mirrorEnds("abcd"));
    }

    @Test
    public void evenLengthFullMirror() {
        // "abba" → "ab"
        Assertions.assertEquals("ab", new Mirror().mirrorEnds("abba"));
    }

    @Test
    public void singleChar() {
        // "x" → "x"
        Assertions.assertEquals("x", new Mirror().mirrorEnds("x"));
    }

    @Test
    public void allSameChars() {
        // "aaa" → "aaa"
        Assertions.assertEquals("aaa", new Mirror().mirrorEnds("aaa"));
    }
}
