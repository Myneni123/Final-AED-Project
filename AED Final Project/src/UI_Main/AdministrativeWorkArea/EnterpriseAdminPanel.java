/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.AdministrativeWorkArea;

import Business_Frame.MainSystem;
import Business.EmployeeArea.Employeeclass;
import Business.EnterpriseFrame.Enterprise;
import Business.NetworkArea.NetworkArea;
import Business.Role.C2DRole;
import Business.Role.DistributorRole;
import Business.Role.HospitalRole;
import Business.UserHaandle.UserHandle;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Validation.Validation;

/*
 *
 * @author admin
 */
public class EnterpriseAdminPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private MainSystem sys;

    /**
     * Creates new form from EnterprisePanel
     */
    public EnterpriseAdminPanel(JPanel userProcessContainer,  MainSystem sys) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.sys = sys;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (NetworkArea networkarea : sys.getNetworkList()) {
            for (Enterprise enterprise : networkarea.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserHandle userHandle : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = networkarea.getName();
                    row[2] = userHandle;

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (NetworkArea networkarea : sys.getNetworkList()) {
            networkJComboBox.addItem(networkarea);
        }
    }

    private void populateEnterpriseComboBox(NetworkArea networkarea) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : networkarea.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 58, 523, 95));

        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 201, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 198, 136, -1));

        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 294, -1, -1));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 291, 136, -1));

        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 254, -1, -1));

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 251, 136, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 432, -1, -1));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 334, -1, -1));

        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyPressed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 371, 136, -1));

        jLabel5.setText("Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 374, -1, -1));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 331, 134, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 423, -1, -1));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        NetworkArea networkarea = (NetworkArea) networkJComboBox.getSelectedItem();
        if (networkarea != null) {
            populateEnterpriseComboBox(networkarea);
        }


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(!nameJTextField.getText().equals("")){
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();

        Employeeclass employeeclass = enterprise.getEmployeeDirectory().createEmployee(name);
        if (MainSystem.checkIfUsernameIsUnique(username)) {
            UserHandle account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.CDC) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employeeclass, new C2DRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Distributor) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employeeclass, new DistributorRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employeeclass, new HospitalRole());
            }

            populateTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a valid username", "Warning", JOptionPane.WARNING_MESSAGE);
        }
 }else{
             JOptionPane.showMessageDialog(null, "Enter a value", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkPanel sysAdminwjp = (AdminWorkPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row for deleting the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            UserHandle p = (UserHandle) enterpriseJTable.getValueAt(selectedRow, 2);

            for (NetworkArea networkarea : sys.getNetworkList()) {
                for (Enterprise enterprise : networkarea.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserHandle userHandle : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (p == userHandle) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Account deleted successfully");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void nameJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyPressed
        // TODO add your handling code here:
        Validation.onlyString(evt, nameJTextField);
    }//GEN-LAST:event_nameJTextFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
