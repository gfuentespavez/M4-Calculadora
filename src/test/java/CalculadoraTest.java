import Calcular.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    //¿Se puede sumar?
    @Test
    public void testSumar() {
        int num1 = 1;
        int num2 = 2;
        int resultadoEsperado = 3;

        int resultadoReal = num1 + num2;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    //¿Se puede multiplicar?
    @Test
    public void testMultiplicar() {
        int num1 = 2;
        int num2 = 2;
        int resultadoEsperado = 4;

        int resultadoReal = num1 * num2;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    //¿Se puede restar?
    @Test
    public void testRestar() {
        int num1 = 5;
        int num2 = 2;
        int resultadoEsperado = 3;

        int resultadoReal = num1 - num2;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    //¿Se puede dividir?
    @Test
    public void testDividir() {
        int num1 = 10;
        int num2 = 2;
        int resultadoEsperado = 5;

        int resultadoReal = num1 / num2;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testDividirPorCero() {
        int num1 = 6;
        int num2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            int resultadoReal = num1 / num2;
        });
    }
}
