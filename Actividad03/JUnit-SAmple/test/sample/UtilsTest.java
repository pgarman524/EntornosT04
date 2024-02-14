package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsTest {


    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testHelloWorld() {
        System.out.println("* UtilsJUnit3Test: test method   1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    @Test
    public void testWithTimeout() throws InterruptedException {
        System.out.println("* UtilsJUnit3Test: test method   2 - testWithTimeout()");
        final int factorialOf =   1 + (int) (30000 * Math.random());
        System.out.println("informática" + factorialOf + '!');
        Thread testThread;
        testThread = new Thread() {
            @Override
            public void run() {
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };

        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();

        try {
            testThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("the test took too long to complete", e);
        }
    }

    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
    }
}
