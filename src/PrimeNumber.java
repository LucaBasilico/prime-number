
import java.util.concurrent.locks.StampedLock;

/**
 *Create by luca on 29-Jun-2016
 *
 */
public class PrimeNumber {
      private int end_number;

      public PrimeNumber() {
      }

      public PrimeNumber(int end_number) {
            this.end_number = end_number;
      }
      
      public void calculatePrime() {
            for (int i = this.end_number; i > 1 ; i--) {
                  boolean checkStatus = true;
//                  System.out.println("Siamo nel numero "+i);
                  for (int j = (i-1); j > 1; j--) {
//                        System.out.println("Diviso per "+j);
                        if (i%j==0) {
                              checkStatus = false;                                
                        }
                        if (j==2) {
                              printResult(checkStatus, i);
                        }
                  }
            }
            System.out.println("2 e 1 sono numeri primi");
      }

      public void setEnd_number(int end_number) {
            this.end_number = end_number;
      }

      private void printResult(boolean primeNumber, int number) {
            if (primeNumber == true) {
                  System.out.println(number + " è un numero primo");
            }else{
                  System.out.println(number + " non è un numero primo");
            }
      }

      
}
