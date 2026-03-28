package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "msg={0}, shift={1}, result={2}")
    @CsvSource({
            // casos normales
            "abc,3,def",
            "xyz,3,abc",
            "hello,1,ifmmp",

            // shift negativo
            "abc,-1,zab",

            // con espacios (DEBE funcionar)
            "'a b',1,'b c'",

            // caracteres inválidos
            "abc1,2,invalid",
            "abc!,2,invalid"
    })
    public void testCipher(String message, int shift, String expected) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}
