package ro.siit.session7;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageManager {
    public static void main(String[] args) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("SNice.png"));
        } catch (IOException e) {
        }

        try {
            Files.delete(Paths.get("SNice.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedImage rotatedImage = Scalr.rotate(img, Scalr.Rotation.FLIP_HORZ);

        try {
            File outputfile = new File("SNice.png");
            ImageIO.write(rotatedImage, "png", outputfile);
        } catch (IOException e) {
        }

        // Scalr.determineScalingMethod(1,1,1.0);
    }
}
