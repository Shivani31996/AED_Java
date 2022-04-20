/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class SystemUpdateEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SystemUpdateEmployee
     */
    private JPanel userProcessContainerSUE;
    private Employee employeeSUE;
    private EcoSystem ecosystemSUE;
    private UserAccount userSUE;
    
    public SystemUpdateEmployee(JPanel userProcessContainer, Employee employee, EcoSystem system) {
        initComponents();
        this.userProcessContainerSUE = userProcessContainer;
        this.employeeSUE = employee;
        this.ecosystemSUE = system;
        this.userSUE = ecosystemSUE.getUserAccountDirectory().findEmployee(employee);
        txtUsernameSUE.setText(userSUE.getUsername());
        txtPasswordSUE.setText(userSUE.getPassword());
        txtRePasswordSUE.setText(userSUE.getPassword());
        txtNameSUE.setText(employee.getName());
        txtPhoneSUE.setText(employee.getPhone());
        txtAddressSUE.setText(employee.getAddress());
        if(this.userSUE.getRole().toString().equals("Business.Role.DeliverManRole"))
        {
            radioBtnDeliverySUE.setSelected(true);
        }
        else
        {
            radioBtnManagerSUE.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNameSUE = new javax.swing.JTextField();
        btnBackSUE = new javax.swing.JButton();
        txtPhoneSUE = new javax.swing.JTextField();
        txtUsernameSUE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPasswordSUE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRePasswordSUE = new javax.swing.JTextField();
        txtAddressSUE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radioBtnManagerSUE = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        radioBtnDeliverySUE = new javax.swing.JRadioButton();
        btnSubmitSUE = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Employees");

        jLabel4.setText("Name:");

        txtNameSUE.setEditable(false);

        btnBackSUE.setBackground(new java.awt.Color(255, 255, 255));
        btnBackSUE.setForeground(new java.awt.Color(0, 102, 102));
        btnBackSUE.setText("< Back");
        btnBackSUE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSUEActionPerformed(evt);
            }
        });

        txtUsernameSUE.setEditable(false);

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Address:");

        jLabel1.setText("Username: ");

        jLabel7.setText("Role:");

        jLabel2.setText("Password: ");

        buttonGroup1.add(radioBtnManagerSUE);
        radioBtnManagerSUE.setText("Restaurant Manager");
        radioBtnManagerSUE.setEnabled(false);

        jLabel3.setText("Confirm Password:");

        buttonGroup1.add(radioBtnDeliverySUE);
        radioBtnDeliverySUE.setText("Delivery Man");
        radioBtnDeliverySUE.setEnabled(false);

        btnSubmitSUE.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitSUE.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitSUE.setText("Submit");
        btnSubmitSUE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitSUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSUEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBackSUE)
                        .addGap(41, 41, 41)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhoneSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtNameSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddressSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSubmitSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioBtnManagerSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioBtnDeliverySUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRePasswordSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPasswordSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(txtUsernameSUE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBackSUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernameSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePasswordSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressSUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radioBtnManagerSUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnDeliverySUE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmitSUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSUEActionPerformed
        // TODO add your handling code here:
        userProcessContainerSUE.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSUE.getLayout();
        layout.previous(userProcessContainerSUE);
    }//GEN-LAST:event_btnBackSUEActionPerformed

    private void btnSubmitSUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSUEActionPerformed
        // TODO add your handling code here:
        if(validateThisSUE())
        {
            userSUE.setPassword(txtPasswordSUE.getText());
            employeeSUE.setAddress(txtAddressSUE.getText());
            employeeSUE.setPhone((txtPhoneSUE.getText()));
            JOptionPane.showMessageDialog(null, "Details for " + employeeSUE.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitSUEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSUE;
    private javax.swing.JButton btnSubmitSUE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radioBtnDeliverySUE;
    private javax.swing.JRadioButton radioBtnManagerSUE;
    private javax.swing.JTextField txtAddressSUE;
    private javax.swing.JTextField txtNameSUE;
    private javax.swing.JTextField txtPasswordSUE;
    private javax.swing.JTextField txtPhoneSUE;
    private javax.swing.JTextField txtRePasswordSUE;
    private javax.swing.JTextField txtUsernameSUE;
    // End of variables declaration//GEN-END:variables

    private boolean validateThisSUE() {
        String regex = "\\d{10}";
        if(("".equals(txtPasswordSUE.getText())) || ("".equals(txtRePasswordSUE.getText())) 
                || ("".equals(txtPhoneSUE.getText())) || ("".equals(txtAddressSUE.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPasswordSUE.getText().equals(txtRePasswordSUE.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneSUE.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Phone number must have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}