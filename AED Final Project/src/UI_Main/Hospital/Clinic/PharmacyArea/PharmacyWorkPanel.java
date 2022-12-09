/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UI_Main.Hospital.Clinic.PharmacyArea;

import Business.Clinicarea.PharmacyWork;
import UI_Main.HospitalArea.Clinic.*;
import Business_Frame.MainSystem;
import Business.EmployeeArea.Employeeclass;
import UI_Main.Hospital_class.*;
import Business.EnterpriseFrame.Enterprise;
import Business.NetworkArea.NetworkArea;
import Business.OrganizationFrame.Clinical_Organization;
import Business.OrganizationFrame.Organization;
import Business.SupplierArea.Vaccine;
import Business.UserHaandle.UserHandle;
import Business.WorkLoad.PharmacyW_Request;
import Business.WorkLoad.Work_Request;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Validation.Validation;

/**
 *
 * @author  raunak
 */
public class PharmacyWorkPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserHandle account; 
    Clinical_Organization organization; 
    Enterprise enterprise; 
    MainSystem business;
    
    /** Creates new form AdminWorkAreaJPanel */
    public PharmacyWorkPanel(JPanel userProcessContainer, UserHandle account, Clinical_Organization organization, Enterprise enterprise, MainSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        populateCombo();
        populateQuantity();
       populateWorkQueueTable();
       populateAvailable();
       
    }
    
    public void populateCombo(){
        for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
            comboVaccine.addItem(vaccine);
        }
        
    }
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        
        model.setRowCount(0);
        
        for (Work_Request work : organization.getWorkQueue().getWorkRequestList()){
           if(work instanceof PharmacyW_Request){ 
            Object[] row = new Object[4];
            row[0] = work.getVaccine().getVaccineName();
            row[1] = ((PharmacyW_Request) work).getQuantity();
            row[2] = work;
            row[3] = work.getReceiver();
            model.addRow(row);
           }
        }
    }
     public void populateAvailable(){
         DefaultTableModel model = (DefaultTableModel) availableTable.getModel();
        
        model.setRowCount(0);
        PharmacyWork p= organization.getP();
         System.out.println("pharmacy"+ p.getVaccine().getVaccineList().size());
        for (Vaccine vaccine : p.getVaccine().getVaccineList()){
          
            Object[] row = new Object[2];
            row[0] = vaccine.getVaccineName();
            row[1] = vaccine.getQuantity();
            model.addRow(row);
           
        }
    }
     public void populateQuantity(){
         
         for ( Work_Request workRequest : account.getWorkQueue().getWorkRequestList()) {
            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
             int temp=0;
             PharmacyW_Request p= (PharmacyW_Request) workRequest;
             if(workRequest.getStatus().equals("Complete") && !p.isAdd() ){ //&& add == false
                 Vaccine v = workRequest.getVaccine();
                
                  for (Vaccine vaccine : organization.getP().getVaccine().getVaccineList()) {
                     if(v.getVaccineName().equals(vaccine.getVaccineName())){
                         temp=1;
                          vaccine.setQuantity(p.getQuantity()+vaccine.getQuantity());
                     }
                     
                 }
                  if(temp==0){
                       Vaccine vac= organization.getP().getVaccine().addVaccine();
                       vac.setDisease(v.getDisease());
                       vac.setVaccineName(v.getVaccineName());
                       vac.setQuantity(p.getQuantity());
                   }
                 p.setAdd(true); 
             }
         }
        
     }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        comboVaccine = new javax.swing.JComboBox();
        txtquant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacy Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        reqBtn.setText("Request Vaccine");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 170, -1));

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Vaccines Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Vaccines Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 30));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 90));

        add(comboVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, -1));

        txtquant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtquantKeyPressed(evt);
            }
        });
        add(txtquant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 100, -1));

        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 20));

        backJButton.setText("Refresh");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
         if(!txtquant.getText().equals("")){
        PharmacyW_Request request= new PharmacyW_Request();
        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
        request.setQuantity(Integer.parseInt(txtquant.getText()));
        request.setStatus("Requested");
        request.setSender(account);
        organization.getWorkQueue().getWorkRequestList().add(request);
        account.getWorkQueue().getWorkRequestList().add(request);
        business.getWorkQueue().getWorkRequestList().add(request);
        populateWorkQueueTable();
        }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_reqBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        new PharmacyWorkPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow= requestTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Work_Request p=(Work_Request) requestTable.getValueAt(selectedRow, 2);

           // s.getWorkQueue().getWorkRequestList().remove(p);
            organization.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtquantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantKeyPressed
        // TODO add your handling code here:
        Validation.onlyInteger(evt, txtquant);
    }//GEN-LAST:event_txtquantKeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField txtquant;
    // End of variables declaration//GEN-END:variables
    
}
