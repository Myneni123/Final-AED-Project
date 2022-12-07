/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnterpriseFrame;


import Business.Role.ClinicAdminRole;
import Business.Role.Roles;
import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author mynenidivya
 */
public class Hospital_Enterprise {
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashSet<Roles> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new ClinicAdminRole());
        return roles;
    }
    
    
}
