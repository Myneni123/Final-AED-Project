/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnterpriseFrame;
import Business.OrganizationFrame.Organization;
import Business.OrganizationFrame.OrganizationDirectory;

/**
 *
 * @author admin
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String Name, EnterpriseType type) {
        super(Name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),CDC("CDC"), Distributor("Distributor"),Supplier("Supplier");
        
        private String value;

        private EnterpriseType(String value) {
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
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
