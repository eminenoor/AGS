import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WarningLabel extends JLabel {
    private ImageIcon icon;

    private BufferedImage img;


    public WarningLabel(){

        String filename = "AGS/Important_Classes/Warning icon.jpg";


        File imgLoc = new File(filename);

        if (imgLoc.canRead()) {
            try {
                img = ImageIO.read(new File(filename));
                BufferedImage img2 = resizeImage(img,16,16);
                img2 = removeTransparentBackground(img2);


                icon = new ImageIcon(img2);
                this.setIcon(icon);
                
            }

            catch (IOException ex) {
                System.err.println(ex.getMessage());
                ex.printStackTrace();

            }

    }


}

private static BufferedImage resizeImage(BufferedImage originalImage, int newWidth, int newHeight)
{
   BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
   Graphics2D g2d = resizedImage.createGraphics();
   g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
   g2d.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
   g2d.dispose();
   return resizedImage;
}
private static BufferedImage removeTransparentBackground(BufferedImage image) {
    int width = image.getWidth();
    int height = image.getHeight();
    BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = result.createGraphics();
    g2d.drawImage(image, 0, 0, null);
    g2d.dispose();
    return result;
}
}
