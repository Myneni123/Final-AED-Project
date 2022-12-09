/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import java.util.HashSet;
import Business.Role.Roles;
import Business.Role.DistributorRole;
import Business.SupplierArea.Supplier_Directory;
/**
 *
 * @author mynenidivya
 */
public class Supplier_Org extends Organization {
    
    private Supplier_Directory SupplierList;
    public Supplier_Org() {
        super(Organization.Type.Supplier.getValue());
        SupplierList= new Supplier_Directory();
    }

    public Supplier_Directory getSupplierList() {
        return SupplierList;
    }

    public void setSupplierList(Supplier_Directory SupplierList) {
        this.SupplierList = SupplierList;
    }

    @Override
    public HashSet<Roles> getSupportedRole() {
        return null;
    }
    
}
