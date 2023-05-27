import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class FlightAnimation extends JLabel{
    
    public File imgLoc;
    public Boolean isFlying;
    public BufferedImage img;
    public Icon icon;


    public FlightAnimation( Boolean isFlying){


        this.isFlying = isFlying;
        if(isFlying == true){
            imgLoc = new File("AGS/Important_Classes/PlaneFlying.jpeg");
        }else{

            imgLoc = new File("AGS/Important_Classes/PlaneGround.jpeg");
        }


        if (imgLoc.canRead()) {
            try {
                img = ImageIO.read(imgLoc);
                BufferedImage img2 = resizeImage(img,200,100);
   


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

}
