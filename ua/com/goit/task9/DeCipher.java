package ua.com.goit.task9;


public class Decipher extends Cipher{
    public String caesarDecipher(char[] arrayForDecipher, int changeStep) {

        for (int i=0; i<arrayForDecipher.length; i++ ){
            if (arrayForDecipher[i]!=',' && arrayForDecipher[i]!= ' ') {
                if (arrayForDecipher[i]>= FirstCapitalLetter && arrayForDecipher[i]<= LastCapitalLetter){
                    int capital = arrayForDecipher[i] - changeStep;
                    if (capital <FirstCapitalLetter){
                        int recirculation = LastCapitalLetter + (capital- FirstCapitalLetter) +1;
                        arrayForDecipher[i] = (char) recirculation;
                    }else arrayForDecipher[i] = (char) capital;
                } else {
                    int small = arrayForDecipher[i] - changeStep;
                    if (small <FirstSmallLetter){
                        int recirculation = LastSmallLetter + (small- FirstSmallLetter) +1;
                        arrayForDecipher[i] = (char) recirculation;
                    } else arrayForDecipher[i] = (char) small;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char value : arrayForDecipher){
            builder.append(value);
        }
        final String stringCaesarCipher = builder.toString();
        return stringCaesarCipher;
    }

}
