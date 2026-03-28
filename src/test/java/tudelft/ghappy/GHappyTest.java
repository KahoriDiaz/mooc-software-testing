package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({
            // casos normales
            "xxggxx, true",
            "gg, true",
            "gggg, true",

            // g sola
            "g, false",
            "xxgxx, false",

            // mezcla
            "xxggyygxx, false",

            // límites
            "gxx, false",     // g al inicio
            "xxg, false",     // g al final
            "ggx, true",      // grupo al inicio
            "xgg, true"       // grupo al final
    })
    public void testGHappy(String input, boolean expected) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}
