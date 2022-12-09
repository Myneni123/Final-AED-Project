/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NetworkArea;

import Business.EnterpriseFrame.Enterprise_Directory;
import Business.OrganizationFrame.Organization;
import Business.Role.Roles;
import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class NetworkArea {
    
    private String Name;
    private Enterprise_Directory EnterpriseDirectory;

    public NetworkArea() {
       
        EnterpriseDirectory = new Enterprise_Directory();
    }
    

    public Enterprise_Directory getEnterpriseDirectory() {
        return EnterpriseDirectory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
