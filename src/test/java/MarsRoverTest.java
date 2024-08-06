import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @ParameterizedTest
    @MethodSource("marsRoverLeftTestCases")
    void marsRoverFacesCorrectDirectionWhenTurningLeft(String initialDirection, String expectedDirection) {
        MarsRover marsRover = new MarsRover(initialDirection);
        marsRover.turn("L");
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    private static Stream<Arguments> marsRoverLeftTestCases() {
        return Stream.of(
                Arguments.of("North", "West"),
                Arguments.of("West", "South"),
                Arguments.of("South", "East"),
                Arguments.of("East", "North")
        );
    }

    @Test
    void marsRoverFacesEastWhenTurningRightFromNorth() {
        MarsRover marsRover = new MarsRover("North");
        marsRover.turn("R");
        assertEquals("East", marsRover.getDirection());
    }
}
