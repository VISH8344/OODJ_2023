/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Model.HostelRoom;
import Model.HostelSubClass.PremiumSingleRoom;
import Model.HostelSubClass.PremiumTwinRoom;
import Model.HostelSubClass.SingleRoom;
import Model.HostelSubClass.TwinRoom;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author mingl
 */
public class RoomCard extends javax.swing.JPanel {

    /**
     * Creates new form RoomCard
     */
    
    HostelRoom room;
    public RoomCard(HostelRoom room) {
        this.room = room;
        initComponents();
        RoomTypeLabel.setText(room.getClass().getSimpleName());
        facilitiesLabel.setText(room.getFacilities().toString());
        
        double price =0.0;
        DecimalFormat df = new DecimalFormat("0.00");
        switch(room.getClass().getSimpleName()){
            case "SingleRoom" -> {
                SingleRoom singleRoom = (SingleRoom) room;
                price = singleRoom.getRoomPrice();
            }
            case "TwinRoom" -> {
                TwinRoom twinRoom = (TwinRoom) room;
                price = twinRoom.getRoomPrice();
            }
            case "PremiumSingleRoom" -> {
                PremiumSingleRoom pmSingleRoom = (PremiumSingleRoom) room;
                price = pmSingleRoom.getRoomPrice();
            }
            case "PremiumTwinRoom" -> {
                PremiumTwinRoom pmTwinRoom = (PremiumTwinRoom) room;
                price = pmTwinRoom.getRoomPrice();
            }
        }
        priceLabel.setText(df.format(price));
    }
    
    public RoomCard roomCard(){
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomTypeLabel = new javax.swing.JLabel();
        facilitiesLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        contractLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contractLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        RoomTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RoomTypeLabel.setForeground(new java.awt.Color(0, 0, 0));
        RoomTypeLabel.setText("[TYPE]");

        facilitiesLabel.setForeground(new java.awt.Color(0, 0, 0));
        facilitiesLabel.setText("[facilities]");
        facilitiesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        facilitiesLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 51, 51));
        priceLabel.setText("XXXX.XX");

        contractLabel.setForeground(new java.awt.Color(0, 102, 255));
        contractLabel.setText("Contract duration: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("/ month");

        contractLabel1.setForeground(new java.awt.Color(0, 102, 255));
        contractLabel1.setText("3 months only (fixed)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("RM");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facilitiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contractLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contractLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(RoomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facilitiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contractLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contractLabel1)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you wanted to DELETE this room?", "Hey hey hey",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
        switch (res) {
            case 0:
                System.out.println("Pressed YES");
                break;
            case 1:
                System.out.println("Pressed NO");
                break;
            default:
                System.out.println("Pressed CANCEL");
                break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RoomTypeLabel;
    private javax.swing.JLabel contractLabel;
    private javax.swing.JLabel contractLabel1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel facilitiesLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
