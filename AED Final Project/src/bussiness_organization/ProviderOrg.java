/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bussiness_organization;

/**
 *
 * @author namra
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import Business.Supplier.Provider;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.HashSet;

/**
 *
 * @author Administrator
 */
public class ProviderOrganization extends Organization{
    Provider provider;
      public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
        provider= new Provider();
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
     
}


