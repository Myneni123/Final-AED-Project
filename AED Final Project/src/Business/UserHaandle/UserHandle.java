/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserHaandle;

import Business.EmployeeArea.Employeeclass;
import Business.Role.Roles;
import Business.WorkLoad.Work_Queue;

/**
 *
 * @author admin
 */
public class UserHandle {
    private String UserName;
    private String Password;
    private Employeeclass Employee;
    private Roles Role;
    private Work_Queue WorkQueue;

    public UserHandle() {
        WorkQueue = new Work_Queue();
    }
    
    
    
    public String getUsername() {
        return UserName;
    }

    public void setUsername(String username) {
        this.UserName = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Roles getRole() {
        return Role;
    }

    public void setEmployee(Employeeclass employee) {
        this.Employee = employee;
    }

    public void setRole(Roles role) {
        this.Role = role;
    }

    public Employeeclass getEmployee() {
        return Employee;
    }

    public Work_Queue getWorkQueue() {
        return WorkQueue;
    }

    
    
    @Override
    public String toString() {
        return UserName;
    }
    
    
}
