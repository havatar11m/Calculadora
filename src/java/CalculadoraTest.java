

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{
    Double TOLERANCIA = 0.001;
    Calculadora calculadora;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumaNormal(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(8, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaMax1(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaMax2(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaMin1(){
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaMin2(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaDecimal1(){
        calculadora.ponNum1(3.21);
        calculadora.ponNum2(5.45);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(8.66, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaDecimal2(){
        calculadora.ponNum1(4.56);
        calculadora.ponNum2(2.39);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(6.95, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testSumaDecimal3(){
        calculadora.ponNum1(4.56);
        calculadora.ponNum2(-2.39);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(2.17, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testResta1(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(3, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testResta2(){
        calculadora.ponNum1(2);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(-3, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testResta3(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(7, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testResta4(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testResta5(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRestaDecimal1(){
        calculadora.ponNum1(9.73);
        calculadora.ponNum2(2.93);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(6.80, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRestaDecimal2(){
        calculadora.ponNum1(5.23);
        calculadora.ponNum2(-2.48);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        Assert.assertEquals(7.71, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion1(){
        calculadora.ponNum1(3);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(15, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion2(){
        calculadora.ponNum1(5.23);
        calculadora.ponNum2(2.62);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(13.7026, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion3(){
        calculadora.ponNum1(-2);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(-10, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion4(){
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(-Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion5(){
        calculadora.ponNum1(0);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testMultiplicacion6(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testDivision1(){
        calculadora.ponNum1(6);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        Assert.assertEquals(2, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testDivision2(){
        calculadora.ponNum1(4.5);
        calculadora.ponNum2(9);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        Assert.assertEquals(0.5, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivision3(){
        calculadora.ponNum1(4);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
    }

    @Test
    public void testDivision4(){
        calculadora.ponNum1(0);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        Assert.assertEquals(0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testDivision5(){
        calculadora.ponNum1(-2.5);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        Assert.assertEquals(-0.5, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testDivision6(){
        calculadora.ponNum1(10);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        Assert.assertEquals(-5, calculadora.dameResultado(), TOLERANCIA);
    }
}
