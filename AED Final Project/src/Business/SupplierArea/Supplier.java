/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierArea;

import Business.OrganizationFrame.Supplier_Org;
import Business.WorkLoad.Work_Queue;

/**
 *
 * @author admin
 */
public class Supplier {
    
    private String Name;
    private static int Count;
    private String SupplierId;
    private Vaccine_Directory vaccineList;
    private Work_Queue workQueue;
    
    public Supplier(){
        SupplierId= "SID"+(++Count);
        vaccineList= new Vaccine_Directory();
        workQueue= new Work_Queue();
    }

    public String getSupplierName() {
        return Name;
    }

    public void setSupplierName(String supplierName) {
        this.Name = supplierName;
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(Work_Queue workQueue) {
        this.workQueue = workQueue;
    }

    public void setSupplierId(String supplierId) {
        this.SupplierId = supplierId;
    }

    public Vaccine_Directory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(Vaccine_Directory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
    
}
