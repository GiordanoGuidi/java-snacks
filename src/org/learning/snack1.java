package org.learning;

import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) {
        /*Snack1
        Inserisci un numero, se è pari stampa il numero,
        se è dispari stampa il numero successivo.*/
        //Istanzio lo scanner
        Scanner scanner = new Scanner(System.in);
        //Inizializzo la variabile
        int guestNumber;
        System.out.print("Dimmi un numero");
        guestNumber=Integer.parseInt(scanner.nextLine());
        /*Condizione se il numero è pari lo restituisco,
          se è dispari restituisco il  umero successivo*/
        if(guestNumber % 2==0){
            System.out.println(guestNumber);
        }else{
            System.out.println(guestNumber + 1);
        }
        //Chiudo lo scanner
        scanner.close();
    }
}
