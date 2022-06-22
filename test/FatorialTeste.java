import modelo.Fatorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class FatorialTeste {
    
    @Test
    public void calculatestecaixabranca() {
        Fatorial fatorial = new Fatorial();
        
        //c1 = <9, 10, 13-14>
        int resultado = fatorial.calcula(0);
        assertEquals(1,resultado);
        
        //c2 = <9, 11-12, 13-14>
        resultado = fatorial.calcula(4);
        assertEquals(24,resultado);
    }
    
    @Test
    public void calculatestecaixapreta() {
        
        //entrada é do tipo "deve ser assim"
        Fatorial fatorial = new Fatorial();
        
        //conjunto válido
        int resultado = fatorial.calcula(4);
        assertEquals(24,resultado);
        
        //conjunto inválido
        resultado = fatorial.calcula(-1);
        assertEquals(1,resultado);
    }
}
