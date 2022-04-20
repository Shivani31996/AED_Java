/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class SystemAdminUpdateCustomer extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminUpdateCustomer
     */
    private JPanel userProcessContainerSAUC;
    private EcoSystem ecosystemSAUC;
    private Customer customerSAUC;
    
    public SystemAdminUpdateCustomer(JPanel userProcessContainer, Customer customer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAUC = userProcessContainer;
        this.customerSAUC = customer;
        this.ecosystemSAUC = ecosystem;;
        txtNameSAUC.setText(customer.getName());
        txtPhoneSAUC.setText(customer.getPhone());
        txtAddressSAUC.setText(customer.getAddress());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackSAUC = new javax.swing.JButton();
        btnSubmitSAUC = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNameSAUC = new javax.swing.JTextField();
        txtPhoneSAUC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddressSAUC = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        btnBackSAUC.setBackground(new java.awt.Color(255, 255, 255));
        btnBackSAUC.setForeground(new java.awt.Color(0, 102, 102));
        btnBackSAUC.setText("< Back");
        btnBackSAUC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSAUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSAUCActionPerformed(evt);
            }
        });

        btnSubmitSAUC.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitSAUC.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitSAUC.setText("Submit");
        btnSubmitSAUC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitSAUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSAUCActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Customer");

        jLabel4.setText("Name:");

        txtNameSAUC.setEditable(false);

        jLabel5.setText("Phone Number:");

        jLabel6.setText("Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBackSAUC)
                .addGap(34, 34, 34)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtNameSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmitSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddressSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackSAUC)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnSubmitSAUC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSAUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSAUCActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAUC.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSAUC.getLayout();
        layout.previous(userProcessContainerSAUC);
    }//GEN-LAST:event_btnBackSAUCActionPerformed

    private void btnSubmitSAUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSAUCActionPerformed
        // TODO add your handling code here:
        if(validateThisSAUC())
        {
            customerSAUC.setAddress(txtAddressSAUC.getText());
            customerSAUC.setPhone(txtPhoneSAUC.getText());
            JOptionPane.showMessageDialog(null, "Details for " + customerSAUC.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitSAUCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSAUC;
    private javax.swing.JButton btnSubmitSAUC;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddressSAUC;
    private javax.swing.JTextField txtNameSAUC;
    private javax.swing.JTextField txtPhoneSAUC;
    // End of variables declaration//GEN-END:variables

    private boolean validateThisSAUC() {
        String regex = "\\d{10}";
        if(("".equals(txtPhoneSAUC.getText())) || ("".equals(txtAddressSAUC.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneSAUC.getText().matches(regex)))
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