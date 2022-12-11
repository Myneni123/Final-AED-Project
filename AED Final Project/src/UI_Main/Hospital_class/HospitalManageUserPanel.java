/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.Hospital_class;

import Business_Frame.MainSystem;
import UI_Main.AdministrativeWorkArea.*;
import Business.EmployeeArea.Employeeclass;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Organization;
import Business.Role.Roles;
import Business.UserHaandle.UserHandle;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class HospitalManageUserPanel extends javax.swing.JPanel {

    /**
     * Creates new setup ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;

    public HospitalManageUserPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        UserorgJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            UserorgJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        UserempJComboBox.removeAllItems();
        
        for (Employeeclass employee : organization.getEmployeeDirectory().getEmployeeList()){
            UserempJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Enterprise e){
        UserRoleJComboBox.removeAllItems();
        for (Roles role : e.getSupportedRole()){
            UserRoleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) HospitalManageuserJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserHandle ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) HospitalManageuserJTable.getModel()).addRow(row);
            }
        }
    }

    /**
     * To initialize the form,the method is invoked within the constructor.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HospitalcreateUserJButton = new javax.swing.JButton();
        hsopitalManagenameJTextField = new javax.swing.JTextField();
        lblHospitalMangeUsername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalManageuserJTable = new javax.swing.JTable();
        lblHospitalManagePassword = new javax.swing.JLabel();
        HospitalUserpasswordJTextField = new javax.swing.JTextField();
        lblHospitalUserEmp = new javax.swing.JLabel();
        UserempJComboBox = new javax.swing.JComboBox();
        HospitalUserbackjButton1 = new javax.swing.JButton();
        lblHospitalManageOrg = new javax.swing.JLabel();
        UserorgJComboBox = new javax.swing.JComboBox();
        lblUserRole = new javax.swing.JLabel();
        UserRoleJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HospitalcreateUserJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HospitalcreateUserJButton.setText("Create");
        HospitalcreateUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalcreateUserJButtonActionPerformed(evt);
            }
        });
        add(HospitalcreateUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));
        add(hsopitalManagenameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 146, -1));

        lblHospitalMangeUsername.setText("User Name");
        add(lblHospitalMangeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        HospitalManageuserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HospitalManageuserJTable);
        if (HospitalManageuserJTable.getColumnModel().getColumnCount() > 0) {
            HospitalManageuserJTable.getColumnModel().getColumn(0).setResizable(false);
            HospitalManageuserJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 375, 179));

        lblHospitalManagePassword.setText("Password");
        add(lblHospitalManagePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));
        add(HospitalUserpasswordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 146, -1));

        lblHospitalUserEmp.setText("Employee");
        add(lblHospitalUserEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        UserempJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(UserempJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 146, -1));

        HospitalUserbackjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HospitalUserbackjButton1.setText(" Back");
        HospitalUserbackjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalUserbackjButton1ActionPerformed(evt);
            }
        });
        add(HospitalUserbackjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 112, -1));

        lblHospitalManageOrg.setText("Organization");
        add(lblHospitalManageOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 20));

        UserorgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        UserorgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserorgJComboBoxActionPerformed(evt);
            }
        });
        add(UserorgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 146, -1));

        lblUserRole.setText("Role");
        add(lblUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 20));

        UserRoleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(UserRoleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 146, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\namra\\Downloads\\aed22.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalcreateUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalcreateUserJButtonActionPerformed
        String userName = hsopitalManagenameJTextField.getText();
        String password = HospitalUserpasswordJTextField.getText();
        if(!((userName.equals("") || (password.equals(""))))){
        if(MainSystem.checkIfUsernameIsUnique(userName)){
        Organization organization = (Organization) UserorgJComboBox.getSelectedItem();
        Employeeclass employee = (Employeeclass) UserempJComboBox.getSelectedItem();
        Roles role = (Roles) UserRoleJComboBox.getSelectedItem();
        
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        
        popData();
        }
        else{
           JOptionPane.showMessageDialog(null, " Enter a unique username", "Warning", JOptionPane.WARNING_MESSAGE); 
        }
        }else{
             JOptionPane.showMessageDialog(null, "Enter a valid value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HospitalcreateUserJButtonActionPerformed

    private void HospitalUserbackjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalUserbackjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_HospitalUserbackjButton1ActionPerformed

    private void UserorgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserorgJComboBoxActionPerformed
        Organization organization = (Organization) UserorgJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_UserorgJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HospitalManageuserJTable;
    private javax.swing.JButton HospitalUserbackjButton1;
    private javax.swing.JTextField HospitalUserpasswordJTextField;
    private javax.swing.JButton HospitalcreateUserJButton;
    private javax.swing.JComboBox UserRoleJComboBox;
    private javax.swing.JComboBox UserempJComboBox;
    private javax.swing.JComboBox UserorgJComboBox;
    private javax.swing.JTextField hsopitalManagenameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHospitalManageOrg;
    private javax.swing.JLabel lblHospitalManagePassword;
    private javax.swing.JLabel lblHospitalMangeUsername;
    private javax.swing.JLabel lblHospitalUserEmp;
    private javax.swing.JLabel lblUserRole;
    // End of variables declaration//GEN-END:variables
}
