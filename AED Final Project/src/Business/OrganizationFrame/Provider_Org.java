/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import java.util.HashSet;
import Business.Role.DistributorRole;
import Business.Role.Roles;
import Business.SupplierArea.Provider;

/**
 *
 * @author admin
 */
public class Provider_Org extends Organization{
    
    Provider Provider;
      public Provider_Org() {
        super(Organization.Type.Provider.getValue());
        Provider= new Provider();
    }

    public Provider getProvider() {
        return Provider;
    }

    public void setProvider(Provider provider) {
        this.Provider = provider;
    }

    @Override
    public HashSet<Roles> getSupportedRole() {
        
        return null;
    }
    
}
