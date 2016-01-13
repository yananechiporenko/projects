package ua.com.goit.task6Extra;

import java.util.Scanner;

public class AuthorizationRunner {
    public static void main(String[] args)throws NegativeAgeRuntimeException,UnderageRuntimeException{

        System.out.println("Please, enter your age");
        final Scanner ageScanner = new Scanner(System.in);

     try {
         final int userAge = ageScanner.nextInt();
         if (userAge<0){
             throw new NegativeAgeException(userAge);
         }else if (userAge>0&userAge<18){
             throw new UnderAgeException(userAge);
         }

         final UserAuthorization user1 = new UserAuthorization(userAge);

         System.out.println("Authorization completed. \nYour age is " + user1.getAge());
     } catch (NegativeAgeException nE){
         System.out.println("[Error]Your age should not be a negative number! \nYour age is " + nE.getAgeValue());
         throw new NegativeAgeRuntimeException(nE.getAgeValue());
     } catch (UnderAgeException uE) {
         System.out.println("[Error]Your age should be >=18! \nYour age is " + uE.getUnderAge());
         throw new UnderageRuntimeException(uE.getUnderAge());
     }

    }
}
