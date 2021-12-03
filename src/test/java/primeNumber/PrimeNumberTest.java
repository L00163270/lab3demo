package primeNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
public class PrimeNumberTest {
    @Test
    public void testIsPrime() {
        assertTrue("Result", PrimeNumber.checkPrime(37));
        assertEquals(true,PrimeNumber.checkPrime(11));
    }
}

