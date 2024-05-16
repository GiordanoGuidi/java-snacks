package org.learning;

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {
        /*Snack2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha
        una lista di nomi e una lista di cognomi, e da queste vuole
        mostrare a video una falsa lista di invitati con nome e cognome.*/
        //Inizializzo array di nomi
        String[] name={"Mario","Francesco","Giulia","Gabriele"};
        //Inizializzo array di cognomi
        String[] lastname={"Khramof","Rossi","Scodinzio","Annibbali"};
        //Istanzio random
        Random random = new Random();

        for (int i =0; i< name.length;i++){
            //genero il primo numero casuale
            int randomNumber=random.nextInt(1,name.length);
            //genero il secondo numero casuale
            int seconRandomNumber = random.nextInt(1,lastname.length);
            //Concateno le scringhe separate da uno spazio
            String guest = name[randomNumber]+ " " + lastname[seconRandomNumber];
            //Stampo la stringa concatenata
            System.out.println(guest);
        }

    }
}
