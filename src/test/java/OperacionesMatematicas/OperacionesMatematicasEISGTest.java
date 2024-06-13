package OperacionesMatematicas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OperacionesMatematicasEISGTest {

    private OperacionesMatematicasEISG operacionesMatematicasEISG;

    @BeforeEach
    void setUp() {
        operacionesMatematicasEISG = new OperacionesMatematicasEISG();
    }

    @AfterEach
    void tearDown() {
        operacionesMatematicasEISG = null;

    }

    @Test
    void testCalcularRaizCuadradaNumeroPositivo() {
        double num=25;
        double resultadoEsperado=5;
        double resultado = operacionesMatematicasEISG.calcularRaizCuadrada(num);
        assertEquals(resultadoEsperado,resultado);


    }

    @Test
    void testCalcularRaizCuadradaCero() {
        double num=0;
        double resultadoEsperado=0;
        double resultado = operacionesMatematicasEISG.calcularRaizCuadrada(num);
        assertTrue(resultadoEsperado==resultado);

    }

    @Test
    void testCalcularRaizCuadradaNumeroNegativo() {
        double num = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            operacionesMatematicasEISG.calcularRaizCuadrada(num);
        });

    }
}