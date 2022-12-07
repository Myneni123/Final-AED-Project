/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnterpriseFrame;

import java.util.HashSet;
import Business.Role.ProviderRole;
import Business.Role.Roles;
import Business.Role.SupplierRole;
import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author mynenidivya
 */
public class Distributorenterprise {
     public Distributorenterprise(String name) {
        super(name, Enterprise.EnterpriseType.Distributor);
    }

    @Override
    public HashSet<Roles> getSupportedRole() {
         roles= new HashSet<>();
        roles.add(new ProviderRole());
        roles.add(new SupplierRole());
        return roles;
    }
   
    
}
