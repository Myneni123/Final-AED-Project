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
public class Provider {
    
    private String providerName;
    private static int Count;
    private String providerId;
    private Vaccine_Directory vaccineList;
    private Work_Queue workQueue;
    
    public Provider(){
        providerId= "PID"+(++Count);
        vaccineList= new Vaccine_Directory();
        workQueue= new Work_Queue();
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(Work_Queue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Vaccine_Directory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(Vaccine_Directory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    @Override
    public String toString(){
        return providerName;
    }
    
}
