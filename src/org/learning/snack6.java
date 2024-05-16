package org.learning;

import java.util.Scanner;

public class snack6 {
    public static void main(String[] args) {
        /*Snack 6
        Dato un numero sotto forma di stringa, convertirlo in
        intero senza utilizzare funzioni già pronte.
                Possibile usare solo :
                cicli
                chartAt
                if / switch
        Es. “25" come stringa deve essere convertito in intero 25.*/
        Scanner scanner= new Scanner(System.in);
        //Inizializzo le variabili
        String numberString;
        int integerNumber=0;

        //Chiedo  un numero
        System.out.println("dimmi un numero");
        //Assegno il valore alla variabile
        numberString=(scanner.nextLine());
        for (int i = 0; i < numberString.length(); i++){
            /*Assegno alla variabile character un carattere
             di word per ogni iterazione*/
            char character = numberString.charAt(i);
            /*Converto il carattere della cifra in intero
             ASCII di '0' è 48 ASCII di '1' è 49*/
            int number = character -'0';
            /*Prima di assegnare la cifra alla variabile,
            moltiplico il numero che vi era precedentemente *10
            per evitare di sovrascriverlo*/
            integerNumber= integerNumber * 10 + number;
        }
        //Stampo il numero intero
        System.out.print(integerNumber);


        //Chiudo lo scanner
        scanner.close();
    }
}
