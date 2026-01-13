package units.helicopter;

import core.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Helicopter extends javax.swing.JFrame implements ObservableUnit {

    private final List<Observer> observers = new ArrayList<>();
    private Strength currentStrength = Strength.MEDIUM;
    
    public Helicopter() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spinSoldiers = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinAmmo = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox<>();
        sliderStrength = new javax.swing.JSlider();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessages = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPrivateMsg = new javax.swing.JTextArea();
        txtMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter Unit");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Soldiers:");

        spinSoldiers.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        spinSoldiers.setModel(new javax.swing.SpinnerNumberModel(50, 0, 100, 1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setText("Ammo:");

        spinAmmo.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        spinAmmo.setModel(new javax.swing.SpinnerNumberModel(250, 0, 500, 1));

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
        sliderStrength.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
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

        btnLaser.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnLaser.setText("Laser");
        btnLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserActionPerformed(evt);
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
        txtAreaPrivateMsg.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaPrivateMsg.setColumns(20);
        txtAreaPrivateMsg.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        txtAreaPrivateMsg.setRows(5);
        txtAreaPrivateMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Private Messages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(txtAreaPrivateMsg);

        txtMessage.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 11))); // NOI18N
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spinSoldiers, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(spinAmmo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnLaser, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sliderStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sliderStrength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinSoldiers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinAmmo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(btnLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        int ammo = (Integer) spinAmmo.getValue();
        
        if (ammo < 10) {
            JOptionPane.showMessageDialog(this, "Not enough ammo!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        spinAmmo.setValue(ammo - 10);
        String action = "Helicopter shot fired! Ammo: " + (ammo - 10);
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
        sendStatusUpdate();
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileActionPerformed
        int ammo = (Integer) spinAmmo.getValue();
        
        if (ammo < 50) {
            JOptionPane.showMessageDialog(this, "Not enough ammo for missile!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        spinAmmo.setValue(ammo - 50);
        String action = "Helicopter missile launched! Ammo: " + (ammo - 50);
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
        sendStatusUpdate();
    }//GEN-LAST:event_btnMissileActionPerformed

    private void btnLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserActionPerformed
        String action = "Helicopter laser operation activated!";
        txtAreaMessages.append("[ACTION]: " + action + "\n");
        notifyObservers("ACTION:" + action);
    }//GEN-LAST:event_btnLaserActionPerformed

    private void cmbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPositionActionPerformed
        String position = (String) cmbPosition.getSelectedItem();
        String posMsg = "Helicopter moved to " + position;
        txtAreaMessages.append("[POSITION]: " + posMsg + "\n");
        notifyObservers("POSITION:" + posMsg);
    }//GEN-LAST:event_cmbPositionActionPerformed

    private void sliderStrengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStrengthStateChanged
        if (!sliderStrength.getValueIsAdjusting()) {
            currentStrength = Strength.fromInt(sliderStrength.getValue());
            notifyObservers("Helicopter strength changed to " + currentStrength);
            sendStatusUpdate();
        }
    }//GEN-LAST:event_sliderStrengthStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String msg = txtMessage.getText().trim();
        if (!msg.isEmpty()) {
            txtAreaPrivateMsg.append("[Helicopter]: " + msg + "\n");
            notifyObservers("CHAT:" + msg);
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider sliderStrength;
    private javax.swing.JSpinner spinAmmo;
    private javax.swing.JSpinner spinSoldiers;
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
        return "Helicopter";
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
        return (Integer) spinSoldiers.getValue();
    }

    @Override
    public int getAmmo() {
        return (Integer) spinAmmo.getValue();
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
            btnLaser.setEnabled(!areaClear);
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
        String status = String.format("STATUS:soldiers=%d;ammo=%d;oxygen=0;energy=0;strength=%s",
                getSoldiers(), getAmmo(), currentStrength.toString());
        notifyObservers(status);
    }
}
