package units.submarine;

import core.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Submarine extends javax.swing.JFrame implements ObservableUnit {

    private final List<Observer> observers = new ArrayList<>();
    private Strength currentStrength = Strength.MEDIUM;
    
    public Submarine() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spinEnergy = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinOxygen = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox<>();
        sliderStrength = new javax.swing.JSlider();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessages = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPrivateMsg = new javax.swing.JTextArea();
        txtMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submarine Unit");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(881, 533));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Energy:");

        spinEnergy.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        spinEnergy.setModel(new javax.swing.SpinnerNumberModel(75, 0, 100, 1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setText("Oxygen:");

        spinOxygen.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        spinOxygen.setModel(new javax.swing.SpinnerNumberModel(80, 0, 100, 1));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setText("Position:");

        cmbPosition.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North", "South", "East", "West", "Center" }));
        cmbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPositionActionPerformed(evt);
            }
        });

        sliderStrength.setBackground(new java.awt.Color(255, 255, 255));
        sliderStrength.setMaximum(2);
        sliderStrength.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderStrength.setValue(1);
        sliderStrength.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Strength", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        sliderStrength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStrengthStateChanged(evt);
            }
        });

        btnShoot.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnMissile.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnMissile.setText("Missile");
        btnMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileActionPerformed(evt);
            }
        });

        btnSonar.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnSonar.setText("Sonar");
        btnSonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarActionPerformed(evt);
            }
        });

        txtAreaMessages.setEditable(false);
        txtAreaMessages.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaMessages.setColumns(20);
        txtAreaMessages.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        txtAreaMessages.setRows(5);
        txtAreaMessages.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activity Log", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(txtAreaMessages);

        txtAreaPrivateMsg.setEditable(false);
        txtAreaPrivateMsg.setColumns(20);
        txtAreaPrivateMsg.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        txtAreaPrivateMsg.setRows(5);
        txtAreaPrivateMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Private Messages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(txtAreaPrivateMsg);

        txtMessage.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 11))); // NOI18N

        btnSend.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnSend.setText("Send Message");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spinOxygen)
                            .addComponent(spinEnergy)
                            .addComponent(cmbPosition, 0, 80, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(txtMessage))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderStrength, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spinEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(spinOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSonar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        int energy = (Integer) spinEnergy.getValue();
        
        if (energy < 10) {
            JOptionPane.showMessageDialog(this, "Not enough energy!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        spinEnergy.setValue(energy - 10);
        String action = "Submarine underwater shot fired! Energy: " + (energy - 10);
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
        sendStatusUpdate();
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileActionPerformed
        int energy = (Integer) spinEnergy.getValue();
        
        if (energy < 30) {
            JOptionPane.showMessageDialog(this, "Not enough energy for missile!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        spinEnergy.setValue(energy - 30);
        String action = "Submarine missile launched! Energy: " + (energy - 30);
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
        sendStatusUpdate();
    }//GEN-LAST:event_btnMissileActionPerformed

    private void btnSonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarActionPerformed
        int energy = (Integer) spinEnergy.getValue();
        
        if (energy < 5) {
            JOptionPane.showMessageDialog(this, "Not enough energy for sonar!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        spinEnergy.setValue(energy - 5);
        String action = "Submarine sonar activated! Energy: " + (energy - 5);
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
        sendStatusUpdate();
    }//GEN-LAST:event_btnSonarActionPerformed

    private void cmbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPositionActionPerformed
        String position = (String) cmbPosition.getSelectedItem();
        String posMsg = "Submarine moved to " + position;
        txtAreaMessages.append("[POSITION]: " + posMsg + "\n");
        notifyObservers("POSITION:" + posMsg);
    }//GEN-LAST:event_cmbPositionActionPerformed

    private void sliderStrengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStrengthStateChanged
        if (!sliderStrength.getValueIsAdjusting()) {
            currentStrength = Strength.fromInt(sliderStrength.getValue());
            notifyObservers("Submarine strength changed to " + currentStrength);
            sendStatusUpdate();
        }
    }//GEN-LAST:event_sliderStrengthStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = txtMessage.getText().trim();
        if (!msg.isEmpty()) {
            txtAreaPrivateMsg.append("[Submarine]: " + msg + "\n");
            notifyObservers("CHAT:" + msg);
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider sliderStrength;
    private javax.swing.JSpinner spinEnergy;
    private javax.swing.JSpinner spinOxygen;
    private javax.swing.JTextArea txtAreaMessages;
    private javax.swing.JTextArea txtAreaPrivateMsg;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables

    // ObservableUnit interface implementation
    @Override
    public void registerObserver(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.onNotify(this, message, currentStrength);
        }
    }

    @Override
    public String getUnitName() {
        return "Submarine";
    }

    @Override
    public Strength getStrength() {
        return currentStrength;
    }

    @Override
    public void setStrength(Strength s) {
        this.currentStrength = s;
        sliderStrength.setValue(s.toInt());
    }

    @Override
    public int getSoldiers() {
        return 0; // Submarines don't have soldiers
    }

    @Override
    public int getAmmo() {
        return 0; // Submarines don't have traditional ammo
    }

    public int getEnergy() {
        return (Integer) spinEnergy.getValue();
    }

    public int getOxygen() {
        return (Integer) spinOxygen.getValue();
    }

    @Override
    public void receiveBroadcast(String from, String message, Strength globalStrength) {
        // Handle commands
        if (message.startsWith("CMD:REQUEST_STATUS")) {
            sendStatusUpdate();
        } else if (message.startsWith("CMD:AREA_CLEAR:")) {
            String status = message.substring(15);
            boolean areaClear = status.equals("ON");
            // When area is clear (ON), disable shooting. When OFF, enable shooting
            btnShoot.setEnabled(!areaClear);
            btnMissile.setEnabled(!areaClear);
            btnSonar.setEnabled(!areaClear);
            txtAreaMessages.append("[SYSTEM]: Area clear status: " + status + (areaClear ? " (Shooting DISABLED)" : " (Shooting ENABLED)") + "\n");
        } else if (message.startsWith("CMD:PRIVATE:")) {
            // Private messages appear in private message box
            String privateMsg = message.substring(12);
            txtAreaPrivateMsg.append("[MainController]: " + privateMsg + "\n");
            return;
        } else if (message.startsWith("CHAT:")) {
            // Chat messages don't appear in activity log (only in MainController private chat)
            return;
        } else {
            // Show all other broadcast messages in activity log
            txtAreaMessages.append("[" + from + "]: " + message + "\n");
        }
    }
    
    private void sendStatusUpdate() {
        String status = String.format("STATUS:soldiers=0;ammo=0;oxygen=%d;energy=%d;strength=%s",
                getOxygen(), getEnergy(), currentStrength.toString());
        notifyObservers(status);
    }
}
