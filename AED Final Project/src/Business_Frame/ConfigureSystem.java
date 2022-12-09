/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Frame;

import Business.EmployeeArea.Employeeclass;
import Business.Role.SysteAdmin;
import Business.UserHaandle.UserHandle;

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
        
        
        Employeeclass employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserHandle ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SysteAdmin());
        
        return system;
    }
    
}
    

