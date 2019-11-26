package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorKid;
    Visitor visitorAdult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorAdult = new Visitor(45, 1.83, 99.00);
        visitorKid = new Visitor(10, 1.33, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void hasMaximumAgeTrue() {
        assertEquals(true, playground.isAllowedTo(visitorKid));
    }
    @Test
    public void hasMaximumAgeFalse() {
        assertEquals(false, playground.isAllowedTo(visitorAdult));
    }
}
