/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinicarea;

import Business.OrganizationFrame.Clinical_Organization;
import Business.OrganizationFrame.Organization;
import Business.SupplierArea.Vaccine;
import Business.SupplierArea.Vaccine_Directory;

/**
 *
 * @author admin
 */
public class PharmacyWork {
    private Vaccine_Directory VaccineList;
    private String PharmacyName;

    public PharmacyWork(){
        VaccineList= new Vaccine_Directory();
    }
    
    public Vaccine_Directory getVaccine() {
        return VaccineList;
    }

    public void setVaccine(Vaccine_Directory Vaccine) {
        this.VaccineList = Vaccine;
    }

    public String getPharmacyName() {
        return PharmacyName;
    }

    public void setPharmacyName(String PharmacyName) {
        this.PharmacyName = PharmacyName;
    }
    
    @Override
    public String toString(){
        return PharmacyName;
    }
    
    
}
