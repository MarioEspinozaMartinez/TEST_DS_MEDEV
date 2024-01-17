
package Test_ds;

/**
 *
 * @author ESPINOZA Mario
 */
public class Fibonacci {
    public int Fibo (int n){
        if ( n==2 || n == 3 ){
            return 1;
        }
        else if (n==1){
            return 0;
        }
        else {
            return (Fibo(n-1)+Fibo(n-2));
        }
    }
}
