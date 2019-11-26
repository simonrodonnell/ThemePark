package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorKid;
    Visitor visitorAdult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorAdult = new Visitor(45, 2.10, 99.00);
        visitorKid = new Visitor(10, 1.33, 5.50);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void isChargedHalfTrue() {
        assertEquals(2.25, dodgems.priceFor(visitorKid), 0.01);
    }

    @Test
    public void isChargedHalfFalse() {
        assertEquals(4.5, dodgems.priceFor(visitorAdult), 0.01);
    }
}
