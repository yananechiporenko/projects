package test.ua.com.goit.group7project;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.group7project.EratosthensSieve;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EratosthensSieveTest {


    @Test (timeout = 3000)
    public void testGetPrimeNumbers() throws Exception {
        final int n = 5;
        final List<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        final EratosthensSieve eratosthensSieve = new EratosthensSieve(n);
        eratosthensSieve.findPrimeNumbers();
        final List<Integer> result = eratosthensSieve.getPrimeNumbers();
        Assert.assertEquals(primeNumbers, result);

    }
}