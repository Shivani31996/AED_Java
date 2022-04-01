/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Logic.PersonDirectory;
import javax.swing.JOptionPane;
import Logic.PersonParentClass;

/**
 *
 * @author Dell
 */
public class CreatePersonDetails extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonDetails
     */
    PersonDirectory persons;
    PersonParentClass newPerson; 
    public CreatePersonDetails(PersonDirectory persons) {
        initComponents();
        this.persons = persons;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCommunity = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtMedicalRecordNo = new javax.swing.JTextField();
        lblCreate = new javax.swing.JLabel();
        lblMedicalRecordNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblHouse = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(610, 379));
        setMinimumSize(new java.awt.Dimension(610, 379));
        setPreferredSize(new java.awt.Dimension(610, 379));

        lblCommunity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommunity.setText("Community:");

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtMedicalRecordNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMedicalRecordNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMedicalRecordNoFocusLost(evt);
            }
        });
        txtMedicalRecordNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNoActionPerformed(evt);
            }
        });

        lblCreate.setBackground(new java.awt.Color(153, 153, 0));
        lblCreate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Person Registration");

        lblMedicalRecordNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMedicalRecordNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicalRecordNo.setText("Medical Record No:");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        txtHouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtHouse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHouseFocusLost(evt);
            }
        });
        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        txtName.setAutoscrolls(false);
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        lblHouse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHouse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHouse.setText("House:");

        lblAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age:");

        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City:");

        txtCommunity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCommunity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCommunityFocusLost(evt);
            }
        });
        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMedicalRecordNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHouse)
                        .addGap(78, 78, 78)
                        .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity)
                        .addGap(52, 52, 52)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(82, 82, 82)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAge)
                                .addComponent(lblCity))
                            .addGap(90, 90, 90)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCreate)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNo)
                    .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
 
        String namePerson = txtName.getText();
        if(namePerson == null || namePerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter a Name!");
                return;
            }
        
        String agePerson = txtAge.getText();
        if(agePerson == null || agePerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Age field cannot be empty!");
                return;
            }
         try {
            Integer.parseInt(txtAge.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Only digits accepted in age field!", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
            
        } 
        
        String cityPerson = txtCity.getText();
        if(cityPerson == null || cityPerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter your city!");
                return;
            }   
 
        String commPerson = txtCommunity.getText();
        if(commPerson == null || commPerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter your community!");
                return;
            }         

        String housePerson = txtHouse.getText();
        if(housePerson == null || housePerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter your House number!");
                return;
            }  

        String medRecPerson = txtMedicalRecordNo.getText();
        if(medRecPerson == null || medRecPerson.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter your medical record number!");
                return;
            } 
         try {
            Integer.parseInt(txtMedicalRecordNo.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Only digits accepted in Medical record field!", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
            
        }      

         String serNumCreate = txtMedicalRecordNo.getText();
         
        if (serNumCreate == null || serNumCreate.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Serial number field cannot be empty", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        else
        {
            for(PersonParentClass p: persons.getPersons())
            {
                if(p.getPersonMedRecNo()== Integer.parseInt((txtMedicalRecordNo.getText())))
                {
                    JOptionPane.showMessageDialog(null, "Entered medical record number already exists!");
                    txtMedicalRecordNo.setText(" ");
                }
            }
         try {
            Integer.parseInt(txtMedicalRecordNo.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid input", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        }         
        
            newPerson = persons.addNewPerson();
            newPerson.setPersonName(txtName.getText());
            newPerson.setPersonAge(Integer.parseInt(txtAge.getText()));
            newPerson.setPersonCity(txtCity.getText());
            newPerson.setPersonCommunity(txtCommunity.getText());
            newPerson.setPersonHouse(txtHouse.getText());
            newPerson.setPersonMedRecNo(Integer.parseInt(txtMedicalRecordNo.getText()));

            txtName.setText("");
            txtAge.setText("");
            txtCity.setText("");
            txtCommunity.setText("");
            txtMedicalRecordNo.setText("");
            txtHouse.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtMedicalRecordNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMedicalRecordNoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNoFocusLost

    private void txtMedicalRecordNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNoActionPerformed

    private void txtHouseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHouseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseFocusLost

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusLost

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityFocusLost

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCommunityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCommunityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityFocusLost

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblMedicalRecordNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtMedicalRecordNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}