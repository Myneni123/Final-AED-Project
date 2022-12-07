/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierArea;

import Business.C2D.Disease;

/**
 *
 * @author mynenidivya
 */
public class Vaccine {
    private String VaccinationName;
    private String VaccinationId;
    private static int VaccinationCount;
    private Disease Disease;
    private int Quantity;
    
    public Vaccine(){
        VaccinationId= "VAC"+(++VaccinationCount);
        Disease= new Disease();
    }

    public String getVaccineName() {
        return VaccinationName;
    }

    public void setVaccineName(String VaccinationName) {
        this.VaccinationName = VaccinationName;
    }

    public String getVaccineId() {
        return VaccinationId;
    }

    public Disease getDisease() {
        return Disease;
    }

    public void setDisease(Disease Disease) {
        this.Disease = Disease;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
     @Override
    public String toString(){
    return VaccinationName;
    }
    
}
