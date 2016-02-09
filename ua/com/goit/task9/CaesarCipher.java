package ua.com.goit.task9;

import java.util.Arrays;

public class CaesarCipher extends Cipher {

    public String caesarCipher(char[] arrayForCipher, int changeStep) {

        for (int i=0; i<arrayForCipher.length; i++ ){
            if (arrayForCipher[i]!=',' && arrayForCipher[i]!= ' ') {
                if (arrayForCipher[i]>= FirstCapitalLetter && arrayForCipher[i]<= LastCapitalLetter){
                    int capital = arrayForCipher[i] + changeStep;
                    if (capital- LastCapitalLetter >0){
                        int recirculation = FirstCapitalLetter + (capital- LastCapitalLetter) -1;
                        arrayForCipher[i] = (char) recirculation;
                    }else arrayForCipher[i] = (char) capital;
                } else {
                    int small = arrayForCipher[i] + changeStep;
                    if (small- LastSmallLetter >0){
                        int recirculation = FirstSmallLetter + (small- LastSmallLetter) -1;
                        arrayForCipher[i] = (char) recirculation;
                    }else arrayForCipher[i] = (char) small;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char value : arrayForCipher){
            builder.append(value);
        }
        final String stringCaesarCipher = builder.toString();
        return stringCaesarCipher;
    }

}
