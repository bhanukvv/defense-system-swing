package controller;
import core.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;



public class MainController extends javax.swing.JFrame implements Observer {

   
    public MainController() {
        setTitle("Main Controller");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SelectUnit = new javax.swing.JLabel();
        cmbUnits = new javax.swing.JComboBox<>();
        btnAreaClear = new javax.swing.JToggleButton();
        lblSoldiers = new javax.swing.JLabel();
        lblAmmo = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblEnergy = new javax.swing.JLabel();
        lblOxygen = new javax.swing.JLabel();
        lblStrength = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        heliChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tankChat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        subChat = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        groupActivity = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textPrivateMessage = new javax.swing.JTextField();
        btnSendPrivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SelectUnit.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        SelectUnit.setText("Select Defense");

        cmbUnits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defense" }));
        cmbUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnitsActionPerformed(evt);
            }
        });

        btnAreaClear.setText("Area Clear");
        btnAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaClearActionPerformed(evt);
            }
        });

        lblSoldiers.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblSoldiers.setText("Soldier Count");

        lblAmmo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblAmmo.setText("Ammo Count");

        lblPosition.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblPosition.setText("Position");

        lblEnergy.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblEnergy.setText("Energy");

        lblOxygen.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblOxygen.setText("Oxygen");

        lblStrength.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblStrength.setText("Strength");

        heliChat.setEditable(false);
        heliChat.setBackground(new java.awt.Color(255, 255, 255));
        heliChat.setColumns(20);
        heliChat.setRows(5);
        heliChat.setBorder(javax.swing.BorderFactory.createTitledBorder("Helicopter"));
        jScrollPane1.setViewportView(heliChat);

        tankChat.setEditable(false);
        tankChat.setBackground(new java.awt.Color(255, 255, 255));
        tankChat.setColumns(20);
        tankChat.setRows(5);
        tankChat.setBorder(javax.swing.BorderFactory.createTitledBorder("Tank"));
        jScrollPane2.setViewportView(tankChat);

        subChat.setEditable(false);
        subChat.setBackground(new java.awt.Color(255, 255, 255));
        subChat.setColumns(20);
        subChat.setRows(5);
        subChat.setBorder(javax.swing.BorderFactory.createTitledBorder("Submarine"));
        jScrollPane3.setViewportView(subChat);

        groupActivity.setEditable(false);
        groupActivity.setBackground(new java.awt.Color(255, 255, 255));
        groupActivity.setColumns(20);
        groupActivity.setRows(5);
        groupActivity.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Controller Group Activity"));
        jScrollPane4.setViewportView(groupActivity);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Soldier Count");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Fuel Amount");

        btnSendPrivate.setText("Send");
        btnSendPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendPrivateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textPrivateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendPrivate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnergy)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SelectUnit)
                                .addGap(59, 59, 59)
                                .addComponent(cmbUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAmmo)
                                    .addComponent(lblStrength)
                                    .addComponent(jLabel1)
                                    .addComponent(lblOxygen)
                                    .addComponent(jLabel2)
                                    .addComponent(lblSoldiers)
                                    .addComponent(lblPosition))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectUnit)
                            .addComponent(btnAreaClear)
                            .addComponent(cmbUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSoldiers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAmmo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPosition)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStrength)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOxygen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(lblEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPrivateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSendPrivate))
                        .addGap(15, 15, 15))))
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
 
//Msg send button action listner 
    private void btnSendPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendPrivateActionPerformed
        String target=(String) cmbUnits.getSelectedItem();
        if(target==null) return;
        String msg=textPrivateMessage.getText().trim();
        if(msg.isEmpty()) return;
        sendPrivateMessageToUnit(target,msg);
        textPrivateMessage.setText("");       
    }//GEN-LAST:event_btnSendPrivateActionPerformed

    private void btnAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaClearActionPerformed
       toggleAreaClear();
    }//GEN-LAST:event_btnAreaClearActionPerformed

    private void cmbUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnitsActionPerformed
       onUnitSelected();
    }//GEN-LAST:event_cmbUnitsActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelectUnit;
    private javax.swing.JToggleButton btnAreaClear;
    private javax.swing.JButton btnSendPrivate;
    private javax.swing.JComboBox<String> cmbUnits;
    private javax.swing.JTextArea groupActivity;
    private javax.swing.JTextArea heliChat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblEnergy;
    private javax.swing.JLabel lblOxygen;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSoldiers;
    private javax.swing.JLabel lblStrength;
    private javax.swing.JTextArea subChat;
    private javax.swing.JTextArea tankChat;
    private javax.swing.JTextField textPrivateMessage;
    // End of variables declaration//GEN-END:variables

