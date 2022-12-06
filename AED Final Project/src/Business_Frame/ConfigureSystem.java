/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Frame;

import Business_Frame.EmployeeArea.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author mynenidivya
 */
public class ConfigureSystem {
    
    public static MainSystem configure(){
        
        MainSystem system = MainSystem.getInstance();
        
        //Create a networkFrame
        //create an enterprise with organizations
        //initialize some organizations with employees
        //have some employees list
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
    

