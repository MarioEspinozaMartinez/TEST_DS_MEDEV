
package Test_ds;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bebom
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Fibo method, of class Fibonacci.
     */
    @Test
    public void testFibo() {
        Fibonacci fibo = new Fibonacci();
        assertEquals(0, fibo.Fibo(1));
        assertEquals(1, fibo.Fibo(2));
        assertEquals(1, fibo.Fibo(3));
        assertEquals(2, fibo.Fibo(4));
        assertEquals(3, fibo.Fibo(5));
        assertEquals(5, fibo.Fibo(6));
    }
    
}
