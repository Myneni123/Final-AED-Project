/*
 * AdminWorkPanel.java
 *
 *
 */

package UI_Main.HospitalArea.Clinic;

import Business_Frame.MainSystem;
import UI_Main.Hospital_class.*;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Clinical_Organization;
import Business.OrganizationFrame.Organization;
import Business.UserHaandle.UserHandle;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  admin
 */
public class ClinicalAdminPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserHandle account; 
    Clinical_Organization organization; 
    Enterprise enterprise; 
    MainSystem business;
    /** Creates new setup AdminWorkAreaJPanel */
    public ClinicalAdminPanel(JPanel userProcessContainer, UserHandle account, Clinical_Organization organization, Enterprise enterprise, MainSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account=account;
        this.business=business;
        this.organization= organization;
        valueLabel.setText(enterprise.getName());
    }
    
    /**To initialize the form ,the method is invoked within constructor
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClinicWork = new javax.swing.JLabel();
        ClinicManageuserJButton = new javax.swing.JButton();
        ClinicmanageEmpJButton = new javax.swing.JButton();
        lblClinicEnterprise = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClinicWork.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClinicWork.setText("Clinic Work -Admin");
        add(lblClinicWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        ClinicManageuserJButton.setText("Manage User Account");
        ClinicManageuserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClinicManageuserJButtonActionPerformed(evt);
            }
        });
        add(ClinicManageuserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        ClinicmanageEmpJButton.setText("Manage Employee");
        ClinicmanageEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClinicmanageEmpJButtonActionPerformed(evt);
            }
        });
        add(ClinicmanageEmpJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 170, -1));

        lblClinicEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClinicEnterprise.setText("Enterprise :");
        add(lblClinicEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 30));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (16).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 260, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void ClinicManageuserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinicManageuserJButtonActionPerformed
        // TODO add your handling code here:
        ClinicManageUsersPanel muajp = new ClinicManageUsersPanel( userProcessContainer,  account,  organization,  enterprise,  business);
        userProcessContainer.add("ClinicManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ClinicManageuserJButtonActionPerformed

    private void ClinicmanageEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinicmanageEmpJButtonActionPerformed

        ClinicManageemployeePanel manageEmployeeJPanel = new ClinicManageemployeePanel(userProcessContainer,  account,  organization,  enterprise,  business);
        userProcessContainer.add("ClinicManageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ClinicmanageEmpJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClinicManageuserJButton;
    private javax.swing.JButton ClinicmanageEmpJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClinicEnterprise;
    private javax.swing.JLabel lblClinicWork;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
