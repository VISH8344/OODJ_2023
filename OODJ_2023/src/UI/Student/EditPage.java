/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Student;

import Model.Student;
import Student.Student_DataIO;
import javax.swing.*;
import oodj_2023.OODJ_2023;
import static oodj_2023.OODJ_2023.lp;

/**
 *
 * @author peterdash
 */
public class EditPage extends javax.swing.JFrame {

    public EditPage() {
        initComponents();
        getData();
    }

    public String getGender() {
        if (male_rbtn.isSelected()) {
            return "Male";

        } else if (female_rbtn.isSelected()) {
            return "Female";

        } else {
            return null;
        }
    }

    private void showGender() {
        if ("Male".equals(OODJ_2023.student.getGender())) {
            male_rbtn.setSelected(true);

        } else {
            female_rbtn.setSelected(true);
        }
    }

    private void getData() {
        uname_field.setText(OODJ_2023.student.getUsername());
        uname_field.setEditable(false);
        name_tfield.setText(OODJ_2023.student.getName());
        ic_tfield.setText(Integer.toString(OODJ_2023.student.getNIC()));
        pass_field.setText(OODJ_2023.student.getPassword());
        address_tfield.setText(OODJ_2023.student.getAddress());
        showGender();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        editpage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        male_rbtn = new javax.swing.JRadioButton();
        female_rbtn = new javax.swing.JRadioButton();
        pass_field = new javax.swing.JPasswordField();
        uname_field = new javax.swing.JTextField();
        ic_tfield = new javax.swing.JTextField();
        name_tfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        address_tfield = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        jToggleButton1.setText("jToggleButton1");

        jLabel6.setText("balance");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("username :");

        jLabel2.setText("password :");

        jLabel3.setText("IC :");

        jLabel4.setText("name :");

        jLabel5.setText("gender :");

        buttonGroup1.add(male_rbtn);
        male_rbtn.setText("Male");
        male_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rbtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(female_rbtn);
        female_rbtn.setText("Female");
        female_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_rbtnActionPerformed(evt);
            }
        });

        uname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname_fieldActionPerformed(evt);
            }
        });

        name_tfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Student Edit Profile");

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("address :");

        address_tfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_tfieldActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editpageLayout = new javax.swing.GroupLayout(editpage);
        editpage.setLayout(editpageLayout);
        editpageLayout.setHorizontalGroup(
            editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editpageLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(editpageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editpageLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)))
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editpageLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1))
                    .addGroup(editpageLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(uname_field)
                                .addComponent(pass_field, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(ic_tfield)
                                .addComponent(name_tfield)
                                .addComponent(address_tfield)
                                .addGroup(editpageLayout.createSequentialGroup()
                                    .addComponent(male_rbtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(female_rbtn))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        editpageLayout.setVerticalGroup(
            editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editpageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ic_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(male_rbtn)
                    .addComponent(female_rbtn))
                .addGap(25, 25, 25)
                .addGroup(editpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(502, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void female_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_rbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_rbtnActionPerformed

    private void uname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname_fieldActionPerformed

    private void name_tfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String student_uname = uname_field.getText();
            String student_pass = pass_field.getText();
            int student_ic = Integer.parseInt(ic_tfield.getText());
            String student_name = name_tfield.getText();
            String student_address = address_tfield.getText();
            String student_gender = getGender();

            if (student_uname.isEmpty() || student_pass.isEmpty() || student_name.isEmpty()
                    || student_address.isEmpty() || student_gender.isEmpty()) {
                throw new Exception();
            } else {
                Student found = Student_DataIO.checkusername(student_uname);
                if (found != null) {

                    OODJ_2023.student.setPassword(student_pass);
                    OODJ_2023.student.setName(student_name);
                    OODJ_2023.student.setNIC(student_ic);
                    OODJ_2023.student.setAddress(student_address);
                    OODJ_2023.student.setGender(student_gender);

                    Student_DataIO.write();
                    JOptionPane.showMessageDialog(editpage,
                            "Profile Edit successfully!");
                    MainPage mp = new MainPage();
                    mp.setVisible(true);
                    this.setVisible(false);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(editpage, "Please ensure that you have entered all your details correctly.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void male_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_rbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male_rbtnActionPerformed

    private void address_tfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_tfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tfieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            pass_field.setEchoChar((char) 0);
        } else {
            pass_field.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel editpage;
    private javax.swing.JRadioButton female_rbtn;
    private javax.swing.JTextField ic_tfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton male_rbtn;
    private javax.swing.JTextField name_tfield;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JTextField uname_field;
    // End of variables declaration//GEN-END:variables
}