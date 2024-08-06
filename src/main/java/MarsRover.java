public class MarsRover {

    public static final String NORTH = "North";
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
                case NORTH -> direction = "West";
                case "South" -> direction = "East";
                case "West" -> direction = "South";
                case "East" -> direction = NORTH;
            }
        } else if (instruction.equals("R")) {
            if (direction.equals(NORTH)) {
                direction = "East";
            }
        }
    }
}
