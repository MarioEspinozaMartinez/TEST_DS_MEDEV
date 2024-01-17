
package Test_ds;

import java.util.Scanner;

/**
 *
 * @author ESPINOZA Mario
 */
public class TEST_DS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibo = scanner.nextInt();
        Fibonacci example = new Fibonacci();
        example.Fibo(fibo);
        
    }
}
