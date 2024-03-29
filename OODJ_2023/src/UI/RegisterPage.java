/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Controller.StudentController;
import Model.Student;
import Student.Student_DataIO;
import javax.swing.*;
import oodj_2023.OODJ_2023;
import static oodj_2023.OODJ_2023.lp;

/**
 *
 * @author peterdash
 */
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();

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
        registerpage = new javax.swing.JPanel();
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
        cancelBtn = new javax.swing.JButton();
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

        jLabel7.setText("Student Register");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
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

        javax.swing.GroupLayout registerpageLayout = new javax.swing.GroupLayout(registerpage);
        registerpage.setLayout(registerpageLayout);
        registerpageLayout.setHorizontalGroup(
            registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerpageLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8)
                        .addComponent(jLabel5))
                    .addGroup(registerpageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)))
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerpageLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1))
                    .addGroup(registerpageLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(registerpageLayout.createSequentialGroup()
                                    .addComponent(male_rbtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(female_rbtn))
                                .addComponent(jLabel7)
                                .addComponent(uname_field)
                                .addComponent(pass_field, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(ic_tfield)
                                .addComponent(name_tfield)
                                .addComponent(address_tfield)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        registerpageLayout.setVerticalGroup(
            registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerpageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ic_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_tfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female_rbtn)
                    .addComponent(male_rbtn)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(registerpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelBtn))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            String student_ic = ic_tfield.getText();
            String student_name = name_tfield.getText();
            String student_address = address_tfield.getText();
            String student_gender = getGender();
            Double student_balance = 0.0;

            if (student_uname.isEmpty() || student_pass.isEmpty() || student_name.isEmpty()
                    || student_address.isEmpty() || student_gender.isEmpty()) {
                throw new Exception();
            } else {
                Student found = Student_DataIO.checkusername(student_uname);
                if (found == null) {
                    int newStudentID = StudentController.ActivateStudentController().getNewID();
                    Student_DataIO.stu.add(new Student(newStudentID, student_name, student_ic, student_address, student_gender, student_balance, student_uname, student_pass));
                    Student_DataIO.write();
                    JOptionPane.showMessageDialog(registerpage,
                            "You're registered!");
                    uname_field.setText("");
                    pass_field.setText("");
                    ic_tfield.setText("");
                    name_tfield.setText("");
                    address_tfield.setText("");
                    buttonGroup1.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(registerpage,
                            "username taken!");
                }
                lp.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(registerpage, "Please ensure that you have entered all your details correctly.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
        OODJ_2023.wp = new WelcomePage();
       OODJ_2023.wp.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

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
    private javax.swing.JButton cancelBtn;
    private javax.swing.JRadioButton female_rbtn;
    private javax.swing.JTextField ic_tfield;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel registerpage;
    private javax.swing.JTextField uname_field;
    // End of variables declaration//GEN-END:variables
}
