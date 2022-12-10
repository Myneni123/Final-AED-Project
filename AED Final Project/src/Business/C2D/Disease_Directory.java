/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.C2D;

import Business.SupplierArea.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Disease_Directory {
     private ArrayList<Disease> Disease_List;
    
    public Disease_Directory(){
        Disease_List= new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return Disease_List;
    }

    public void setDiseaseList(ArrayList<Disease> Disease_List) {
        this.Disease_List = Disease_List;
    }
       public Disease addDisease() {
        Disease vaccine = new Disease();
        Disease_List.add(vaccine);
        return vaccine;
    }
    
    //Removing an Employee from the Vaccine Directory
    public void removeDisease(Disease vaccine) {
        Disease_List.remove(vaccine);
    }
    
}
