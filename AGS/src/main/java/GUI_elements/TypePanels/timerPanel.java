package GUI_elements.TypePanels;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.Timer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timerPanel extends JPanel{

    private JLabel dateLabel;
    private JLabel LineLabel;
    private JLabel timeLabel;

    public timerPanel() {

        super();
        this.setLayout( new GridLayout(3,1));
        this.setSize(176, 55);

        Date date = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        String onlyDate = sdt.format(date);

        dateLabel = new JLabel(onlyDate);

        LineLabel = new JLabel("------------");

        SimpleDateFormat sdt2 = new SimpleDateFormat("hh:mm");
        String onlyTime = sdt2.format(date);

        timeLabel = new JLabel(onlyTime);

        Timer timer = new Timer(60000, new DateTimeAction() );
        timer.start();
    
        this.add(dateLabel,0);
        this.add(LineLabel,1);
        this.add(timeLabel,2);
        


    }
    class DateTimeAction implements ActionListener{

        public void actionPerformed(ActionEvent e){

            Date date = new Date();
            SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
            String onlyDate = sdt.format(date);
    
            dateLabel.setText(onlyDate);
    

    
            SimpleDateFormat sdt2 = new SimpleDateFormat("hh:mm");
            String onlyTime = sdt2.format(date);
    
            timeLabel.setText(onlyTime);
    


        }

    }
}
