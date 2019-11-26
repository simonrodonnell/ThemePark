package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorKid;
    Visitor visitorAdult;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorAdult = new Visitor(45, 1.83, 99.00);
        visitorKid = new Visitor(10, 1.33, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasMinimumAgeTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorAdult));
    }

    @Test
    public void hasMinimumAgeFalse(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitorKid));
    }
}
