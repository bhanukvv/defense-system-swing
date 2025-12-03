package core;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class SuperDefence extends javax.swing.JFrame implements ObservableUnit {
    protected String unitName;
    protected int soldiers;
    protected int ammo;
    protected Strength strength;
    
    protected final List<JButton> actionButtons = new java.util.ArrayList<>();
    
    protected boolean areaCleared = false;
    protected int position = 0;
    
    protected final CopyOnWriteArrayList<Observer> observers = new CopyOnWriteArrayList<>();
    

   
    public SuperDefence(String unitName, int soldiers, int ammo, Strength initialStrength) {
        super(unitName);
        this.unitName = unitName;
        this.soldiers = soldiers;
        this.ammo = ammo;
        this.strength = initialStrength;
        UND.setText(unitName);
        SD.setText(Integer.toString( soldiers));
        AD.setText(Integer.toString(ammo));
        SLD.setText(strength.toString());
        
        

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityLog = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        chatInput = new javax.swing.JTextField();
        chatSend = new javax.swing.JButton();
        UN = new javax.swing.JLabel();
        UND = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        SD = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        SL = new javax.swing.JLabel();
        AD = new javax.swing.JLabel();
        SLD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        activityLog.setEditable(false);
        activityLog.setBackground(new java.awt.Color(255, 255, 255));
        activityLog.setColumns(20);
        activityLog.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        activityLog.setRows(5);
        activityLog.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activity Log", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(activityLog);

        chatBox.setEditable(false);
        chatBox.setBackground(new java.awt.Color(255, 255, 255));
        chatBox.setColumns(20);
        chatBox.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        chatBox.setRows(5);
        chatBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Private ChatBox", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(chatBox);

        chatInput.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        chatInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatInputActionPerformed(evt);
            }
        });

        chatSend.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        chatSend.setText("Send");
        chatSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatSendActionPerformed(evt);
            }
        });

        UN.setBackground(new java.awt.Color(255, 255, 255));
        UN.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        UN.setText("Unit name  :");

        UND.setBackground(new java.awt.Color(255, 255, 255));
        UND.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        UND.setText("-");

        S.setBackground(new java.awt.Color(255, 255, 255));
        S.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        S.setText("Soldiers c     :");

        SD.setBackground(new java.awt.Color(255, 255, 255));
        SD.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        SD.setText("-");

        A.setBackground(new java.awt.Color(255, 255, 255));
        A.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        A.setText("Ammo c       :");

        SL.setBackground(new java.awt.Color(255, 255, 255));
        SL.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        SL.setText("Strength L   :");

        AD.setBackground(new java.awt.Color(255, 255, 255));
        AD.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        AD.setText("-");

        SLD.setBackground(new java.awt.Color(255, 255, 255));
        SLD.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        SLD.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(chatSend, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(chatInput)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SLD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UN)
                            .addComponent(UND))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(S)
                            .addComponent(SD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A)
                            .addComponent(AD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SL)
                            .addComponent(SLD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chatInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chatSend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void chatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatInputActionPerformed
       
    }//GEN-LAST:event_chatInputActionPerformed

    private void chatSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatSendActionPerformed
        
    }//GEN-LAST:event_chatSendActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperDefence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel AD;
    private javax.swing.JLabel S;
    private javax.swing.JLabel SD;
    private javax.swing.JLabel SL;
    private javax.swing.JLabel SLD;
    private javax.swing.JLabel UN;
    private javax.swing.JLabel UND;
    private javax.swing.JTextArea activityLog;
    private javax.swing.JTextArea chatBox;
    private javax.swing.JTextField chatInput;
    private javax.swing.JButton chatSend;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
 
    protected void appendLocal(String text) {
        activityLog.append(text + "\n");
    }

    protected void appendChat(String text) {
        chatBox.append(text + "\n");
    }
    
    
    protected void sendPrivate(String text) {
        if (text == null || text.trim().isEmpty()) return;
        appendChat("[You]: " + text);
        notifyObservers("CHAT:" + text);
    }
    
     protected void sendAction(String payload) {
        appendLocal("[Action] " + payload);
        notifyObservers("ACTION:" + payload);
    }

    protected void reportPosition(int pos) {
        this.position = Math.max(0, Math.min(100, pos));
        notifyObservers("POSITION:" + this.position);
    }

    protected void setActionButtonsEnabled(boolean enabled) {
        for (JButton b : actionButtons) if (b != null) b.setEnabled(enabled);
    }

    protected boolean isAreaCleared() {
        return areaCleared;
        
    }
     @Override
    public void registerObserver(Observer o) {
        if (o != null && !observers.contains(o)) observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            try {
                o.onNotify(this, message, this.strength);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

    @Override
    public String getUnitName() { return unitName; }

    @Override
    public Strength getStrength() { return strength; }

    @Override
    public void setStrength(Strength s) { if (s != null) this.strength = s; }

    @Override
    public int getSoldiers() { return soldiers; }

    @Override
    public int getAmmo() { return ammo; }

     @Override
    public void receiveBroadcast(String from, String broadcastMessage, Strength globalStrength) {
        if (broadcastMessage == null) return;

        if (broadcastMessage.startsWith("CMD:")) {
            String cmd = broadcastMessage.substring(4);
            if (cmd.equalsIgnoreCase("AREA_CLEAR:ON")) {
                areaCleared = true;
                setActionButtonsEnabled(true);
                appendLocal("[Controller] Area cleared: ON");
                return;
            } else if (cmd.equalsIgnoreCase("AREA_CLEAR:OFF")) {
                areaCleared = false;
                setActionButtonsEnabled(false);
                appendLocal("[Controller] Area cleared: OFF");
                return;
            } else if (cmd.startsWith("PRIVATE:")) {
                String pm = cmd.substring(8);
                appendChat("[Controller - Private]: " + pm);
                return;
            } else if (cmd.equalsIgnoreCase("REQUEST_STATUS")) {
                notifyObservers("STATUS:soldiers=" + soldiers + ";ammo=" + ammo + ";strength=" + strength.toString());
                return;
            } else if (cmd.equalsIgnoreCase("REQUEST_POSITION")) {
                notifyObservers("POSITION:" + position);
                return;
            }
        } else if (broadcastMessage.startsWith("GROUP:")) {
            
            return;
        }

        
        appendLocal("[Broadcast from " + from + "]: " + broadcastMessage);
    }
}

    
