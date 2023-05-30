package Important_Classes;

import GUI_elements.TypePanels.FlightsPanel;

public class DetailedFlightPanel extends javax.swing.JFrame {


    // Variables declaration - do not modify                     
    private javax.swing.JLabel ArlTime;
    private javax.swing.JLabel ArrivalTime;
    private javax.swing.JLabel DepartingFrom;
    private javax.swing.JLabel DepartureTİme;
    private javax.swing.JLabel Destination;
    private javax.swing.JLabel Dpttime;
    private javax.swing.JLabel FlightID;
    private javax.swing.JLabel FlightNumber;
    private javax.swing.JLabel LocationA;
    private javax.swing.JLabel LocationB;
    private javax.swing.JLabel Pilot;
    private javax.swing.JLabel Plane;
    private javax.swing.JLabel PlaneName;
    private javax.swing.JLabel WheatherCondition;
    private javax.swing.JLabel isPilotReady;
    private javax.swing.JLabel isPlaneRady;
    private javax.swing.JLabel isWeatherReady;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pilotID;
    private javax.swing.JLabel weather;


    private Flight flight;
    // End of variables declaration          



   /**
     * Creates new form DetailedFlightPanel
     */
    public DetailedFlightPanel(Flight flight) {

        this.flight = flight;
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DepartingFrom = new javax.swing.JLabel();
        Destination = new javax.swing.JLabel();
        DepartureTİme = new javax.swing.JLabel();
        ArrivalTime = new javax.swing.JLabel();
        FlightNumber = new javax.swing.JLabel();
        FlightID = new javax.swing.JLabel();
        Plane = new javax.swing.JLabel();
        Pilot = new javax.swing.JLabel();
        Dpttime = new javax.swing.JLabel();
        ArlTime = new javax.swing.JLabel();
        PlaneName = new javax.swing.JLabel();
        pilotID = new javax.swing.JLabel();
        LocationA = new javax.swing.JLabel();
        LocationB = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        WheatherCondition = new javax.swing.JLabel();
        weather = new javax.swing.JLabel();
        isPlaneRady = new javax.swing.JLabel();
        isPilotReady = new javax.swing.JLabel();
        isWeatherReady = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);


        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        DepartingFrom.setBackground(new java.awt.Color(255, 255, 153));
        DepartingFrom.setText("Departing From :");
        DepartingFrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        DepartingFrom.setOpaque(true);

        Destination.setBackground(new java.awt.Color(255, 255, 153));
        Destination.setText("Destination :");
        Destination.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        Destination.setOpaque(true);

        DepartureTİme.setText("Departure time:");
        DepartureTİme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        DepartureTİme.setOpaque(true);

        ArrivalTime.setText("Arrival Time:");
        ArrivalTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ArrivalTime.setOpaque(true);

        FlightNumber.setBackground(new java.awt.Color(102, 204, 0));
        FlightNumber.setText("Flight Number : ");
        FlightNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));
        FlightNumber.setOpaque(true);

        FlightID.setText(flight.getFlightCode());
        FlightID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));

        Plane.setBackground(new java.awt.Color(102, 204, 0));
        Plane.setText("Plane :");
        Plane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));
        Plane.setOpaque(true);

        Pilot.setBackground(new java.awt.Color(102, 204, 0));
        Pilot.setText("Pilot :");
        Pilot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));
        Pilot.setOpaque(true);

        Dpttime.setText("" + flight.getDepartureTime());
        Dpttime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ArlTime.setText("" + flight.getArrivalTime());
        ArlTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        PlaneName.setText("" + flight.getPlaneID());
        PlaneName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));

        pilotID.setText("" + flight.getPilotName());
        pilotID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));

        LocationA.setText(flight.getDepartureLocation());
        LocationA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        LocationB.setText(flight.getDestination());
        LocationB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel15.setBackground(new java.awt.Color(0, 0, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Flight Information");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel15.setOpaque(true);

        WheatherCondition.setBackground(new java.awt.Color(102, 204, 0));
        WheatherCondition.setText("Weather Condition:");
        WheatherCondition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));
        WheatherCondition.setOpaque(true);

        weather.setText("weather");
        weather.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0)));

        //TODO add icons
        if(!(flight.getIsSafe().equals("True")))
        {
            isPlaneRady = new WarningLabel();
        }
        else
        {
            isPlaneRady.setText("!");
        }
        
        if(!(FlightsPanel.pilotHealthList.get(FlightsPanel.getPilotNameList().indexOf(flight.getPilotName())) == "True"))
        {
            isPilotReady = new WarningLabel();
            
        }else{
            isPilotReady.setText("?");
        }

        //last one
        isWeatherReady.setText("!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DepartureTİme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepartingFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(FlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pilot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Plane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WheatherCondition, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FlightID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pilotID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dpttime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocationA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlaneName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(weather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ArrivalTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Destination, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ArlTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LocationB, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                            .addComponent(isPlaneRady, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isPilotReady, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isWeatherReady, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Destination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LocationB))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DepartingFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LocationA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartureTİme)
                    .addComponent(ArlTime)
                    .addComponent(ArrivalTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dpttime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlightNumber)
                    .addComponent(FlightID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plane)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PlaneName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isPlaneRady)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pilot)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pilotID)
                        .addComponent(isPilotReady, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WheatherCondition)
                    .addComponent(weather)
                    .addComponent(isWeatherReady))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>




}
