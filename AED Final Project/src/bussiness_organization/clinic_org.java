/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness_organization;
import Business.Clinic.Pharmacy;
import Business.Role.DoctorRole;
import Business.Role.PharmaManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author namra
 */
public class Clinic_Org extends Organization{
public class clinic_org {
    super(Org.Type.Clinic.getValue());
         p = new Pharmacy();
    }

    public Pharmacy getP() {
        return p;
    }

    public void setP(Pharmacy p) {
        this.p = p;
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new DoctorRole() );
        roles.add(new PharmaManagerRole());
        return roles;
    }
     

}
