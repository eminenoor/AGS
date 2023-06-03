package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import GUI_elements.TypePanels.FlightsPanel;
import Important_Classes.Flight;

public class DeleteFlightPage extends JPanel {
    private JLabel deleteFlightLabel;
    private JButton backBtn;
    private JLabel flightNumLabel;
    private JComboBox<String> flightNumbersComboBox;
    private JButton deleteBtn;

    public DeleteFlightPage() {
        initComponents();
    }

    private void initComponents() {
        deleteFlightLabel = new JLabel();
        backBtn = new JButton();
        flightNumLabel = new JLabel();
        flightNumbersComboBox = new JComboBox<>();
        deleteBtn = new JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        deleteFlightLabel.setBackground(new java.awt.Color(255, 255, 255));
        deleteFlightLabel.setFont(new java.awt.Font("Segoe UI", 1, 18));
        deleteFlightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteFlightLabel.setText("Delete Flight");
        deleteFlightLabel.setOpaque(true);

        backBtn.setText("<--");

        flightNumLabel.setText("Flight Number: ");

 

        FlightsPanel.loadFlightsOntoList();

        String[] temp = new String[FlightsPanel.flightsList.size()];

        for (int i = 0; i < FlightsPanel.flightsList.size(); i++) {
                
                temp[i] = FlightsPanel.flightsList.get(i).getFlightCode();
        }

        
        flightNumbersComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(temp));
        

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new deleteListener());


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup().addComponent(flightNumLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(flightNumbersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(deleteFlightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(100, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deleteFlightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(flightNumLabel)
                                .addComponent(flightNumbersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(200, Short.MAX_VALUE)));
    }

    class deleteListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event)
        {
                String ID = (String)flightNumbersComboBox.getSelectedItem();

                Flight.removeFlight(ID);
                JOptionPane.showMessageDialog(null, "Flight has been deleted, flight will not be visible when the app is closed.");
        }
        

    }


    public void goBackBtnListener(ActionListener event) {
        backBtn.addActionListener(event);
    }
}
