package com.company;

import java.util.Scanner;

public class Jeux {

    public static void num_to_find(){
       int essaies = 3;
       double toFindRaw =  Math.floor(Math.random() * 11);
       int toFind = (int)(toFindRaw);
       Scanner scanner = new Scanner(System.in);

       System.out.println("Entrez un numéro");
       int input =  scanner.nextInt();

       while (input != toFind && essaies > 0){
           essaies--;
           if (essaies == 0) {
               System.out.println("0 essai restant");
               break;
           }

           if (input > toFind){
               System.out.println("Trop Grand Veuillez reessayer.\nIl vous reste " + essaies + " essaies");
           }
           else {
               System.out.println("Trop petit  reessayer.\nIl vous reste " + essaies + " essaies");
           }
           input = scanner.nextInt();


       }
       if (input == toFind)
           System.out.println("Bravo vous avez gagné");
       else
           System.out.println("Perdu");
    }
}
