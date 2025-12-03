package Controller;
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

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        SelectUnit = new javax.swing.JLabel();
        cmbUnits = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAreaClear = new javax.swing.JToggleButton();
        lblSoldiers = new javax.swing.JLabel();
        lblAmmo = new javax.swing.JLabel();
        lblOxygen = new javax.swing.JLabel();
        lblEnergy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        heliChat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupActivity = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tankChat = new javax.swing.JTextArea();
        textPrivateMessage = new javax.swing.JTextField();
        btnSendPrivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SelectUnit.setBackground(new java.awt.Color(255, 255, 255));
        SelectUnit.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        SelectUnit.setText("Select Unit :");

        cmbUnits.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        cmbUnits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Unit", "Helicopter", "Tank", "Submarine" }));
        cmbUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnitsActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Area Clear :");

        btnAreaClear.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnAreaClear.setText("OFF");
        btnAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaClearActionPerformed(evt);
            }
        });

        lblSoldiers.setBackground(new java.awt.Color(255, 255, 255));
        lblSoldiers.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblSoldiers.setText("Soldiers :");

        lblAmmo.setBackground(new java.awt.Color(255, 255, 255));
        lblAmmo.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblAmmo.setText("Ammo    :");

        lblOxygen.setBackground(new java.awt.Color(255, 255, 255));
        lblOxygen.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblOxygen.setText("Oxygen  :");

        lblEnergy.setBackground(new java.awt.Color(255, 255, 255));
        lblEnergy.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblEnergy.setText("Energy   :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setText("Strength:");

        subChat.setEditable(false);
        subChat.setBackground(new java.awt.Color(255, 255, 255));
        subChat.setColumns(20);
        subChat.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        subChat.setRows(5);
        subChat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Submarine Private Chat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(subChat);

        heliChat.setEditable(false);
        heliChat.setBackground(new java.awt.Color(255, 255, 255));
        heliChat.setColumns(20);
        heliChat.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        heliChat.setRows(5);
        heliChat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Helicopter Private Chat ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(heliChat);

        groupActivity.setEditable(false);
        groupActivity.setBackground(new java.awt.Color(255, 255, 255));
        groupActivity.setColumns(20);
        groupActivity.setFont(new java.awt.Font("Corbel Light", 1, 12)); // NOI18N
        groupActivity.setRows(5);
        groupActivity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group Activity Log ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane3.setViewportView(groupActivity);

        tankChat.setEditable(false);
        tankChat.setBackground(new java.awt.Color(255, 255, 255));
        tankChat.setColumns(20);
        tankChat.setFont(new java.awt.Font("Corbel Light", 1, 12)); // NOI18N
        tankChat.setRows(5);
        tankChat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tank Private Chat ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane4.setViewportView(tankChat);

        textPrivateMessage.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        textPrivateMessage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "private msg box", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N

        btnSendPrivate.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        btnSendPrivate.setText("Send Private Message");
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSoldiers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SelectUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(cmbUnits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAreaClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblAmmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblOxygen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEnergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(textPrivateMessage)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPrivateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SelectUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbUnits)
                                    .addComponent(btnAreaClear, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(lblSoldiers, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAmmo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOxygen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEnergy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap(10, Short.MAX_VALUE))
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
        String msg=txtPrivateMessage.getText();trim();
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblEnergy;
    private javax.swing.JLabel lblOxygen;
    private javax.swing.JLabel lblSoldiers;
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
        brodcastCommand("CMD:AREA_CLEAR:"+ (on ? "ON" : "OFF"));
        appendGroup("[SYSTEM] AREA CLEAR CHANGE :"+(on ? "ON" : "OFF"));
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
        u.receiveBroadcast("MainController", cmd,Strength.High);
        }
    }
//private messaging    
    private void sendPrivateMessageToUnit(String unitName,String msg){
        for(ObservableUnit u : units){
            if(u.getUnitName().equals(unitName)){
            u.receiveBroadcast("Maincontroller","CMD : PRIVATE:"+msg,Strength.HIGH);
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
        appendGroup("["+name+"] :"+message);
        
        if (message.startsWith("CHAT:")) {
            String txt = message.substring(5);
            appendPrivate(name, "[" + name + "]: " + txt);
            return;
        }
 if (message.startsWith("ACTION:")) {
           
        } else if (message.startsWith("POSITION:")) {
            
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
                    case "soldiers" -> soldiersV = Integer.parseInt(v);
                    case "ammo" -> ammoV = Integer.parseInt(v);
                    case "oxygen" -> oxygenV = Integer.parseInt(v);
                    case "energy" -> energyV = Integer.parseInt(v);
                    case "strength" -> strengthStr = v;
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
        if (selected == null) return;

        // Force units to send current status so mainframe can show it
        for (ObservableUnit u : units) {
            if (u.getUnitName().equals(selected)) {
                u.receiveBroadcast("MainController", "CMD:REQUEST_STATUS", Strength.HIGH);
                break;
            }
        }
    }       
}

