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
import Business.UserHaandle.UserHandle;
import Business.SupplierArea.Supplier;
import javax.swing.JPanel;
import UI_Main.HospitalArea.Clinic.ClinicalAdminPanel;
import UI_Main.Distributors.SupplierDirectory.SupplierWorkPanel;
/**
 *
 * @author admin
 */
public class SupplierRole extends Roles {
    
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserHandle account, Organization organization, Enterprise enterprise, MainSystem Business) {
        return new SupplierWorkPanel(userProcessContainer,  account, (Supplier_Org) organization,  enterprise,  Business);
    }
    @Override
    public String toString(){
        return RoleType.Supplier.getValue();
    }
    
}
