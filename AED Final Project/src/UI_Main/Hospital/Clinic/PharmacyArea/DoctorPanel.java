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
 * @author admin
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new setup DoctorPanel
     */
    JPanel userProcessContainer;
    public DoctorPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
    }

    /**
     * To initialize the form,the method is invoked within the constructor.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAppointment = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblAppointment1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (20).png"))); // NOI18N
        add(lblAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 270, 200));

        lblDoctor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDoctor.setText("Doctor Work ");
        add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 37));

        lblAppointment1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAppointment1.setText("No Appointments are Available for today");
        add(lblAppointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 290, 38));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAppointment;
    private javax.swing.JLabel lblAppointment1;
    private javax.swing.JLabel lblDoctor;
    // End of variables declaration//GEN-END:variables
}
