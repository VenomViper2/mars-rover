public class MarsRover {

    public static final String NORTH = "North";
    public static final String WEST = "West";
    public static final String SOUTH = "South";
    public static final String EAST = "East";
    private String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turn(String instruction) {
        if (instruction.equals("L")) {
            switch (direction) {
                case NORTH -> direction = WEST;
                case SOUTH -> direction = EAST;
                case WEST -> direction = SOUTH;
                case EAST -> direction = NORTH;
            }
        } else if (instruction.equals("R")) {
            if (direction.equals(NORTH)) {
                direction = EAST;
            }
        }
    }
}
