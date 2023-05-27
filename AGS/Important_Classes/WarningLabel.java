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

                icon = new ImageIcon(img);
                this.setIcon(icon);
                
            }

            catch (IOException ex) {
                System.err.println(ex.getMessage());
                ex.printStackTrace();

            }

    }
}
}
