import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jim", "AB 12 34 56", 40000, "Upper Management", 250000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Jim", director.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("AB 12 34 56", director.getNiNum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, director.getSalary(), 0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Upper Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(45000, director.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, director.payBonus(), 0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(250000.50, director.getBudget(),0);
    }
}