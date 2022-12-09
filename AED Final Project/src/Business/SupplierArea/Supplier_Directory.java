/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierArea;

import java.util.ArrayList;
import Business.C2D.Disease;

/**
 *
 * @author mynenidivya
 */
public class Supplier_Directory {
    
    private ArrayList<Supplier> SuppliersList;
    
    public Supplier_Directory(){
        SuppliersList= new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return SuppliersList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.SuppliersList = supplierList;
    }
     public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        SuppliersList.add(supplier);
        return supplier;
    }
    
    //Removing an Employee from the Directory
    public void removeSupplier(Supplier supplier) {
        SuppliersList.remove(supplier);
    }
    
}
