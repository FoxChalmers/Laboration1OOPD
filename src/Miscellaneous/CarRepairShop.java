package cars;

public class CarRepairShop implements HasCarLoader {
    
    private CarLoader carLoader;
    private int x, y;

    CarRepairShop(int maxLoad, int x, int y) {
        this.carLoader = new CarLoader(maxLoad, this);
        this.x = x;
        this.y = y;
    }

    public void loadCar(Car car) {
        carLoader.loadCar(car);
    }

    public void unloadCar() {
        carLoader.unloadCar();
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

    

}
