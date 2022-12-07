/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmployeeArea;

import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class EmployeeDirectory {
    
    private ArrayList<Employeeclass> EmployeeList;

    public EmployeeDirectory() {
        EmployeeList = new ArrayList<>();
    }

    public ArrayList<Employeeclass> getEmployeeList() {
        return EmployeeList;
    }
    
    public Employeeclass createEmployee(String name){
        Employeeclass employee = new Employeeclass();
        employee.setName(name);
        EmployeeList.add(employee);
        return employee;
    }
    
}
