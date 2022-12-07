package cars;

public class VehicleFactory {
 
    public static Volvo240 createVolvo(int x, int y) {
        return new Volvo240(x,y);
    }

    public static Saab95 createSaab(int x, int y) {
        return new Saab95(x, y);
    }

    public static Scania createScania(int x, int y) {
        return new Scania(x, y);
    }

    public static CarTransporter createCarTransporter(int x, int y) {
        return new CarTransporter(x,y);
    }

}
