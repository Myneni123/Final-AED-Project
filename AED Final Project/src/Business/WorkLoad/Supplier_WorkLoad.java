/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkLoad;

/**
 *
 * @author bhema
 */
public class Supplier_WorkLoad extends WorkLoad{
    
    private int requestQuantity;
    private boolean add;
    private Suppliers suppliers;

     public Supplier_WorkLoad(){
        add = false;
    }
     
    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    
    public int getQuantity() {
        return requestQuantity;
    }

    public void setQuantity(int quantity) {
        this.requestQuantity = quantity;
    }

    
}
