/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Frame;

import java.util.ArrayList;
import java.util.HashSet;
import Business.C2D.Disease_Directory;
import Business.EnterpriseFrame.Enterprise;
import Business.NetworkArea.NetworkArea;
import Business.OrganizationFrame.Organization;
import Business.Role.C2DRole;
import Business.Role.DistributorRole;
import Business.Role.HospitalRole;
import Business.Role.Roles;
import Business.Role.SysteAdmin;
import Business.SupplierArea.Vaccine_Directory;
import Business.UserHaandle.UserHandle;

/**
 *
 * @author mynenidivya
 */
public class MainSystem extends Organization {
     private static MainSystem business;
    private ArrayList<NetworkArea> networkList;
    private Vaccine_Directory vaccineList;
    private Disease_Directory diseaseList;

    public static MainSystem getInstance() {
        if (business == null) {
            business = new MainSystem();
        }
        return business;
    }

    private MainSystem() {
        super(null);
        networkList = new ArrayList<>();
       vaccineList= new Vaccine_Directory();
       diseaseList= new Disease_Directory();
    }

    public ArrayList<NetworkArea> getNetworkList() {
        return networkList;
    }

    public Vaccine_Directory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(Vaccine_Directory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    public static void setInstance(MainSystem system) {
        business=system;
    }
    
    public Disease_Directory getDiseaseList() {
        return diseaseList;
    }
    
    
    public void setDiseaseList(Disease_Directory diseaseList) {
        this.diseaseList = diseaseList;
    }

    public NetworkArea createAndAddNetwork() {
        NetworkArea network = new NetworkArea();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Roles> getSupportedRole() {
        roles.add(new SysteAdmin());
        roles.add(new HospitalRole());
        roles.add(new DistributorRole());
        roles.add(new C2DRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (NetworkArea network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserHandle ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserHandle ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                 if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                            }
                        }
                    }
            
      //  }

       

        return true;
    }
}
    

