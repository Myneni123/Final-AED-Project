/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrganizationFrame;

import java.util.HashSet;
import Business.EmployeeArea.EmployeeDirectory;
import Business.Role.Roles;
import Business.UserHaandle.Users_Directory;
import Business. WorkLoad.Work_Queue;
import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public abstract class Organization {
    
    private String Name;
    private Work_Queue WorkQueue;
    private EmployeeDirectory EmployeeDirectory;
    private Users_Directory UserHandleDirectory;
    private int OrganizationID;
    private static int Counter=0;
    public HashSet<Roles> roles;
    
    public enum Type{
        CDCManager("CDCManager Organization"),Clinic("Clinic Organization"),Supplier("Supplier Organization"), Provider("Provider Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.Name = name;
        WorkQueue = new Work_Queue();
        EmployeeDirectory = new EmployeeDirectory();
        UserHandleDirectory = new Users_Directory();
        OrganizationID = Counter;
        roles = new HashSet<>();
        ++Counter;
    }

    public abstract HashSet<Roles> getSupportedRole();
    
    public Users_Directory getUserAccountDirectory() {
        return UserHandleDirectory;
    }

    public int getOrganizationID() {
        return OrganizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return EmployeeDirectory;
    }
    
    public String getName() {
        return Name;
    }

    public Work_Queue getWorkQueue() {
        return WorkQueue;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setWorkQueue(Work_Queue WorkQueue) {
        this.WorkQueue = WorkQueue;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
