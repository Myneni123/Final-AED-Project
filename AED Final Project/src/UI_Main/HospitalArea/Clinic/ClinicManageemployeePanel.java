/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.HospitalArea.Clinic;

import Business.EcoSystem;
import userinterface.Hospital.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import utility.Validator;

/**
 *
 * @author raunak
 */
public class ClinicManageemployeePanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account; 
    ClinicOrganization organization; 
    Enterprise enterprise; 
    EcoSystem business;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ClinicManageemployeePanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        populateTable(organization);
      //  populateOrganizationComboBox();
       // populateOrganizationEmpComboBox();
    }
    
//    public void populateOrganizationComboBox(){
//        organizationJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationJComboBox.addItem(role);
//        }
//    }
    
//    public void populateOrganizationEmpComboBox(){
//        organizationEmpJComboBox.removeAllItems();
//        
//        for (Role role : organization.getSupportedRole()){
//            organizationEmpJComboBox.addItem(role);
//        }
//    }

    private void populateTable(ClinicOrganization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 63, 480, 92));

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 315, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 315, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, -1));

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyPressed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 126, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("View Employee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Create Employee");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
         if(!nameJTextField.getText().equals("")){
        //ClinicOrganization organization = (ClinicOrganization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        }else{
             JOptionPane.showMessageDialog(null, "Enter value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void nameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyPressed
        // TODO add your handling code here:
        Validator.onlyString(evt, nameJTextField);
    }//GEN-LAST:event_nameJTextFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
