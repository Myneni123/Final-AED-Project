/*
 * AdminWorkAreaJPanel.java
 *
 * 
 */

package UI_Main.Distributors.ProvidersLists;

import UI_Main.Distributors.SupplierDirectory.*;
import Business.Clinicarea.PharmacyWork;
import UI_Main.HospitalArea.Clinic.*;
import Business_Frame.MainSystem;
import UI_Main.Hospital_class.*;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Clinical_Organization;
import Business.OrganizationFrame.Organization;
import Business.OrganizationFrame.Supplier_Org;
import Business.OrganizationFrame.Provider_Org;
import Business.SupplierArea.Supplier;
import Business.SupplierArea.Vaccine;
import Business.SupplierArea.Provider;
import Business.UserHaandle.UserHandle;
import Business.WorkLoad.PharmacyW_Request;
import Business.WorkLoad.SupplierW_Request;
import Business.WorkLoad.Work_Queue;
import Business.WorkLoad.Work_Request;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Validation.Validation;

/**
 *
 * @author admin
 */
public class ProviderWorkPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserHandle account; 
    Provider_Org organization; 
    Enterprise enterprise; 
    MainSystem business;
     //Supplier s;
     Provider provider;
    /** Creates new form AdminWorkAreaJPanel */
    public ProviderWorkPanel(JPanel userProcessContainer, UserHandle account, Provider_Org organization, Enterprise enterprise, MainSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
//        for (Supplier supplier : organization.getSupplierList().getSupplierList()) {
//            if(account.getEmployee().getName().equals(supplier.getSupplierName())){
//                s=supplier;
//                System.out.println("supplier name"+s.getSupplierName());
//            }
//        }
        //s=organization.getProvider();
        provider=organization.getProvider();
        System.out.println("busi"+business.getWorkQueue().getWorkRequestList().size());
        if(provider.getWorkQueue()== null){
        Work_Queue w= new Work_Queue();
        provider.setWorkQueue(w);
        }
        populateCombo();
        populateSupCombo();
        populateWorkQueueTable();
        populateWorkQueueTable2();
        populateQuantity();
        populateAvailable();
    }
     public void populateCombo(){
        for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
            comboxVaccine.addItem(vaccine);
        }
        
    }
     public void populateSupCombo(){
         for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization1 instanceof Supplier_Org){
                 Supplier_Org s= (Supplier_Org) organization1;
                 for (Supplier supplier : s.getSupplierList().getSupplierList()) {
                     comboxSupplier.addItem(supplier);
                 }
                 
             }
         }
     }
     
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) tblVaccineRequest.getModel();
        
        model.setRowCount(0);
        
        
        
        for (Work_Request work : business.getWorkQueue().getWorkRequestList()){
           if(work instanceof PharmacyW_Request){ 
            Object[] row = new Object[5];
            row[0] = work.getVaccine().getVaccineName();
            row[1] = ((PharmacyW_Request) work).getQuantity();
            row[2] = work;
            row[3] = work.getReceiver();
            row[4] = work.getSender();
            model.addRow(row);
           }
        }
    }
     public void populateWorkQueueTable2(){
         DefaultTableModel model = (DefaultTableModel) tblRequestSupplier.getModel();
        
        model.setRowCount(0);
        
        
        
        for (Work_Request work : provider.getWorkQueue().getWorkRequestList()){
           if(work instanceof SupplierW_Request){ 
            Object[] row = new Object[6];
            row[0] = work.getVaccine().getVaccineName();
            row[1] = ((SupplierW_Request) work).getQuantity();
            row[2] = work;
            row[3] = work.getReceiver();
            row[4] = work.getSender();
            row[5] = ((SupplierW_Request) work).getSupplier();
            model.addRow(row);
           }
        }
    }
     
     public void populateAvailable(){
         DefaultTableModel model = (DefaultTableModel) availableTable.getModel();
        
        model.setRowCount(0);
        
        for (Vaccine vaccine : provider.getVaccineList().getVaccineList()){
          
            Object[] row = new Object[2];
            row[0] = vaccine.getVaccineName();
            row[1] = vaccine.getQuantity();
            model.addRow(row);
           
        }
    }
     
      public void populateQuantity(){
         
         for ( Work_Request workRequest : provider.getWorkQueue().getWorkRequestList()) {
            // HashMap<WorkRequest,Integer> map = new HashMap<WorkRequest,Integer>();
             int temp=0;
             SupplierW_Request p= (SupplierW_Request) workRequest;
             if(workRequest.getStatus().equals("Complete") && !p.isAdd() ){ //&& add == false
                 Vaccine v = workRequest.getVaccine();
                
                 
                
                  for (Vaccine vaccine : provider.getVaccineList().getVaccineList()) {
                     if(v.getVaccineName().equals(vaccine.getVaccineName())){
                         temp=1;
                          vaccine.setQuantity(p.getQuantity()+vaccine.getQuantity());
                     }
                     
                 }
                  if(temp==0){
                       Vaccine vac= provider.getVaccineList().addVaccine();
                 vac.setDisease(v.getDisease());
                 vac.setVaccineName(v.getVaccineName());
                      vac.setQuantity(p.getQuantity());
                    //  organization.getP().getVaccine().getVaccineList().add(v);
                  }
                 p.setAdd(true);
                  
             }
           //  account.getWorkQueue().getWorkRequestList().remove(workRequest);
         }
        
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProvider = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        btnAssignProvider = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        lblVaccineRequest = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccineRequest = new javax.swing.JTable();
        comboxVaccine = new javax.swing.JComboBox();
        txtQuantity = new javax.swing.JTextField();
        lblVaccineProviderName = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnDeleteVaccineRequest = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRequestSupplier = new javax.swing.JTable();
        lblSupplier = new javax.swing.JLabel();
        btnRequestVaccine = new javax.swing.JButton();
        btnDeleteReq = new javax.swing.JButton();
        comboxSupplier = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProvider.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProvider.setText("Provider Work Area -Adminstrative Role");
        add(lblProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 20));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 140, -1));

        btnAssignProvider.setText("Assign To Me");
        btnAssignProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignProviderActionPerformed(evt);
            }
        });
        add(btnAssignProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, -1));

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 280, 400));

        lblVaccineRequest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblVaccineRequest.setText("Vaccines Requested from Pharma");
        add(lblVaccineRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Vaccines Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 170, 30));

        tblVaccineRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVaccineRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 500, 90));

        add(comboxVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 120, -1));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 100, -1));

        lblVaccineProviderName.setText("Vaccine Name:");
        add(lblVaccineProviderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 90, 20));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        btnDeleteVaccineRequest.setText("Delete request");
        btnDeleteVaccineRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVaccineRequestActionPerformed(evt);
            }
        });
        add(btnDeleteVaccineRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        tblRequestSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver", "Sender", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRequestSupplier);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 550, 90));

        lblSupplier.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSupplier.setText("Vaccines Requested to Supplier");
        add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, -1));

        btnRequestVaccine.setText("Request Vaccine");
        btnRequestVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestVaccineActionPerformed(evt);
            }
        });
        add(btnRequestVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 170, -1));

        btnDeleteReq.setText("Delete request");
        btnDeleteReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqActionPerformed(evt);
            }
        });
        add(btnDeleteReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        add(comboxSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
   int selectedRow= tblVaccineRequest.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyW_Request p=(PharmacyW_Request) tblVaccineRequest.getValueAt(selectedRow, 2);
           int temp=0;
        if(p.getReceiver()!= null){
         if (p.getStatus().equals("Pending")) {
         UserHandle a =p.getSender();
         if(provider.getVaccineList().getVaccineList().size()<= 0){
             JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier");
            return;
         }
        for (Vaccine v : provider.getVaccineList().getVaccineList()) {
        if(p.getVaccine().getVaccineName().equals(v.getVaccineName())){
            if(v.getQuantity()- p.getQuantity()<0){
                JOptionPane.showMessageDialog(null, "No enough Vaccines for supply. Wait for sometime");
            return;
            }
            temp=1;
            v.setQuantity(v.getQuantity()- p.getQuantity());
        break;
        }
       
    }
         if(temp==0){
            JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier.");
                       return; 
        }
        
         p.setStatus("Complete");
          JOptionPane.showMessageDialog(null, "You have successfully completed the request");
          populateAvailable();
          populateWorkQueueTable();
     } else {
                JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
            }
        }
        else{
        JOptionPane.showMessageDialog(null, "Please assign first");
        }
        
         }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnAssignProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignProviderActionPerformed
         int selectedRow= tblVaccineRequest.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyW_Request p=(PharmacyW_Request) tblVaccineRequest.getValueAt(selectedRow, 2);

         p.setStatus("Pending");
         p.setReceiver(account);
         
         populateWorkQueueTable();
       
         }
