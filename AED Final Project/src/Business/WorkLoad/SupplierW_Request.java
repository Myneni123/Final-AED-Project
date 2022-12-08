/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkLoad;

import Business.SupplierArea.Supplier;

/**
 *
 * @author admin
 */
public class SupplierW_Request extends Work_Request {
    
    private int RequestQuantity;
    private boolean add;
    private Supplier Supplier;

     public SupplierW_Request(){
        add = false;
    }
     
    public Supplier getSupplier() {
        return Supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.Supplier = supplier;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    
    public int getQuantity() {
        return RequestQuantity;
    }

    public void setQuantity(int Quantity) {
        this.RequestQuantity = Quantity;
    }

    
}
