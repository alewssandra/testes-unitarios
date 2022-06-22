
import modelo.Matematica;
import static org.junit.Assert.*;
import org.junit.Test;

public class MatematicaTeste {

    @Test
    public void somaTeste_1() {
        Matematica mtm = new Matematica();

        //casos de teste soma
        assertEquals(2, mtm.soma(1, 1), 0);
        assertEquals(-10, mtm.soma(-11, 1), 0);
        assertEquals(1.42, mtm.soma(3.14f, -1.72f), 0.001);

        //casos de teste subtração
        assertEquals(2, mtm.subtrai(4, 2), 0);
        assertEquals(11, mtm.subtrai(20, 9), 0);
        assertEquals(23, mtm.subtrai(33, 10), 0);

        //casos de teste multiplicação
        assertEquals(8, mtm.multiplica(4, 2), 0);
        assertEquals(20, mtm.multiplica(10, 2), 0);
        assertEquals(500, mtm.multiplica(50, 10), 0);

        //casos de teste divisão
        assertEquals(2, mtm.divide(4, 2), 0);
        assertEquals(5, mtm.divide(10, 2), 0);
        assertEquals(5, mtm.divide(50, 10), 0);

    }

}
