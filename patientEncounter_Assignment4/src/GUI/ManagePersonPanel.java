/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.PatientDirectory;
import Logic.PersonDirectory;
import Logic.PersonParentClass;
import Logic.VitalSignsPatient;
import Logic.VitalSignPatient;
import Logic.PatientExtendsPerson;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManagePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonPanel
     */
    PatientDirectory patients;
    PersonDirectory persons;
    VitalSignsPatient vitalSignsHistory;
    int onSpecificRow;
    
    public ManagePersonPanel(PersonDirectory persons, PatientDirectory patients, VitalSignsPatient vitalSignsHistory) {
        initComponents();
        this.patients = patients;
        this.persons = persons;
        this.vitalSignsHistory = vitalSignsHistory;
        populatePersonList();
        this.onSpecificRow = 0;         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAge = new javax.swing.JLabel();
        lblCreate = new javax.swing.JLabel();
        txtBpMin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayPerson = new javax.swing.JTable();
        lblBloodPressure = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        txtBpMax = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblMinimum = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblMaximum = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtMedicalRecordNo = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        lblMedicalRecordNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(600, 594));
        setPreferredSize(new java.awt.Dimension(600, 594));

        lblAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age:");

        lblCreate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Display Person and Update Blood Pressure");

        txtBpMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBpMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBpMinActionPerformed(evt);
            }
        });

        tblDisplayPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDisplayPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Medical Record No", "Age", "City", "Community", "House"
            }
        ));
        tblDisplayPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplayPerson);

        lblBloodPressure.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBloodPressure.setText("Blood Pressure:");

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd.setText("ADD ");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtAge.setEnabled(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtBpMax.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBpMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBpMaxActionPerformed(evt);
            }
        });

        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCity.setEnabled(false);
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblMinimum.setBackground(new java.awt.Color(153, 153, 153));
        lblMinimum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMinimum.setForeground(new java.awt.Color(153, 153, 153));
        lblMinimum.setText("Minimum");

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City:");

        lblMaximum.setBackground(new java.awt.Color(153, 153, 153));
        lblMaximum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMaximum.setForeground(new java.awt.Color(153, 153, 153));
        lblMaximum.setText("Maximum");

        txtCommunity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtCommunity.setEnabled(false);
        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        txtMedicalRecordNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMedicalRecordNo.setEnabled(false);
        txtMedicalRecordNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNoActionPerformed(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommunity.setText("Community:");

        lblMedicalRecordNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMedicalRecordNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicalRecordNo.setText("Medical Record No:");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        txtName.setAutoscrolls(false);
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtName.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(lblCreate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblCommunity)
                                                .addComponent(lblMedicalRecordNo)
                                                .addComponent(lblAge)
                                                .addComponent(lblCity))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtMedicalRecordNo)
                                                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtAge))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBloodPressure)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblMaximum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtBpMax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lblMinimum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtBpMin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreate)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNo)
                    .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBpMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBloodPressure))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaximum))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBpMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinimum)))
                .addGap(33, 33, 33)
                .addComponent(btnAdd)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBpMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBpMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBpMinActionPerformed

    private void tblDisplayPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayPersonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDisplayPerson.getModel();
        onSpecificRow = tblDisplayPerson.getSelectedRow();
        String personName = model.getValueAt(tblDisplayPerson.getSelectedRow(), 0).toString();
        String personMedRecordNo = model.getValueAt(tblDisplayPerson.getSelectedRow(), 1).toString();
        String personAge = model.getValueAt(tblDisplayPerson.getSelectedRow(), 2).toString();
        String personCity = model.getValueAt(tblDisplayPerson.getSelectedRow(), 3).toString();
        String personCommunity = model.getValueAt(tblDisplayPerson.getSelectedRow(), 4).toString();
        // String house = model.getValueAt(tblDisplayPerson.getSelectedRow(), 5).toString();

        txtName.setText(personName);
        txtMedicalRecordNo.setText(personMedRecordNo);
        txtAge.setText(personAge);
        txtCity.setText(personCity);
        txtCommunity.setText(personCommunity);
    }//GEN-LAST:event_tblDisplayPersonMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
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
         
        String name = txtName.getText();
        int medicalRecordNo = Integer.parseInt(txtMedicalRecordNo.getText());
        int age = Integer.parseInt(txtAge.getText());
        String community = txtCommunity.getText();
        String city = txtCity.getText();
        double bloodPressureMin = Double.parseDouble(txtBpMin.getText());
        double bloodPressureMax = Double.parseDouble(txtBpMax.getText());

        VitalSignPatient newVitals = vitalSignsHistory.addNewVitalSigns();

        PatientExtendsPerson newPatient = patients.getPatients().stream().filter(p -> p.getPersonMedRecNo()== medicalRecordNo).findFirst().orElse(null);
        if (newPatient == null){
            newPatient = patients.addNewPatient();
        }

        for (PatientExtendsPerson p: patients.getPatients()) {
            if (p.getPersonMedRecNo()== medicalRecordNo) {
                JOptionPane.showMessageDialog(this, "The patient is already registered as a patient!\nVital Signs has been registered again!");

                // Register the patient to vitalSigns as he/she visited to the hospital.
                Date encounter = new Date();

                newVitals.setNamePerson(name);
                newVitals.setMedRecNoPerson(medicalRecordNo);
                newVitals.setAgePerson(age);
                newVitals.setCommPerson(community);
                newVitals.setCityPerson(city);
                newVitals.setBloodPressureLow(bloodPressureMin);
                newVitals.setBloodPressureUpp(bloodPressureMax);
                newVitals.setReportedDatePerson(encounter);

                txtName.setText("");
                txtMedicalRecordNo.setText("");
                txtAge.setText("");
                txtCommunity.setText("");
                txtCity.setText("");
                txtBpMin.setText("");
                txtBpMax.setText("");
                break;
            }
            else {
                newPatient.setPersonName(name);
                newPatient.setPersonMedRecNo(medicalRecordNo);
                newPatient.setPersonAge(age);
                newPatient.setPersonCommunity(community);
                newPatient.setPersonCity(city);
                newPatient.setBloodPressurelow(bloodPressureMin);
                newPatient.setBloodPressureUpp(bloodPressureMax);

                // Register the visit to VitalSigns

                Date encounter = new Date();
                newVitals.setNamePerson(name);
                newVitals.setMedRecNoPerson(medicalRecordNo);
                newVitals.setAgePerson(age);
                newVitals.setCommPerson(community);
                newVitals.setCityPerson(city);
                newVitals.setBloodPressureLow(bloodPressureMin);
                newVitals.setBloodPressureUpp(bloodPressureMax);
                newVitals.setReportedDatePerson(encounter);

                txtName.setText("");
                txtMedicalRecordNo.setText("");
                txtAge.setText("");
                txtCommunity.setText("");
                txtCity.setText("");
                txtBpMin.setText("");
                txtBpMax.setText("");

                JOptionPane.showMessageDialog(this, "Patient has been registered!");
                break;
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtBpMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBpMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBpMaxActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtMedicalRecordNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNoActionPerformed

    private void populatePersonList() {
        DefaultTableModel model = (DefaultTableModel) tblDisplayPerson.getModel();
        model.setRowCount(0);
        for(PersonParentClass p: persons.getPersons()) {
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getPersonMedRecNo();
            row[2] = p.getPersonAge();
            row[3] = p.getPersonCity();
            row[4] = p.getPersonCommunity();
            row[5] = p.getPersonHouse();

            model.addRow(row);
        }   
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblMaximum;
    private javax.swing.JLabel lblMedicalRecordNo;
    private javax.swing.JLabel lblMinimum;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDisplayPerson;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBpMax;
    private javax.swing.JTextField txtBpMin;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtMedicalRecordNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
