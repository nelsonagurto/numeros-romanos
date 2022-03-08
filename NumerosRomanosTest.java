import org.junit.Test;
import static org.junit.Assert.*;

/*** @author Nelson */
public class NumerosRomanosTest {
    
    public NumerosRomanosTest() {
    }

    /* Caso de Prueba
   1-I, 5-V, 10-X, 50-L,100-C, 500-D, 1000-M    
*/  
@Test 
    public void test() {
        NumerosRomanos num = new NumerosRomanos();

        assertEquals("I",num.numToRomano(1));  
        assertEquals("V",num.numToRomano(5)); 
        assertEquals("X",num.numToRomano(10));  
        assertEquals("L",num.numToRomano(50)); 
        assertEquals("C",num.numToRomano(100));  
        assertEquals("D",num.numToRomano(500)); 
        assertEquals("M",num.numToRomano(1000));  
       }
}
