/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinicarea;

import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Supplier.Vaccine;
import Business.Supplier.VaccineDirectory;

/**
 *
 * @author mynenidivya
 */
public class PharmacyWork {
    private VaccineDirectory vaccineList;
    private String pharmacyName;

    public PharmacyWork(){
        vaccineList= new VaccineDirectory();
    }
    
    public VaccineDirectory getVaccine() {
        return vaccineList;
    }

    public void setVaccine(VaccineDirectory vaccine) {
        this.vaccineList = vaccine;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    
    @Override
    public String toString(){
        return pharmacyName;
    }
    
    
}
