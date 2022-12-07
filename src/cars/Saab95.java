package cars;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Saab95 extends Vehicle implements Car {

    private TurboEngine engine;
    private BufferedImage saab95Image;

    // Constructor
    public Saab95(int x, int y) {
        super(2, Color.red, "Saab95", new TurboEngine(200), x, y);
        this.engine = new TurboEngine(getEnginePower());

        try {
            this.saab95Image = ImageIO.read(new File("src/application/pics/Saab95.jpg"));
        }
        catch (IOException ex) {

        }

    }

    public double speedFactor() {
        return engine.speedFactor();
    }

    public void setTurboOn() {
        engine.setTurboOn();
    }

    public void setTurboOff() {
        engine.setTurboOff();
    }    

    public void drawImage(Graphics g) {
        g.drawImage(saab95Image, getX(), getY(), null);

    }

}
