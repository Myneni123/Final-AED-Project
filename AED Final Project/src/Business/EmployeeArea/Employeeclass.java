/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EmployeeArea;

/**
 *
 * @author admin
 */
public class Employeeclass {
    
    private String Name;
    private int E_Id;
    private static int Count = 1;

    public Employeeclass() {
        E_Id = Count;
        Count++;
    }

    public int getId() {
        return E_Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return Name;
    }
    
    
}
