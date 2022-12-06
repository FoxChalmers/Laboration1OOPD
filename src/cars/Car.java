package cars;

public interface Car {
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    void move();
    void gas(double amount);
}
