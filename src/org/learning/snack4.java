package org.learning;

import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        /*Snack4
        Data in input una stringa verificare se è palindroma*/
        Scanner scanner=new Scanner(System.in);
        //Chiedo all'utente una parola
        System.out.print("Dimmi una parola");
        //Assegno il valore alla variabile word
        String word =(scanner.nextLine());
        //Capovolgo i caratteri della stringa
        StringBuilder reverseWord= new StringBuilder(word).reverse();
        /*Controllo se la parola di partenza è uguale
         a quella capovolta e trasformo reverseWord in stringa*/
        if (word.equals(reverseWord.toString())){
            System.out.println("La parola è palindroma");
        }else {
            System.out.println("La parola non  è palindroma");
        }
    }
}
