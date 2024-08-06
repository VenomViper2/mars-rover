import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    void marsRoverCanTurnLeft() {
        MarsRover marsRover = new MarsRover();
        assertEquals("L", marsRover.getDirection());
    }

}
