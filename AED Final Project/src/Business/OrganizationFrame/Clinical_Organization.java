/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import Business.Role.DoctorRole;
import java.util.HashSet;
import Business.Role.PharmacyRole;
import Business.Role.Roles;
import Business.Clinicarea.PharmacyWork;

/**
 *
 * @author mynenidivya
 */
public class Clinical_Organization extends Organization {
    
    PharmacyWork PW;
    public Clinical_Organization() {
       
        super(Organization.Type.Clinic.getValue());
         PW = new PharmacyWork();
    }

    public PharmacyWork getP() {
        return PW;
    }

    public void setP(PharmacyWork PW) {
        this.PW = PW;
    }
    
    @Override
    public HashSet<Roles> getSupportedRole() {
        roles= new HashSet<>();
        roles.add(new DoctorRole() );
        roles.add(new PharmacyRole());
        return roles;
    }
}
