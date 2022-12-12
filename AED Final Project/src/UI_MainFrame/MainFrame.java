/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_MainFrame;

import Business.C2D.Disease_Directory;
import Business_Frame.MainSystem;
import Business_Frame.ConfigureSystem;
import Business.database.db4o;
import Business.EnterpriseFrame.Enterprise;
import Business.NetworkArea.NetworkArea;
import Business.OrganizationFrame.Organization;
import Business.SupplierArea.Vaccine_Directory;
import Business.UserHaandle.UserHandle;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private MainSystem system;
    private db4o dB4OUtil = db4o.getInstance();

    public MainFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        MainSystem.setInstance(system);
        setExtendedState(getExtendedState()| JFrame.MAXIMIZED_BOTH);
//        VaccineDirectory v= new VaccineDirectory();
//        DiseaseDirectory d= new DiseaseDirectory();
//        system.setDiseaseList(d);
//        system.setVaccineList(v);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        tfieldUsername = new javax.swing.JTextField();
        tfieldPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 100, -1));
        jPanel1.add(tfieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 118, -1));
        jPanel1.add(tfieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, 118, -1));

        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("User Name");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, -1, -1));
        jPanel1.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        btnLogout.setText("Logout");
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, 92, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bhema\\Downloads\\image (1).jpg")); // NOI18N
        container.add(jLabel1, "card3");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name
        String userName = tfieldUsername.getText();
        // Get Password
        char[] passwordCharArray = tfieldPassword.getPassword();
        
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        
        UserHandle userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (NetworkArea network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            
                            if (userAccount != null) {
                            //    System.out.println("organi"+ organization.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
    
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }
         btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        tfieldUsername.setEnabled(false);
        tfieldPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        tfieldUsername.setEnabled(true);
        tfieldPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        tfieldUsername.setText("");
        tfieldPassword.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField tfieldPassword;
    private javax.swing.JTextField tfieldUsername;
    // End of variables declaration//GEN-END:variables
}
