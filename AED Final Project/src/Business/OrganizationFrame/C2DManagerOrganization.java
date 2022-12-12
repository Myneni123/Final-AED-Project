/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import java.util.HashSet;
import Business.Role.Roles;
import Business.Role.C2DRole;
import Business.Role.C2D_Manager;
import Business.Role.HospitalRole;


/**
 *
 * @author admin
 */
public class C2DManagerOrganization extends Organization {
    
     public C2DManagerOrganization() {
        super(Type.CDCManager.getValue());
    }
    
     @Override
    public HashSet<Roles> getSupportedRole() {
        
        return null;
    }
    
}
