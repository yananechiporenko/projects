package ua.com.goit.group7project;

public class EratosthensSieve {
    public static final int P = 2;
    int [] arrayOfNumber;
    int [] primeNumbers;

    public int [] arrayCreate(int size){
        arrayOfNumber = new int[size-1];
        for (int i  = 0; i < arrayOfNumber.length; i++){
            arrayOfNumber[i] = i + P;
        } return arrayOfNumber;
    }

    public int [] findPrimeNumbers(){
        int countPrime = 0;
        for (int i = P; i < arrayOfNumber.length + P; i++){
            for (int j = i+i; j < arrayOfNumber.length + P; j += i){
                arrayOfNumber[j-P] = 0;
            }if (arrayOfNumber[i-P]!=0){
                countPrime++;
            }
        }
        primeNumbers = new int[countPrime];
        int index = 0;
        for (int i = 0; i < arrayOfNumber.length; i++){
            if (arrayOfNumber[i]!=0){
                primeNumbers[index] = arrayOfNumber[i];
                index++;
                }
        }return primeNumbers;
    }

    public void showPrimeNumbers(){
        for (int i = 0; i < primeNumbers.length; i++){
            System.out.print(primeNumbers[i] + " ");
        }
    }

}

