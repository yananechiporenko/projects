package ua.com.goit.task9;

public class CaesarCipherRunner {
    public static void main(String[] args) {
        final int changeStepForCipher = 12;
        TextForCipher tFC = new TextForCipher();
        String textForCipher = tFC.textForCipherCreate();
        System.out.println(textForCipher);
        final char [] myArrayForCipher = textForCipher.toCharArray();
        CaesarCipher myCaesarCipher = new CaesarCipher();
        String cipherText = myCaesarCipher.caesarCipher(myArrayForCipher,changeStepForCipher);
        System.out.println(cipherText);
        String textForDecipher = myCaesarCipher.caesarCipher(myArrayForCipher,changeStepForCipher);
        Decipher myDecipher = new Decipher();
        final char [] myArrayForDecipher = textForDecipher.toCharArray();
        myDecipher.caesarDecipher(myArrayForDecipher,changeStepForCipher);
        String decipherText = myDecipher.caesarDecipher(myArrayForDecipher,changeStepForCipher);
        System.out.println(decipherText);
    }

}
