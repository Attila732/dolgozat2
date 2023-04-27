import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

//JUnit4 import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
//JUnit4 import org.junit.Test;
import org.junit.jupiter.api.Test;

public class TerfogatTest {
    Terfogat terfogat;
    @BeforeEach
    public void init() {
        this.terfogat = new Terfogat();
    }
    @Test
    public void testAoldal() {        
        double actual = terfogat.bekerData(50000, 5, 1);
        assertEquals(actual, 2500.0, 0.01, "Nem 2500-t kaptam");
    }
    @Test
    public void testTerfogat() {
        double actual = terfogat.szamitas(50000, 3, 12);
        assertEquals(actual, 1520.7, 0.1, "Nem 1520-t kaptam");
    }

    @Test
    public void testbekero0() {
        boolean actual = terfogat.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testbekero1() {
        boolean actual = terfogat.checkInput("33.5");
        assertTrue(actual);
    }
    @Test 
    public void testbekero2() {
        boolean actual = terfogat.checkInput("a");
        assertFalse(actual);
    }
    @Test 
    public void testbekero3() {
        boolean actual = terfogat.checkInput("@");
        assertFalse(actual);
    }
    
}