//        SupplierWorkRequest request= new SupplierWorkRequest();
//        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
//        request.setQuantity(Integer.parseInt(txtquant.getText()));
//        request.setStatus("Requested");
//        request.setSender(account);
//        //organization.getWorkQueue().getWorkRequestList().add(request);
//        s.getWorkQueue().getWorkRequestList().add(request);
//        populateWorkQueueTable();

    }//GEN-LAST:event_btnAssignProviderActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        new ProviderWorkPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteVaccineRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVaccineRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblVaccineRequest.getSelectedRow();
         if(selectedRow<0){
             JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        else{
             
         PharmacyW_Request p=(PharmacyW_Request) tblVaccineRequest.getValueAt(selectedRow, 2);

         business.getWorkQueue().getWorkRequestList().remove(p);
         
       //  business.getWorkQueue().getWorkRequestList().remove(p);
         
          JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
        populateWorkQueueTable();
         }
    }//GEN-LAST:event_btnDeleteVaccineRequestActionPerformed

    private void btnRequestVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestVaccineActionPerformed
 if(!txtQuantity.getText().equals("")){
        SupplierW_Request request= new SupplierW_Request();
        Supplier sup= (Supplier) comboxSupplier.getSelectedItem();
        request.setVaccine((Vaccine)comboxVaccine.getSelectedItem());
        request.setQuantity(Integer.parseInt(txtQuantity.getText()));
        request.setStatus("Requested");
        request.setSender(account);
        request.setSupplier(sup);
        sup.getWorkQueue().getWorkRequestList().add(request);
       // organization.getWorkQueue().getWorkRequestList().add(request);
        provider.getWorkQueue().getWorkRequestList().add(request);
        //account.getWorkQueue().getWorkRequestList().add(request);
       // business.getWorkQueue().getWorkRequestList().add(request);
        populateWorkQueueTable2();
}else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRequestVaccineActionPerformed

    private void btnDeleteReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequestSupplier.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Work_Request p=(Work_Request) tblRequestSupplier.getValueAt(selectedRow, 2);

            // s.getWorkQueue().getWorkRequestList().remove(p);
            provider.getWorkQueue().getWorkRequestList().remove(p);
            account.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable2();
        }
    }//GEN-LAST:event_btnDeleteReqActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        // TODO add your handling code here:
        Validation.onlyInteger(evt, txtQuantity);
    }//GEN-LAST:event_txtQuantityKeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton btnAssignProvider;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDeleteReq;
    private javax.swing.JButton btnDeleteVaccineRequest;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequestVaccine;
    private javax.swing.JComboBox comboxSupplier;
    private javax.swing.JComboBox comboxVaccine;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblProvider;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblVaccineProviderName;
    private javax.swing.JLabel lblVaccineRequest;
    private javax.swing.JTable tblRequestSupplier;
    private javax.swing.JTable tblVaccineRequest;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
