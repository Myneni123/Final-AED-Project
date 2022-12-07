/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnterpriseFrame;

import java.util.HashSet;
import Business.Role.CDCManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mynenidivya
 */
public class C2DEnterprise {
    public CDCEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CDC);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new CDCManagerRole());
        return roles;
    }
    
}
