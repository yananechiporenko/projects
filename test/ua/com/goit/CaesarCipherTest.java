package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task9.CaesarCipher;
import ua.com.goit.task9.TextForCipher;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void testCaesarCipher() throws Exception {
        final int changeStepForCipher = 3;
        TextForCipher tFC = new TextForCipher();
        final String textForCipher = tFC.textForCipherCreate();
        final char [] myArrayForCipherResult = textForCipher.toCharArray();
        final char [] myArrayForCipherExpected = textForCipher.toCharArray();
        CaesarCipher myCaesarCipher = new CaesarCipher();

        String result = myCaesarCipher.caesarCipher(myArrayForCipherResult,changeStepForCipher);
        String expected = myCaesarCipher.caesarCipher(myArrayForCipherExpected,changeStepForCipher);

        Assert.assertEquals(expected, result);

    }
}