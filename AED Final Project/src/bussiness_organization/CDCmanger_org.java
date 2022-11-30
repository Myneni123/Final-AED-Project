/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness_organization;

import java.util.HashSet;

/**
 *
 * @author namra
 */
import Business.Role.CDCAdminRole;
import Business.Role.CDCManagerRole;
import Business.Role.HospitalAdminRole;
//import Business.Role.Role;
import java.util.HashSet;

public class CDCmanger_org {
    public CDCManagerOrg() {
        super(Type.CDCManager.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
     
}

}
