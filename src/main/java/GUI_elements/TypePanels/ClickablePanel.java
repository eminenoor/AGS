import javax.swing.JOptionPane;
import javax.swing.JPanel;


import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickablePanel extends JPanel implements MouseListener {
    
    private Flight flight;

    public ClickablePanel(Flight flight){

        this.flight = flight;
        addMouseListener(this);

        setPreferredSize(new Dimension(100, 100));

    }


    



    @Override
    public void mouseClicked(MouseEvent e) {
        // Action to perform when the panel is clicked
        DetailedFlightPanel2 panel = new DetailedFlightPanel2(flight);

    }

    // Other methods from MouseListener interface (unused for this example)
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}
