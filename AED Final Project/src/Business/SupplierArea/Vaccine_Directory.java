/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierArea;

import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class Vaccine_Directory {
    private ArrayList<Vaccine> vaccinationList;
    
    public Vaccine_Directory(){
        vaccinationList= new ArrayList<>();
                
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccinationList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccinationList = vaccineList;
    }
    
       public Vaccine addVaccine() {
        Vaccine vaccine = new Vaccine();
        vaccinationList.add(vaccine);
        return vaccine;
    }
    
    //Removing an Employee from the Directory
    public void removeVaccine(Vaccine vaccine) {
        vaccinationList.remove(vaccine);
    }
    
}
