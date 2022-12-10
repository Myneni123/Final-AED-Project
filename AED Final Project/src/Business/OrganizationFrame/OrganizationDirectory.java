/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import java.util.ArrayList;
import Business.SupplierArea.Provider;
import Business.SupplierArea.Supplier;
import Business.OrganizationFrame.Organization.Type;
import Business.EnterpriseFrame.C2DEnterprise;


/**
 *
 * @author admin
 */
public class OrganizationDirectory {
   
    private ArrayList<Organization> Or_List;

    public OrganizationDirectory() {
        Or_List = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return Or_List;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new Clinical_Organization();
            Or_List.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new Supplier_Org();
            Or_List.add(organization);
        }
       
        else if (type.getValue().equals(Type.Provider.getValue())){
            organization = new Provider_Org();
            Or_List.add(organization);
        }
        else if (type.getValue().equals(Type.CDCManager.getValue())){
            organization = new C2DManagerOrganization();
            Or_List.add(organization);
        }
        return organization;
    }
}
