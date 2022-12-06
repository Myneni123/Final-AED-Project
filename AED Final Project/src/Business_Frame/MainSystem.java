/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Frame;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author mynenidivya
 */
public class MainSystem extends OrganizationFrame {
     private static MainSystem business;
    private ArrayList<Network> networkList;
    private VaccineDirectory vaccineList;
    private DiseaseDirectory diseaseList;

    public static MainSystem getInstance() {
        if (business == null) {
            business = new MainSystem();
        }
        return business;
    }

    private MainSystem() {
        super(null);
        networkList = new ArrayList<>();
       vaccineList= new VaccineDirectory();
       diseaseList= new DiseaseDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public VaccineDirectory getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineDirectory vaccineList) {
        this.vaccineList = vaccineList;
    }
    
    public static void setInstance(MainSystem system) {
        business=system;
    }
    
    public DiseaseDirectory getDiseaseList() {
        return diseaseList;
    }
    
    
    public void setDiseaseList(DiseaseDirectory diseaseList) {
        this.diseaseList = diseaseList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new HospitalAdminRole());
        roles.add(new DistributorAdminRole());
        roles.add(new CDCAdminRole());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (Network network : business.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
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
    

