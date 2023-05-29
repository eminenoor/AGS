package GUI_elements.MainMenu;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.plaf.DimensionUIResource;

import Accounts.Account;
import GUI_elements.HomePage.HomePanel2;


public class TestMainFrame {

    public static void main(String[] args) {
        

        JFrame frame = new JFrame();
        frame.setTitle("stained_image");
   
        frame.setSize(new Dimension(1000, 1000)) ;
        

        HomePanel2 panel = new HomePanel2(new Account("ege", "1", 0, "3"));
        frame.add(panel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    
}