//create arrayList
    private final List<ObservableUnit> units=new ArrayList<>();
    
//area clear or not logic     
    private void toggleAreaClear(){
        boolean on=btnAreaClear.isSelected();
        btnAreaClear.setText(on? "ON":"OFF");
        // When area is clear (ON), disable shooting. When OFF, enable shooting
        broadcastCommand("CMD:AREA_CLEAR:"+ (on ? "ON" : "OFF"));
        appendGroup("[SYSTEM] AREA CLEAR CHANGE :"+(on ? "ON" : "OFF") + (on ? " (Shooting DISABLED)" : " (Shooting ENABLED)"));
    }
//register units
    public void registerUnit(ObservableUnit u){
        if(u==null) return;
        
        units.add(u);
        u.registerObserver(this);
        cmbUnits.addItem(u.getUnitName());
        appendGroup("[SYSTEM] Registered :"+u.getUnitName());
    }
//brodcast system
    private void broadcastCommand(String cmd){
        for(ObservableUnit u :units){
        u.receiveBroadcast("MainController", cmd,Strength.HIGH);
        }
    }
//private messaging    
    private void sendPrivateMessageToUnit(String unitName,String msg){
        for(ObservableUnit u : units){
            if(u.getUnitName().equals(unitName)){
            u.receiveBroadcast("MainController","CMD:PRIVATE:"+msg,Strength.HIGH);
            appendPrivate(unitName,"[ME]:"+msg);
            return;
            }
        }
    }
    private void appendPrivate(String unitName,String msg){
        switch(unitName){
            case "Helicopter":
                heliChat.append(msg+"\n");
                break;         
            case "Tank":
                tankChat.append(msg+"\n");
                break;
            case "Submarine":
                subChat.append(msg+"\n");
                break;
                        
        }
    }
    private void appendGroup(String msg){
        groupActivity.append(msg+ "\n");
    }
    
    @Override
    public void onNotify(ObservableUnit unit, String message, Strength strength){
        String name=unit.getUnitName();
        
        if (message.startsWith("CHAT:")) {
            String txt = message.substring(5);
            appendPrivate(name, "[" + name + "]: " + txt);
            return;
        }
        
        // Only add non-CHAT messages to activity log
        appendGroup("["+name+"] :"+message);
        
 if (message.startsWith("ACTION:")) {
           
        } else if (message.startsWith("POSITION:")) {
            String selected = (String) cmbUnits.getSelectedItem();
            if (selected != null && selected.equals(name)) {
                String position = message.substring(message.lastIndexOf(" ") + 1);
                lblPosition.setText("Position: " + position);
            }
        } else if (message.startsWith("STATUS:")) {
           
            String selected = (String) cmbUnits.getSelectedItem();
            if (selected != null && selected.equals(name)) {
                parseAndApplyStatus(message.substring(7));
            }
        }
    }
    private void parseAndApplyStatus(String payload) {
        
        String[] parts = payload.split(";");
        int soldiersV = -1, ammoV = -1, oxygenV = -1, energyV = -1;
        String strengthStr = null;
        for (String p : parts) {
            String[] kv = p.split("=");
            if (kv.length != 2) continue;
            String k = kv[0].trim();
            String v = kv[1].trim();
            try {
                switch (k) {
                    case "soldiers":
                        soldiersV = Integer.parseInt(v);
                        break;
                    case "ammo":
                        ammoV = Integer.parseInt(v);
                        break;
                    case "oxygen":
                        oxygenV = Integer.parseInt(v);
                        break;
                    case "energy":
                        energyV = Integer.parseInt(v);
                        break;
                    case "strength":
                        strengthStr = v;
                        break;
                }
            } catch (NumberFormatException ignored) {}
        }

        if (soldiersV >= 0) lblSoldiers.setText("Soldiers: " + soldiersV);
        if (ammoV >= 0) lblAmmo.setText("Ammo: " + ammoV);
        if (oxygenV >= 0) lblOxygen.setText("Oxygen: " + oxygenV);
        if (energyV >= 0) lblEnergy.setText("Energy: " + energyV);
        if (strengthStr != null) lblStrength.setText("Strength: " + strengthStr);
    }
     private void onUnitSelected() {
        String selected = (String) cmbUnits.getSelectedItem();
        if (selected == null || selected.equals("Select Defense")) return;

        // Force units to send current status so mainframe can show it
        for (ObservableUnit u : units) {
            if (u.getUnitName().equals(selected)) {
                u.receiveBroadcast("MainController", "CMD:REQUEST_STATUS", Strength.HIGH);
                break;
            }
        }
    }       
}

