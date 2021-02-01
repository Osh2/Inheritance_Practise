import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David", "RU 48 17 CH", 24000.00, "HR");
    }

    @Test
    public void canGetName(){
        assertEquals("David", manager.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("RU 48 17 CH", manager.getNiNum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24000.00, manager.getSalary(), 0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000.24);
        assertEquals(26000.24, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(240, manager.payBonus(), 0);
    }

    @Test
    public void cantDecreaseSalary(){
        manager.raiseSalary(-2000);
        assertEquals(24000, manager.getSalary(), 0);
    }

    @Test
    public void canSetName(){
        manager.setName("Dave");
        manager.setName("");
        assertEquals("Dave", manager.getName());
    }
}
