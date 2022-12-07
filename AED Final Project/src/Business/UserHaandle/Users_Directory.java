/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserHaandle;

import java.util.ArrayList;
import Business.EmployeeArea.Employeeclass;
import Business.Role.Roles;



/**
 *
 * @author mynenidivya
 */
public class Users_Directory {
    private ArrayList<UserHandle> UserAccountList;

    public Users_Directory () {
        UserAccountList = new ArrayList<>();
    }

    public ArrayList<UserHandle> getUserAccountList() {
        return UserAccountList;
    }
    
    public UserHandle authenticateUser(String username, String password){
        
        for (UserHandle ua : UserAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        
        return null;
    }
    
    public UserHandle createUserAccount(String username, String password, Employeeclass employee, Roles role){
       UserHandle userAccount = new UserHandle();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        UserAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserHandle ua : UserAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
