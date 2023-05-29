import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import Accounts.Account;
import Pilot.PilotPanel;

public class MainFrame extends JFrame {
    

    //Is used to test the other panels
    //TODO delete on final project

    public MainFrame() {



        this.setTitle("stained_image");
        this.setSize(1000, 200);
        this.setLayout(new BorderLayout());
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        PilotPanel TypePanel = new PilotPanel();
        this.add(TypePanel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,0));

        Flight test = new Flight();
        panel.add(test.display(), 0,0);

        Flight test1 = new Flight();
        panel.add(test1.display() ,1,0);
        panel.add(test1.display(), 2,0);
        panel.add(test1.display(), 3,0);
        JScrollPane scroll = new JScrollPane(panel);

        this.add(scroll, BorderLayout.CENTER);

        this.pack();
    }

}
