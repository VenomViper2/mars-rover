public class MarsRover {

    private String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turn(String instruction) {
        if (instruction.equals(Instructions.LEFT)) {
            turnLeft();
        } else if (instruction.equals(Instructions.RIGHT)) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (direction) {
            case Directions.NORTH -> direction = Directions.EAST;
            case Directions.EAST -> direction = Directions.SOUTH;
            case Directions.SOUTH -> direction = Directions.WEST;
            case Directions.WEST -> direction = Directions.NORTH;
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
