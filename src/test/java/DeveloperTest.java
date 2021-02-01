import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Osh", "IA 48 17 CH", 22000.50);    
    }

    @Test
    public void canGetName(){
        assertEquals("Osh", developer.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("IA 48 17 CH", developer.getNiNum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(22000.50, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(24000.50, developer.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(220, developer.payBonus(), 0);
    }
}
