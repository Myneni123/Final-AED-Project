/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.C2D;

import Business.CDC.Disease;
import Business.EcoSystem;
import Business.Supplier.Vaccine;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class C2D_CatalogPanel extends javax.swing.JPanel {

    /**
     * Creates new form C2D_CatalogPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    public C2D_CatalogPanel(JPanel userJPanel, EcoSystem business) {
        initComponents();
        userProcessContainer=userJPanel;
        this.business=business;
        populateDiseaseTable();
        populateVaccineTable();
    }
  public void populateDiseaseTable(){
         DefaultTableModel dtm= (DefaultTableModel) tblDisease.getModel();
       dtm.setRowCount(0);
      
       for (Disease disease : business.getDiseaseList().getDiseaseList()) {
           Object[] row = new Object[2];
           row[0]= disease;
           row[1]=disease.getDiseaseId();
           dtm.addRow(row);
       }  
       }
  
  public void populateVaccineTable(){
         DefaultTableModel dtm= (DefaultTableModel) tblVaccine.getModel();
       dtm.setRowCount(0);
       for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
        
           Object[] row = new Object[2];
           row[0]= vaccine;
           row[1]=vaccine.getVaccineId();
           dtm.addRow(row);
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
        tblDisease = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccine = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease Name", "Disease ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisease);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 590, 170));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Manage Disease Directory");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 320, 30));

        tblVaccine.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblVaccine);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 590, 170));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Manage Vaccine Directory");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 320, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDisease;
    private javax.swing.JTable tblVaccine;
    // End of variables declaration//GEN-END:variables
}