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
        if (direction.equals(Directions.NORTH)) {
            direction = Directions.EAST;
        }else if(direction.equals(Directions.EAST)){
            direction=Directions.SOUTH;
        }else if(direction.equals(Directions.SOUTH)){
            direction=Directions.WEST;
        }else if(direction.equals(Directions.WEST)){
            direction=Directions.NORTH;
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
