/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import javax.swing.JPanel;

/**
 *
 * @author mynenidivya
 */
public class PharmacyRole {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
      return new PharmacyAdminWorkAreaJPanel(userProcessContainer,  account, (ClinicOrganization) organization,  enterprise,  business);
    }
     @Override
    public String toString(){
        return RoleType.PharmaManager.getValue();
    }
    
}
