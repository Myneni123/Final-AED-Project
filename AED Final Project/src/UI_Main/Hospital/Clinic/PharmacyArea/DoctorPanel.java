/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Main.Hospital.Clinic.PharmacyArea;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    JPanel userProcessContainer;
    public DoctorPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No Appointment for today");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 38));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Doctor Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 26, 137, 37));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
