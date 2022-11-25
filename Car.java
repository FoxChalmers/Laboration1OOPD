import java.awt.*;

public abstract class Car implements Movable{

    // Shared attributes
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    // Coordinate for move
    private int x;
    private int y;

    // Constructor 
    Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        directionIndex = 0;
    }

    // Getters and setters
    public int getNrDoors() {
        return nrDoors;
    }
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }
    public double getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Point[] getDirections() {
        return directions;
    }

    public void setDirections(Point[] directions) {
        this.directions = directions;
    }

    public int getDirectionIndex() {
        return directionIndex;
    }

    public void setDirectionIndex(int directionIndex) {
        this.directionIndex = directionIndex;
    }


    // Moving mechanism
    private Point[] directions = new Point[]{
        new Point(0, 1), new Point(1, 0), new Point(0, -1), new Point(-1, 0)
}
    private int directionIndex;


    // Shared Methods
    public void startEngine(){
	    setCurrentSpeed(0.1);
    }

    public void stopEngine(){
	    setCurrentSpeed(0);
    }
    

    // Abstract methods
public abstract double speedFactor();
public abstract void incrementSpeed(double amount);
public abstract void decrementSpeed(double amount);
};

// Moving method
public void move(){

    Point direction = getDirectionIndex()[getDirectionIndex()];
    int dx = (int) direction.getX();
    int dy = (int) direction.getY();

    // New coordinate
    int newX = x + dx * (int) getCurrentSpeed();
    int newY = y + dy * (int) getCurrentSpeed();


    // Set the new Coordinate
    setX(newX);
    setY(newY);
}


// Turn Left
public void turnLeft(){
    if(getDirectionIndex() == 0){
        setDirectionIndex(getDirectionIndex().length - 1);
    } else {
        setDirectionIndex(getDirectionIndex() - 1);
    }
}

// Turn Right
public void turnLeft(){
    if(getDirectionIndex() == getDirectionIndex().length - 1){
        setDirectionIndex(getDirectionIndex(0));
    } else {
        setDirectionIndex(getDirectionIndex() + 1);
    }
}


// Gas
public void gas(){

    try{
        if(amount < 0 || amount > 1){
            throw new Exception("Gas limitiation should not be excced!")
        } else{
            incrementSpeed(amount);
        }
    } catch (Exception e){
        System.out.println("Exception occured!" + e);
    }
}

// Brake
public void brake(){
    try{
        if(amount < 0 || amount > 1){
            throw new Exception("Brake limitiation should not be excced!")
        } else{
            decrementSpeed(amount);
        }
    } catch (Exception e){
        System.out.println("Exception occured!" + e);
    }

}

