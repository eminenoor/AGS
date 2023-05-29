import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TestMainFrame {

    public static void main(String[] args) {
        

        JFrame frame = new JFrame();
        frame.setTitle("stained_image");
        frame.setSize(1000, 200);
        

        HomePanel panel = new HomePanel(new Account("ege", "1", 0, "3"));
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    
}
