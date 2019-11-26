package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorKid;
    Visitor visitorAdult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorAdult = new Visitor(45, 2.10, 99.00);
        visitorKid = new Visitor(10, 1.33, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRideRollercoasterTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorAdult));
    }

    @Test
    public void isAllowedToRideRollercoasterFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorKid));
    }

    @Test
    public void isChargedDoubleTrue() {
        assertEquals(16.8, rollerCoaster.priceFor(visitorAdult), 0.01);
    }

    @Test
    public void isChargedDoubleFalse() {
        assertEquals(8.4, rollerCoaster.priceFor(visitorKid), 0.01);
    }
}
