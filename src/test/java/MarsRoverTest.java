import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    void marsRoverFacesWestWhenTurningLeftFromNorth() {
        MarsRover marsRover = new MarsRover("North");
        marsRover.turn("L");
        assertEquals("West", marsRover.getDirection());
    }

    @Test
    void marsRoverFacesSouthWhenTurningLeftFromWest() {
        MarsRover marsRover = new MarsRover("West");
        marsRover.turn("L");
        assertEquals("South", marsRover.getDirection());
    }

    @Test
    void marsRoverFacesEastWhenTurningLeftFromSouth(){
        MarsRover marsRover=new MarsRover("South");
        marsRover.turn("L");
        assertEquals("East",marsRover.getDirection());
    }

    @Test
    void marsRoverFacesNorthWhenTurningFromEast() {
        MarsRover marsRover = new MarsRover("East");
        marsRover.turn("L");
        assertEquals("North", marsRover.getDirection());
    }


}
