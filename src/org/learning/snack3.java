package org.learning;

public class snack3 {
    public static void main(String[] args) {
        /*Snack3
        Crea un array di numeri interi e fai la somma di
        tutti gli elementi che sono in posizione dispari*/
        //Inizializzo l'array
        int[] numbers={2,4,5,7,9,12};
        //Inizializzo la variabile somma
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++){
            //se la i non è pari
            if(i % 2 != 0){
                //sommo i numeri in posizione dispari
                sum+=numbers[i];
            }
        }
        //Stampo la somma
        System.out.println(sum);
    }
}
