public class MarsRover {

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
        if (direction.equals(Directions.NORTH)) {
            direction = Directions.EAST;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case Directions.NORTH -> direction = Directions.WEST;
            case Directions.SOUTH -> direction = Directions.EAST;
            case Directions.WEST -> direction = Directions.SOUTH;
            case Directions.EAST -> direction = Directions.NORTH;
        }
    }
}
