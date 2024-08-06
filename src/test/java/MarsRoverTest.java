import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @ParameterizedTest
    @MethodSource("marsRoverLeftTestCases")
    void marsRoverFacesCorrectDirectionWhenTurningLeft(String initialDirection, String expectedDirection) {
        MarsRover marsRover = new MarsRover(initialDirection);
        marsRover.turn(Instructions.LEFT);
        assertEquals(expectedDirection, marsRover.getDirection());
    }

    private static Stream<Arguments> marsRoverLeftTestCases() {
        return Stream.of(
                Arguments.of(Directions.NORTH, Directions.WEST),
                Arguments.of(Directions.WEST, Directions.SOUTH),
                Arguments.of(Directions.SOUTH, Directions.EAST),
                Arguments.of(Directions.EAST, Directions.NORTH)
        );
    }

    @Test
    void marsRoverFacesEastWhenTurningRightFromNorth() {
        MarsRover marsRover = new MarsRover(Directions.NORTH);
        marsRover.turn(Instructions.RIGHT);
        assertEquals(Directions.EAST, marsRover.getDirection());
    }
}
