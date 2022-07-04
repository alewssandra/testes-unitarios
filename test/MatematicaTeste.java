
import modelo.Matematica;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MatematicaTeste {

    private Matematica mtm;

    @Before
    public void setUp() {
        Matematica mtm = new Matematica();
        this.mtm = mtm;
    }

    @Test
    public void somaTeste() {
        //casos de teste soma teste caixa preta
        assertEquals(2, mtm.soma(1, 1), 0);
        assertEquals(-10, mtm.soma(-11, 1), 0);
        assertEquals(1.42, mtm.soma(3.14f, -1.72f), 0.001);
    }

    @Test
    public void subtraiTeste() {
        //casos de teste subtração
        assertEquals(2, mtm.subtrai(4, 2), 0);
        assertEquals(11, mtm.subtrai(20, 9), 0);
        assertEquals(23, mtm.subtrai(33, 10), 0);
    }

    @Test
    public void multiplicaTeste() {
        //casos de teste multiplicação
        assertEquals(8, mtm.multiplica(4, 2), 0);
        assertEquals(20, mtm.multiplica(10, 2), 0);
        assertEquals(500, mtm.multiplica(50, 10), 0);
    }

    @Test
    public void divideTeste() {
        //casos de teste divisão
        assertEquals(2, mtm.divide(4, 2), 0);
        assertEquals(5, mtm.divide(10, 2), 0);
        assertEquals(5, mtm.divide(50, 10), 0);
    }
}
