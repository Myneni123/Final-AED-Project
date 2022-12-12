/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.AdministrativeWorkArea;



import Business.C2D.Disease;
import Business_Frame.MainSystem;
import Business.SupplierArea.Vaccine;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Validation.Validation;

/**
 *
 * @author admin
 */
public class VaccineDirectoryPanel extends javax.swing.JPanel {

    
   private JPanel userProcessContainer;
   private MainSystem businesses;
 
    public VaccineDirectoryPanel(JPanel userProcessContainer, MainSystem businesses){
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.businesses=businesses;
       
        populateVaccineTable();
        populatecombo();
    }
    public void populateVaccineTable(){
         DefaultTableModel dtm= (DefaultTableModel) tblVaccineID.getModel();
       dtm.setRowCount(0);
       for (Vaccine vaccine : businesses.getVaccineList().getVaccineList()) {
        
           Object[] row = new Object[2];
           row[0]= vaccine;
           row[1]=vaccine.getVaccineId();
           dtm.addRow(row);
       }  
       }
    
    public void populatecombo(){
        for (Disease disease : businesses.getDiseaseList().getDiseaseList()) {
            comboxDisease.addItem(disease);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineID = new javax.swing.JTable();
        btnCreateVaccine = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblwelcome = new javax.swing.JLabel();
        btnDeletevaccine = new javax.swing.JButton();
        lblCreateVaccine = new javax.swing.JLabel();
        tfieldVaccineName = new javax.swing.JTextField();
        lblVaccineDirectory = new javax.swing.JLabel();
        comboxDisease = new javax.swing.JComboBox();
        lblDiseaseName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVaccineID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVaccineID);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 590, 170));

        btnCreateVaccine.setText("Create New Vaccine");
        btnCreateVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVaccineActionPerformed(evt);
            }
        });
        add(btnCreateVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 150, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblwelcome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(lblwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 240, 20));

        btnDeletevaccine.setText("Delete Vaccine");
        btnDeletevaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletevaccineActionPerformed(evt);
            }
        });
        add(btnDeletevaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 180, -1));

        lblCreateVaccine.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCreateVaccine.setText("Create Vaccine ");
        add(lblCreateVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, 30));

        tfieldVaccineName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldVaccineNameKeyPressed(evt);
            }
        });
        add(tfieldVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 120, -1));

        lblVaccineDirectory.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblVaccineDirectory.setText("Manage Vaccines");
        add(lblVaccineDirectory, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 200, 30));

        add(comboxDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 120, -1));

        lblDiseaseName.setText("Disease: ");
        add(lblDiseaseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aed1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 310, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVaccineActionPerformed
        // TODO add your handling code here:
        if(!tfieldVaccineName.getText().equals("")){
        Vaccine v= businesses.getVaccineList().addVaccine();
        v.setVaccineName(tfieldVaccineName.getText());
        v.setDisease((Disease) comboxDisease.getSelectedItem());
        populateVaccineTable();
        }else{
             JOptionPane.showMessageDialog(null, "Enter a valid entry", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCreateVaccineActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeletevaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletevaccineActionPerformed
        // TODO add your handling code here:
          int selectedRow= tblVaccineID.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select atleast one row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         Vaccine p=(Vaccine) tblVaccineID.getValueAt(selectedRow, 0);

         businesses.getVaccineList().removeVaccine(p);
         
          JOptionPane.showMessageDialog(null, "Account deletion successful");
        populateVaccineTable();
         }
         
    }//GEN-LAST:event_btnDeletevaccineActionPerformed

    private void tfieldVaccineNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldVaccineNameKeyPressed
        // TODO add your handling code here:
        Validation.onlyString(evt, tfieldVaccineName);
    }//GEN-LAST:event_tfieldVaccineNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateVaccine;
    private javax.swing.JButton btnDeletevaccine;
    private javax.swing.JComboBox comboxDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateVaccine;
    private javax.swing.JLabel lblDiseaseName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblVaccineDirectory;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTable tblVaccineID;
    private javax.swing.JTextField tfieldVaccineName;
    // End of variables declaration//GEN-END:variables
}
