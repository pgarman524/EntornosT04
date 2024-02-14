/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pgarman524
 */
public class UtilsTest {
    public void testHelloWorld() {
 System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
 assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }
    
    public UtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    

    
    
    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException {
        System.out.println("* UtilsJUnit3Test: test method 2 - testWithTimeout()");
        final int
factorialOf = 1 + (int) (30000 * Math.random());
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

    if (testThread.isInterrupted()) {
        throw new TimeoutException("the test took too long to complete");
    }
}

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
