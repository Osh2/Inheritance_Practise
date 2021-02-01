import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Ethan", "ID 12 34 56", 24000);
    }

    @Test
    public void canGetName(){
        assertEquals("Ethan", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNum(){
        assertEquals("ID 12 34 56", databaseAdmin.getNiNum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(24000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(3000);
        assertEquals(27000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(240, databaseAdmin.payBonus(), 0);
    }
}
