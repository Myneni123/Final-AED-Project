/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business_Frame.MainSystem;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Organization;
import Business.OrganizationFrame.Clinical_Organization;
import Business.OrganizationFrame.Supplier_Org;
import Business.OrganizationFrame.Provider_Org;
import Business.UserHaandle.UserHandle;
import Business.SupplierArea.Supplier;
import javax.swing.JPanel;
import UI_Main.HospitalArea.Clinic.ClinicalAdminPanel;
import UI_Main.Distributors.SupplierDirectory.SupplierWorkPanel;
import UI_Main.Distributors.ProvidersLists.ProvidersWorkPanel;
import UI_Main.Hospital.Clinic.PharmacyArea.PharmacyWorkPanel;

/**
 *
 * @author mynenidivya
 */
public class PharmacyRole {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserHandle account, Organization organization, Enterprise enterprise, MainSystem business) {
      return new PharmacyWorkPanel(userProcessContainer,  account, (Clinical_Organization) organization,  enterprise,  business);
    }
     @Override
    public String toString(){
        return RoleType.PharmaManager.getValue();
    }
    
}
