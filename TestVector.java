import java.util.Scanner;
import java.util.Random;

public class TestVector {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        int  n, max, min, combination, i; // dichiarazioi variabili e assegnazioni
        max = 99;
        min = 10;
        n = random.nextInt(10,20); // generatore di numeri interi casuali compresi da 10 a 20
        int[] Vector = new int[n];
        combination = max - min + 1; // stabilito il range delle combinazioni tra 99 e 10

        // prima parte del programma

        for (i=0; i<n; i++) {
            Vector[i] = (int) ((Math.random() * combination) + min);
            while (Vector[i] %2 ==0)
            {
                Vector[i] = (int) ((Math.random() * combination) + min);
            }
            System.out.println(""+Vector[i]); //collocazione e stampa dei nuemri pari all'interno del vettore
        }
        System.out.println("Vuoi ridimensionare i vettori? \nDigitare [1] se si\nDigitare [0] se no"); //breve menu per aggiungere cose a caso ahaha

        // seconda parte del programma

        if (input.nextInt() == 1) {
            System.out.println("Bene, effettuo ridimensionamento...");
            Thread.sleep(3000); // ho usato la funzione Thread.sleep per creare un delay di 3 millesimi di secondi per simulare il ridimensionamento dei numeri

            for(i=0; i<n; i++) {
                if (i%2!=0) {
                    Vector[i] = Vector[i] + Vector[i - 1];
                }
                System.out.println(""+Vector[i]); //collocazione e stampa dei numeri dispari all'intero del vettroe
            }
            System.out.println("Ridemensionamento effettuato");
        }
        else {
            System.out.println("Non ho effettuato nessun ridimensionamento ");
        }
    }

}