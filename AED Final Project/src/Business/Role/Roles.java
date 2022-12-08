/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business_Frame.MainSystem;
import Business.EnterpriseFrame.Enterprise;
import Business.OrganizationFrame.Organization;
import Business.UserHaandle.UserHandle;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public abstract class Roles {
    
     public enum RoleType{
        
        
        SystemAdmin("SystemAdmin"),
        HospitalAdmin("HospitalAdmin"),
        DistributorAdmin("DistributorAdmin"),
        CDCAdmin("CDCAdmin"),
        ClinicAdmin("ClinicAdmin"),
        Doctor("Doctor"),
        PharmaManager("PharmaManager"),
        CDCManager("CDCManager"),
        Provider("Provider"),
        Supplier("Supplier");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserHandle Handle, 
            Organization organization, 
            Enterprise Enterprise, 
            MainSystem Business);
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
