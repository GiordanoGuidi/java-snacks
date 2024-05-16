package org.learning;

import java.util.Scanner;

public class snack5 {
    public static void main(String[] args) {
        /*Snack5
        Data una stringa in input mostrare a video quanti
        caratteri alfabetici contiene, quanti numeri e quanti
        simboli non alfanumerici.Continuare a chiedere una nuova
        stringa finchè non si inserisce 0.*/

        Scanner scanner=new Scanner(System.in);
        //Inizializzo la variabile
        String word;
        int numberCounter=0;
        int letterCounter=0;
        int simbolsCounter=0;
        do {
            //Chiedo una parola all'utente
            System.out.println("Dimmi una parola");
            //Assegno alla variabile word la parola chiesta
            word=(scanner.nextLine());

            for (int i=0; i < word.length();i++){
                /*assegno a characters il valore del carattere
                 di word ad ogni iterazione*/
                char character = word.charAt(i);
                /*Se character è un numero aumento la variabile
                numberCounter*/
                if(Character.isDigit(character)){
                    numberCounter+=1;
                }
                /*Se character è una lettera aumento il
                letterCounter*/
                else if (Character.isLetter(character)) {
                    letterCounter+=1;
                }
                /*Se character è un simbolo aumneto il
                simbolsCharacter*/
                else if (!Character.isLetterOrDigit(character)) {
                    simbolsCounter+=1;
                }
            }
        //Stampo i contatori
        System.out.println(numberCounter);
        System.out.println(letterCounter);
        System.out.println(simbolsCounter);
        }
        //continuo il ciclo fino a che non viene scritta la stringa 0
        while(!word.equals("0"));
    }
}
