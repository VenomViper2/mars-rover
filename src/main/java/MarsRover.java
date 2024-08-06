public class MarsRover {

    public static final String NORTH = "North";
    public static final String WEST = "West";
    public static final String SOUTH = "South";
    public static final String EAST = "East";
    public static final String RIGHT = "R";
    public static final String LEFT = "L";
    private String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turn(String instruction) {
        if (instruction.equals(LEFT)) {
            turnLeft();
        } else if (instruction.equals(RIGHT)) {
            turnRight();
        }
    }

    private void turnRight() {
        if (direction.equals(NORTH)) {
            direction = EAST;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH -> direction = WEST;
            case SOUTH -> direction = EAST;
            case WEST -> direction = SOUTH;
            case EAST -> direction = NORTH;
        }
    }
}
