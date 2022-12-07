package cars;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Volvo240 extends Vehicle implements Car {


    private BufferedImage volvoImage;

    // Constructor
    public Volvo240(int x, int y) {
        super(4, Color.black, "Volvo240", new TrimEngine(150), x, y);

        try {
            this.volvoImage = ImageIO.read(new File("src/application/pics/Volvo240.jpg"));
        }
        catch (IOException ex) {

        }

    }

    public double speedFactor() {
        return getEngine().speedFactor();
    }

    @Override
    public void drawImage(Graphics g) {

        g.drawImage(volvoImage, getX(), getY(), null);
    }

}
