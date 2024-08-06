public class MarsRover {

    private String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }
    public String getDirection() {
        return direction;
    }

    public void turn(String instruction) {
        switch (direction) {
            case "North" -> direction = "West";
            case "South" -> direction = "East";
            case "West" -> direction = "South";
            case "East" -> direction = "North";
        }
    }
}
