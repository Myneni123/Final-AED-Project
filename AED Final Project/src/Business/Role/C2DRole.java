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
import UI_Main.C2D.C2DAdminWork_Space;

/**
 *
 * @author admin
 */
public class C2DRole extends Roles {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserHandle account, Organization organization, Enterprise enterprise, MainSystem business) {
        return new C2DAdminWork_Space(userProcessContainer, enterprise, business);
    }
     @Override
    public String toString(){
        return RoleType.CDCAdmin.getValue();
    }
    
}
