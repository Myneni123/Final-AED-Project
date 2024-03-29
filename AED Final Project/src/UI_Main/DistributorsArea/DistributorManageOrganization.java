/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.DistributorsArea;

import Business.OrganizationFrame.Organization;
import Business.OrganizationFrame.Organization.Type;
import Business.OrganizationFrame.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class DistributorManageOrganization extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new setup ManageOrganizationJPanel
     */
    public DistributorManageOrganization(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        OrgTypeJComboBox.removeAllItems();
       // for (Type type : Organization.Type.values()){
         //   if (!type.getValue().equals(Type.Admin.getValue()))
                OrgTypeJComboBox.addItem(Type.Provider);
                OrgTypeJComboBox.addItem(Type.Supplier);
        //}
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) Org_JTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }
    /**
     * To initialize the form ,this method is invoked within the constructor.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Org_JTable = new javax.swing.JTable();
        add_OrgJButton = new javax.swing.JButton();
        OrgTypeJComboBox = new javax.swing.JComboBox();
        lblOrg = new javax.swing.JLabel();
        back_JButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Org_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Org_JTable);
        if (Org_JTable.getColumnModel().getColumnCount() > 0) {
            Org_JTable.getColumnModel().getColumn(0).setResizable(false);
            Org_JTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 480, 92));

        add_OrgJButton.setText("Add Organization");
        add_OrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_OrgJButtonActionPerformed(evt);
            }
        });
        add(add_OrgJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        OrgTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(OrgTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 81, -1));

        lblOrg.setText("Organization Category ");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 40));

        back_JButton.setText(" Back");
        back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_JButtonActionPerformed(evt);
            }
        });
        add(back_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (18).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void add_OrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_OrgJButtonActionPerformed

        Type type = (Type) OrgTypeJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_add_OrgJButtonActionPerformed

    private void back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_JButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_back_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrgTypeJComboBox;
    private javax.swing.JTable Org_JTable;
    private javax.swing.JButton add_OrgJButton;
    private javax.swing.JButton back_JButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrg;
    // End of variables declaration//GEN-END:variables
}
