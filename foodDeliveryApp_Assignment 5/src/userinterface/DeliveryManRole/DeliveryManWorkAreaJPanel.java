/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Orders.Order;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Restaurant restaurant;
    private DeliveryMan deliveryMan;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        
        for(Restaurant r : business.getRestaurantDirectory().getRestaurantList())
        {
            if(r.findDeliveryMan(account.getEmployee().getName()) != null)
            {
                this.deliveryMan = r.findDeliveryMan(account.getEmployee().getName());
                this.restaurant = r;
                break;
            }
        }
        lblDeliveryMan.setText("Orders to be delivered by " + this.deliveryMan);
        
//        if(workRequestJTable.getRowCount() > 0)
//        {
            populateTable();
//        }
    }
    
    public void populateTable(){
        if(restaurant.getOrderDirectory() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            for(Order o : restaurant.getOrderDirectory().getOrderList())
            {
                if(o.getDeliveryMan().equals(deliveryMan))
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = o;
                    row[1] = o.getTotalAmount();
                    row[2] = o.getMessage();
                    row[3] = o.getDeliveryMan();
                    if(o.isStatus())
                    {
                        row[4] = "Yes";
                    }
                    else
                    {
                        row[4] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[5] = o.getOrderDate().format(formatter);
                    dtm.addRow(row);
                }
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

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        lblDeliveryMan = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setForeground(new java.awt.Color(0, 102, 102));
        processJButton.setText("Process");
        processJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 110, 50));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setForeground(new java.awt.Color(0, 102, 102));
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 90, 30));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Price", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 910, 100));

        lblDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblDeliveryMan.setText("<>");
        add(lblDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            if((workRequestJTable.getValueAt(selectedRow, 1)) == null)
            {
                JOptionPane.showMessageDialog(null,"Order is not live anymore!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                Order o = (Order) workRequestJTable.getValueAt(selectedRow, 0);
                ProcessWorkRequestJPanel fs = new ProcessWorkRequestJPanel(userProcessContainer, o);
                userProcessContainer.add("SysAdminManageEmployees", fs);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliveryMan;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
