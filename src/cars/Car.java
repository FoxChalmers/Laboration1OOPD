package cars;

public interface Car extends Movable {
    void gas(double amount);
    void brake(double amount);
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    void startEngine();
    void stopEngine();
}
