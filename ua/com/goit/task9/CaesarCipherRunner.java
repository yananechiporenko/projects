package ua.com.goit.task9;

import java.io.*;

public class CaesarCipherRunner {
    public static void main(String[] args) throws IOException {
        final int changeStepForCipher = 12;
        TextForCipher tFC = new TextForCipher();
        String textForCipher = tFC.textForCipherCreate();
        System.out.println(textForCipher);
        final char [] myArrayForCipher = textForCipher.toCharArray();
        CaesarCipher myCaesarCipher = new CaesarCipher();
        String cipherText = myCaesarCipher.caesarCipher(myArrayForCipher,changeStepForCipher);
        System.out.println(cipherText);

        String writeText = "Caesar cipher.txt";
        char [] myArrayForDecipher1 = new char[myArrayForCipher.length];


        try (FileWriter writer = new FileWriter(writeText)) {
            writer.write(cipherText);
        }

        try (DataInputStream stream = new DataInputStream(new BufferedInputStream(new FileInputStream(writeText)))){
            InputStreamReader reader = new InputStreamReader(stream,"UTF-8");

            int data = reader.read();
            for (int i = 0; i < myArrayForCipher.length; i++){
                myArrayForDecipher1[i] = (char) data;
                data = reader.read();
            }
        }
         catch (EOFException e){
            System.out.println("Reached end of file.");
        }

        Decipher myDecipher = new Decipher();
        System.out.println(myDecipher.caesarDecipher(myArrayForDecipher1,changeStepForCipher));

    }

}
