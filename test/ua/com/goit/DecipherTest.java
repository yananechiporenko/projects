package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task9.CaesarCipher;
import ua.com.goit.task9.Decipher;
import ua.com.goit.task9.TextForCipher;

import static org.junit.Assert.*;

public class DecipherTest {

    @Test
    public void testCaesarDecipher() throws Exception {
        final int changeStepForCipher = 12;
        TextForCipher tFC = new TextForCipher();
        String textForCipher = tFC.textForCipherCreate();
        final char [] myArrayForCipher = textForCipher.toCharArray();
        CaesarCipher myCaesarCipher = new CaesarCipher();
        String cipherText = myCaesarCipher.caesarCipher(myArrayForCipher,changeStepForCipher);
        final char [] myArrayForDecipherResult = cipherText.toCharArray();
        final char [] myArrayForDecipherExpected = cipherText.toCharArray();
        Decipher myDecipher = new Decipher();

        final String result = myDecipher.caesarDecipher(myArrayForDecipherResult,changeStepForCipher);
        final String expected = myDecipher.caesarDecipher(myArrayForDecipherExpected,changeStepForCipher);

        Assert.assertEquals(expected, result);

    }
}