/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Organization;
import Business.UserHaandle.UserHandle;
import Business_Frame.MainSystem;
import javax.swing.JPanel;
import UI_Main.C2D.C2D_CatalogPanel;
/**
 *
 * @author admin
 */
public class C2D_Manager extends Roles {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserHandle account, Organization organization, Enterprise enterprise, MainSystem business) {
        return new C2D_CatalogPanel( userProcessContainer,  business);
    }
     @Override
    public String toString(){
        return RoleType.CDCManager.getValue();
    }
    
}
