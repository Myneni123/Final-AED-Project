/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business_Frame.MainSystem;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Organization;
import Business.UserHaandle.UserHandle;

import javax.swing.JPanel;
import UI_Main.AdministrativeWorkArea.AdminWorkPanel;


/**
 *
 * @author mynenidivya
 */
public class SysteAdmin extends Roles {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserHandle account, Organization organization, Enterprise enterprise, MainSystem system) {
        return new AdminWorkPanel(userProcessContainer, system);
    }
     @Override
    public String toString(){
        return RoleType.SystemAdmin.getValue();
    }
    
}
