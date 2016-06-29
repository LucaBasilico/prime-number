
import java.util.Scanner;

/**
 * Created by luca on 29-Jun-2016
 * 
 */
public class Main {

    public static void main(String[] args) {
        PrimeNumber test = new PrimeNumber();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int n = reader.nextInt();
        
        test.setEnd_number(n);
        test.calculatePrime();
    }

}
