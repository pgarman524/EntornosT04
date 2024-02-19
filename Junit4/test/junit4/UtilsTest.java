/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package junit4;


import org.junit.*;
import sample.Utils;

import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author Pgarman524
 */
public class UtilsTest {
    
@BeforeClass
public static void setUpClass() throws Exception {
    System.out.println("* UtilsJUnit4Test: @BeforeClass method");
}

@AfterClass
public static void tearDownClass() throws Exception {
    System.out.println("* UtilsJUnit4Test: @AfterClass method");
}

@Before
public void setUp() {
    System.out.println("* UtilsJUnit4Test: @Before method");
}

@After
public void tearDown() {
    System.out.println("* UtilsJUnit4Test: @After method");
}





@Test(timeout=1000)
public void testWithTimeout() {
    System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");          
    final int factorialOf = 1 + (int) (30000 * Math.random());
    System.out.println("computing " + factorialOf + '!');
}

@Test (expected=IllegalArgumentException.class)
public void checkExpectedException() {
    System.out.println("* UtilsJUnit4Test: test method 3 - checkExpectedException()");
    final int factorialOf = -5;
    System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
}


@Test
public void temporarilyDisabledTest() throws Exception {
    System.out.println("* UtilsJUnit4Test: test method 4 - checkExpectedException()");
    assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
}



    /**
     * Test of concatWords method, of class Utils.
     */
 @Test
public void helloWorldCheck() {
    System.out.println("* UtilsJUnit4Test: test method 1 - helloWorldCheck()");
    assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
}
    /**
     * Test of computeFactorial method, of class Utils.
     
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 0;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/


    /**
     * Test of normalizeWord method, of class Utils.
     
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
    */
}
