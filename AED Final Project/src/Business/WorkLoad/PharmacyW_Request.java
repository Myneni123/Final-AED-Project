/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkLoad;

/**
 *
 * @author admin
 */
public class PharmacyW_Request extends Work_Request {
    private int requestQuantity;
    private boolean add;
    
    public PharmacyW_Request(){
        add = false;
    }
    
    public int getQuantity() {
        return requestQuantity;
    }

    public void setQuantity(int quantity) {
        this.requestQuantity = quantity;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    
}
