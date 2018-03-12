

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
    Double TOLERANCIA = 0.001d;
    Calculadora calculadora;

    @Test
    public void testSumaNormal(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(8, calculadora.dameResultado(), TOLERANCIA);
    }
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

    /*
    Prueba de calculadora para comprobar que la suma de positivosfuncione
    */

    @Test
    public void testSumaMax1(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Prueba de calculadora para comprobar que
     * suma de valor máximo con un valor positivo
     */
    @Test
    public void testSumaMax2(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     *  Prueba de calculadora para comprobar que
     *  el numero negativo máximo con la suma de un positivo
     */
    @Test
    public void testSumaMin1(){
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Prueba de calculadora para comprobar que
     * la posición de operadores no afecte
     */
    @Test
    public void testSumaMin2(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Prueba de calculadora para comprobar que
     * los números decimales no fallan en su suma
     */
    @Test
    public void testSumaDecimal1(){
        calculadora.ponNum1(3.21);
        calculadora.ponNum2(5.45);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(8.66, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Prueba de calculadora para comprobar que
     * la posición de números decimales
     */
    @Test
    public void testSumaDecimal2(){
        calculadora.ponNum1(4.56);
        calculadora.ponNum2(2.39);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(6.95, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Prueba de calculadora para comprobar que
     * l suma de dedimales positivo y negativo sea correcta
     */
    @Test
    public void testSumaDecimal3(){
        calculadora.ponNum1(4.56);
        calculadora.ponNum2(-2.39);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(2.17, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Pruebas de calculadora para comprobar que
     * la resta funcione alternando valores,
     * cambios de posición de valores tanto negativos
     * como positivos y valores máximos y mínimos
     */
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

    /**
     * Pruebas de calculadora para comprobar que
     * las multiplicaciones sean correctas de manera
     * que no desborden por arriba o por abajo
     * y que lo valores postivos y negativos con cambios
     * de posición no tengan resultados inesperados
     */
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

    /**Pruebas de calculadora para comprobar que
     * las divisiones sean lo más exactas posibles
     * con el limite de tolerancia y que las divisiones
     * de 0 sean de ejecución nula
     */
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

    /**
     * Pruebas de calculadora para comprobar que
     * las potencias se funcionen crrectamente segun
     * los valores positivos y negrativos con los
     * desbordamientos máximos y mínimos
     */
    @Test
    public void testPotencia1(){
        calculadora.ponNum1(2);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(4, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia2(){
        calculadora.ponNum1(3);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(243, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia3(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia4(){
        calculadora.ponNum1(3);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia5(){
        calculadora.ponNum1(0);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia6(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(1, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia7(){
        calculadora.ponNum1(4);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(0.0625, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia8(){
        calculadora.ponNum1(-2);
        calculadora.ponNum2(3);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(-8, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testPotencia9(){
        calculadora.ponNum1(-2);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        Assert.assertEquals(0.25, calculadora.dameResultado(), TOLERANCIA);
    }

    /**
     * Pruebas de calculadora para comprobar que
     * la raiz calcule corectamente con valores dentro
     * de unos parámetros no tan grnades que satisfacen
     * soluciones a problemas "sencillos"
     */
    @Test
    public void testRaiz1(){
        calculadora.ponNum1(2);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        Assert.assertEquals(1.41421, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRaiz2(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        Assert.assertEquals(1.3407807929942596E154, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRaiz3(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();
        Assert.assertEquals(7.458340731200207E-155, calculadora.dameResultado(), TOLERANCIA);

    }

    @Test
    public void testLogaritmo1(){
        calculadora.ponNum1(10);
        calculadora.ponNum2(10);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        Assert.assertEquals(1, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testLogaritmo2(){
        calculadora.ponNum1(54);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        Assert.assertEquals(2.2262, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testLogaritmo3(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(10);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        Assert.assertEquals(308.25471555991675, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testLogaritmo4(){
        calculadora.ponNum1(10);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        Assert.assertEquals(0.0032440704051634396, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testLogaritmo5(){
        calculadora.ponNum1(-54);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();
        Assert.assertEquals(Double.NaN, calculadora.dameResultado(), TOLERANCIA);
    }
}
