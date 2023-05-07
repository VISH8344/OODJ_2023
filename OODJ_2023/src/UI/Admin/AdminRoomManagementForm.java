/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import Controller.HostelRoomController;
import Model.Enum.Facility;
import Model.Enum.RoomType;
import Model.HostelRoom;
import Model.HostelSubClass.PremiumSingleRoom;
import Model.HostelSubClass.PremiumTwinRoom;
import Model.HostelSubClass.SingleRoom;
import Model.HostelSubClass.TwinRoom;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 */
public class AdminRoomManagementForm extends javax.swing.JFrame {

    boolean isEdit = false;
    public HostelRoom room;
    int capacity = 0;
    double price = 0.0;
    ArrayList<Facility> selectedFacilities = new ArrayList<>();
    String[] roomtypes = {RoomType.SINGLE.toString(), RoomType.TWIN.toString(), RoomType.PREMIUMSINGLE.toString(), RoomType.PREMIUMTWIN.toString(),};

    /**
     * Creates new form AdminRoomManagementForm
     */
    public AdminRoomManagementForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setRoom(HostelRoom room) {
        // for editing room
        isEdit = true;
        this.room = room;
        int x= 1;
        switch (room.getClass().getSimpleName()) {
            case "SingleRoom" -> {
                SingleRoom singleRoom = (SingleRoom) room;
                roomTypeComboBox.setSelectedItem(singleRoom);
                roomTypeComboBox.setSelectedIndex(0);
                priceLabel.setText(singleRoom.getRoomPrice() + "");
                selectedFacilities = singleRoom.getFacilities();
            }
            case "TwinRoom" -> {
                TwinRoom twinRoom = (TwinRoom) room;
                roomTypeComboBox.setSelectedItem(twinRoom);
                roomTypeComboBox.setSelectedIndex(1);
                x = 2;
                priceLabel.setText(twinRoom.getRoomPrice() + "");
                selectedFacilities = twinRoom.getFacilities();
            }
            case "PremiumSingleRoom" -> {
                PremiumSingleRoom pmSingleRoom = (PremiumSingleRoom) room;
                roomTypeComboBox.setSelectedItem(pmSingleRoom);
                roomTypeComboBox.setSelectedIndex(2);
                priceLabel.setText(pmSingleRoom.getRoomPrice() + "");
                selectedFacilities = pmSingleRoom.getFacilities();
            }
            case "PremiumTwinRoom" -> {
                PremiumTwinRoom pmTwinRoom = (PremiumTwinRoom) room;
                roomTypeComboBox.setSelectedItem(pmTwinRoom);
                roomTypeComboBox.setSelectedIndex(3);
                x = 2;
                priceLabel.setText(pmTwinRoom.getRoomPrice() + "");
                selectedFacilities = pmTwinRoom.getFacilities();
            }
        }
        titleLabel.setText("Edit room details");
        capacityLabel.setText(room.getCapacity() + " / " +  x);
        
        for(int i = 0; i < selectedFacilities.size(); i++){
            System.out.println("selected facilities: " + selectedFacilities.get(i));
            switch(selectedFacilities.get(i)){
                case AIRCOND:
                    aircondCheckbox.setSelected(true);
                    break;
                case KITCHEN:
                    kitchenCheckbox.setSelected(true);
                    break;
                case WASHING_MACHINE:
                    wMachineCheckbox.setSelected(true);
                    break;
                case TELEVISION:
                    teleCheckbox.setSelected(true);
                    break;
                case ATTACHED_BATHROOM:
                    aBathroomCheckbox.setSelected(true);
                    break;
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>(roomtypes);
        jLabel3 = new javax.swing.JLabel();
        aircondCheckbox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        kitchenCheckbox = new javax.swing.JCheckBox();
        wMachineCheckbox = new javax.swing.JCheckBox();
        teleCheckbox = new javax.swing.JCheckBox();
        aBathroomCheckbox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        capacityLabel = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ROOM TYPE");

        roomTypeComboBox.setToolTipText("");
        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CAPACITY AVAILABLE");

        aircondCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        aircondCheckbox.setText("AIRCOND");
        aircondCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aircondCheckboxActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("FACILITY");

        kitchenCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        kitchenCheckbox.setText("KITCHEN");
        kitchenCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenCheckboxActionPerformed(evt);
            }
        });

        wMachineCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        wMachineCheckbox.setText("WASHING MACHINE");
        wMachineCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wMachineCheckboxActionPerformed(evt);
            }
        });

        teleCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        teleCheckbox.setText("TELEVISION");
        teleCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleCheckboxActionPerformed(evt);
            }
        });

        aBathroomCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        aBathroomCheckbox.setText("ATTACHED BATHROOM");
        aBathroomCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBathroomCheckboxActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("PRICE per month (fixed)");

        priceLabel.setForeground(new java.awt.Color(0, 153, 153));
        priceLabel.setText("600.00");

        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RM");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contract for each room is fixed to 3 months");

        capacityLabel.setForeground(new java.awt.Color(0, 153, 153));
        capacityLabel.setText("1 / 1");

        confirmBtn.setBackground(new java.awt.Color(204, 204, 255));
        confirmBtn.setForeground(new java.awt.Color(0, 0, 0));
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 153, 153));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(51, 51, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Add new room");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aircondCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kitchenCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wMachineCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teleCheckbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aBathroomCheckbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(roomTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(capacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(confirmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBtn)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(capacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aircondCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kitchenCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wMachineCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teleCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aBathroomCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel7)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn)
                    .addComponent(cancelBtn))
                .addGap(43, 43, 43))
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

    private void kitchenCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitchenCheckboxActionPerformed
        // TODO add your handling code here:
        if (kitchenCheckbox.isSelected()) {
            selectedFacilities.add(Facility.KITCHEN);
        } else {
            selectedFacilities.remove(Facility.KITCHEN);
        }
        System.out.println("facilities: " + selectedFacilities);
    }//GEN-LAST:event_kitchenCheckboxActionPerformed

    private void wMachineCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wMachineCheckboxActionPerformed
        // TODO add your handling code here:
        if (wMachineCheckbox.isSelected()) {
            selectedFacilities.add(Facility.WASHING_MACHINE);
        } else {
            selectedFacilities.remove(Facility.WASHING_MACHINE);
        }
        System.out.println("facilities: " + selectedFacilities);
    }//GEN-LAST:event_wMachineCheckboxActionPerformed

    private void teleCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleCheckboxActionPerformed
        // TODO add your handling code here:
        if (teleCheckbox.isSelected()) {
            selectedFacilities.add(Facility.TELEVISION);
        } else {
            selectedFacilities.remove(Facility.TELEVISION);
        }
        System.out.println("facilities: " + selectedFacilities);
    }//GEN-LAST:event_teleCheckboxActionPerformed

    private void aBathroomCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBathroomCheckboxActionPerformed
        // TODO add your handling code here:
        if (aBathroomCheckbox.isSelected()) {
            selectedFacilities.add(Facility.ATTACHED_BATHROOM);
        } else {
            selectedFacilities.remove(Facility.ATTACHED_BATHROOM);
        }
        System.out.println("facilities: " + selectedFacilities);
    }//GEN-LAST:event_aBathroomCheckboxActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        HostelRoomController hc = HostelRoomController.ActivateHostelRoomController();
        if (!isEdit) {
            // add new room
            HostelRoom newHostelRoom = null;
            int newID = hc.getNewID();
            switch ((String) roomTypeComboBox.getSelectedItem()) {
                case "SINGLE":
                    newHostelRoom = new SingleRoom(newID, true, 1, selectedFacilities);
                    break;
                case "TWIN":
                    newHostelRoom = new TwinRoom(newID, true, 2, selectedFacilities);
                    break;
                case "PREMIUM SINGLE":
                    newHostelRoom = new PremiumSingleRoom(newID, true, 1, selectedFacilities);
                    break;
                case "PREMIUM TWIN":
                    newHostelRoom = new PremiumTwinRoom(newID, true, 2, selectedFacilities);
                    break;
            }
            if (newHostelRoom == null) {
                JOptionPane.showMessageDialog(this, "Room is null somehow, ohno.", "Halo",
                        JOptionPane.WARNING_MESSAGE);
                this.dispose();
                return;
            }
            hc.add(newHostelRoom);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Room added successfully", "Halo",
                    JOptionPane.INFORMATION_MESSAGE);
            AdminRoomManagement.activateUI().resetRooms();

        } else {
            // edit current room
            switch (room.getClass().getSimpleName()) {
                case "SingleRoom" -> {
                    SingleRoom singleRoom = (SingleRoom) room;
                    singleRoom.setCapacity(singleRoom.getCapacity());
                    singleRoom.setFacilities(selectedFacilities);
                    hc.update(singleRoom);
                }
                case "TwinRoom" -> {
                    TwinRoom twinRoom = (TwinRoom) room;
                    twinRoom.setCapacity(twinRoom.getCapacity());
                    twinRoom.setFacilities(selectedFacilities);
                    hc.update(twinRoom);
                }
                case "PremiumSingleRoom" -> {
                    PremiumSingleRoom pmSingleRoom = (PremiumSingleRoom) room;
                    pmSingleRoom.setCapacity(pmSingleRoom.getCapacity());
                    pmSingleRoom.setFacilities(selectedFacilities);
                    hc.update(pmSingleRoom);
                }
                case "PremiumTwinRoom" -> {
                    PremiumTwinRoom pmTwinRoom = (PremiumTwinRoom) room;
                    pmTwinRoom.setCapacity(pmTwinRoom.getCapacity());
                    pmTwinRoom.setFacilities(selectedFacilities);
                    hc.update(pmTwinRoom);
                }
            }
            this.dispose();
            JOptionPane.showMessageDialog(this, "Room update successfully", "Halo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        AdminRoomManagement.activateUI().resetRooms();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null,
                "Are you sure you wanted to cancel?", "Hey hey hey",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        switch (res) {
            case 0:
                System.out.println("Pressed YES");
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                break;
            case 1:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void aircondCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aircondCheckboxActionPerformed
        // TODO add your handling code here:
        if (aircondCheckbox.isSelected()) {
            selectedFacilities.add(Facility.AIRCOND);
        } else {
            selectedFacilities.remove(Facility.AIRCOND);
        }
        System.out.println("facilities: " + selectedFacilities);
    }//GEN-LAST:event_aircondCheckboxActionPerformed

    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        // TODO add your handling code here:
        selectedFacilities.clear();
        if (!isEdit) {
            switch ((String) roomTypeComboBox.getSelectedItem()) {
                case "SINGLE" -> {
                    capacity = 1;
                    price = 800.00;
                }
                case "TWIN" -> {
                    capacity = 2;
                    price = 600.00;
                }
                case "PREMIUM SINGLE" -> {
                    capacity = 1;
                    price = 1200.00;
                }
                case "PREMIUM TWIN" -> {
                    capacity = 2;
                    price = 1000.00;
                }
            }

            aircondCheckbox.setSelected(false);
            kitchenCheckbox.setSelected(false);
            wMachineCheckbox.setSelected(false);
            teleCheckbox.setSelected(false);
            aBathroomCheckbox.setSelected(false);

            priceLabel.setText(Double.toString(price));
            capacityLabel.setText(capacity + " / " + capacity);

        } else {
//           priceLabel.setText();
        }
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRoomManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoomManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoomManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoomManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoomManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aBathroomCheckbox;
    private javax.swing.JCheckBox aircondCheckbox;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox kitchenCheckbox;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    private javax.swing.JCheckBox teleCheckbox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JCheckBox wMachineCheckbox;
    // End of variables declaration//GEN-END:variables
}
