public class Aeroplane {

    private String name;
    private Coordinates coordinates;
    private int speed;
    private int totalDistance = coordinates.getX() + coordinates.getY();
    private int repairDistance;

    public Aeroplane(String name, Coordinates coordinates, int speed ){
        this.name = name;
        this.coordinates = coordinates;
        this.speed = speed;

    }
}
