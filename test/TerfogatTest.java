import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class TerfogatTest {
    Terfogat terfogat;
    @BeforeEach
    public void init() {
        this.terfogat = new Terfogat();
    }
    @Test
    public void testBekerData() {        
        double actual = terfogat.bekerData(50000, 5, 1);
        assertEquals(actual, 2500.0, 0.01, "Nem 2500-t kaptam");
    }
    @Test
    public void testBeker() {
        double actual = terfogat.szamitas(50000, 3, 12);
        assertEquals(actual, 1520.7, 0.1, "Nem 1520-t kaptam");
    }

    @Test
    public void testSzamitas(){

    }
    @Test
    public void testCheckInput() {
        boolean actual = terfogat.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testCheckInputFloat() {
        boolean actual = terfogat.checkInput("33.5");
        assertTrue(actual);
    }
    @Test 
    public void testCheckInputFalse() {
        boolean actual = terfogat.checkInput("a");
        assertFalse(actual);
    }
    @Test 
    public void testCheckInputSpecial() {
        boolean actual = terfogat.checkInput("@");
        assertFalse(actual);
      
    }
  
    
}
