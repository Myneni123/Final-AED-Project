/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserHandle;

import Business.EmployeeArea.EmployeeArea;
import Business.Role.Role;
import Business.WorkLoad.WorkLoad;        
        
/**
 *
 * @author bhema
 */
public class UserHandle {
    private String username;
    private String password;
    private EmployeeArea employeearea;
    private Role role;
    private WorkLoad workload;

    public UserHandle() {
        workload = new WorkLoad();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployeeArea(EmployeeArea employeearea) {
        this.employeearea = employeearea;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public EmployeeArea getEmployeeArea() {
        return employeearea;
    }

    public WorkLoad getWorkLoad() {
        return workload;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
