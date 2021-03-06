/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import cprofile.ClassProfile;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author Dell
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    ClassProfile CP;
    
    public ViewJPanel(ClassProfile CP) throws IOException {
        initComponents();
        this.CP = CP; 
        displayProduct();
    }
    
    private void displayProduct() throws IOException {
        
        txtName.setText(CP.getName());
        txtAddress.setText(CP.getGeodata());
        if(CP.getBirthdate() != null)
        {
            SimpleDateFormat dateOnlySC = new SimpleDateFormat("MM/dd/yyyy");
            txtDOB.setText(dateOnlySC.format(CP.getBirthdate()).toString());
        }
        txtTelNo.setText(Long.toString(CP.getTelnum()));
        txtEmail.setText(CP.getEmail());
        txtBankAcc.setText(Integer.toString(CP.getBankaccnum()));
        txtMedRecNo.setText(Integer.toString(CP.getMedrecnum()));
        txtVehNo.setText(Integer.toString(CP.getVehserialnum()));
        txtLinkedin.setText(CP.getLinkedin());        
        txtFaxNo.setText(Integer.toString(CP.getFax()));
        txtSSN.setText(CP.getSsn());
        txtVehNo.setText(Integer.toString(CP.getVehserialnum()));
        txtHBenNo.setText(Integer.toString(CP.getHelplan()));
        txtLicenseNo.setText(Integer.toString(CP.getLicensenum()));
        txtDevNo.setText(Integer.toString(CP.getDevserialnum()));
        txtIP.setText(CP.getIPadd());
        
        BufferedImage mypictureSC;
        
        if(CP.getImage() == null)
        {
            ;
        }
        
        else 
        {
            mypictureSC = ImageIO.read(CP.getImage());
            lblImage.setIcon(new ImageIcon(mypictureSC.getScaledInstance(105, 105, java.awt.Image.SCALE_SMOOTH)));
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

        lblDOB = new javax.swing.JLabel();
        lblTelNo = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        lblFaxNo = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblMedRecNo = new javax.swing.JLabel();
        txtMedRecNo = new javax.swing.JTextField();
        lblHealthBenNo = new javax.swing.JLabel();
        lblBankAcc = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblLicense = new javax.swing.JLabel();
        txtHBenNo = new javax.swing.JTextField();
        txtBankAcc = new javax.swing.JTextField();
        txtLicenseNo = new javax.swing.JTextField();
        lblVehNo = new javax.swing.JLabel();
        txtVehNo = new javax.swing.JTextField();
        lblDevNo = new javax.swing.JLabel();
        txtDevNo = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        lblIPAddress = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 640));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setPreferredSize(new java.awt.Dimension(800, 640));

        lblDOB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDOB.setText("DOB");

        lblTelNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTelNo.setText("Tel. No");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        lblFaxNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFaxNo.setText("Fax. No");

        txtFaxNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNoActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblSSN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSSN.setText("SSN");

        lblMedRecNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMedRecNo.setText("Med. rec. no.");

        txtMedRecNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedRecNoActionPerformed(evt);
            }
        });

        lblHealthBenNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblHealthBenNo.setText("HBen. no.");

        lblBankAcc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBankAcc.setText("Bank Acc no.");

        lblTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Display Class Profile");

        lblLicense.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLicense.setText("License no:");

        lblVehNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVehNo.setText("Veh. no:");

        lblDevNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDevNo.setText("Dev no.");

        lblLinkedin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLinkedin.setText("LinkedIn");

        lblIPAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIPAddress.setText("IP address");

        lblPhoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPhoto.setText("Photo -");

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblName.setText("Name -");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAddress.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblPhoto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblTelNo)
                            .addComponent(lblEmail)
                            .addComponent(lblSSN))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBankAcc)
                        .addGap(18, 18, 18)
                        .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLicense)
                                .addComponent(lblDevNo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDevNo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblIPAddress)
                            .addGap(32, 32, 32)
                            .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedRecNo)
                            .addComponent(lblVehNo)
                            .addComponent(lblLinkedin)
                            .addComponent(lblFaxNo)
                            .addComponent(lblHealthBenNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLinkedin)
                            .addComponent(txtVehNo)
                            .addComponent(txtMedRecNo))))
                .addGap(0, 193, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtBankAcc, txtDOB, txtDevNo, txtEmail, txtFaxNo, txtHBenNo, txtIP, txtLicenseNo, txtLinkedin, txtMedRecNo, txtName, txtSSN, txtTelNo, txtVehNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblPhoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLicense))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDevNo)
                                    .addComponent(txtDevNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIPAddress)))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedRecNo)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehNo)
                    .addComponent(txtVehNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxNo)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHBenNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAcc)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtBankAcc, txtDOB, txtDevNo, txtEmail, txtFaxNo, txtHBenNo, txtIP, txtLicenseNo, txtLinkedin, txtMedRecNo, txtName, txtSSN, txtTelNo, txtVehNo});

    }// </editor-fold>//GEN-END:initComponents

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtFaxNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMedRecNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedRecNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedRecNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDevNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblHealthBenNo;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedRecNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehNo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtHBenNo;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLicenseNo;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedRecNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtVehNo;
    // End of variables declaration//GEN-END:variables

}
