/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnterpriseFrame;

import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class Enterprise_Directory {
     private ArrayList<Enterprise> enterpriseList;

    public Enterprise_Directory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new Hospital_Enterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new C2DEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if (type == Enterprise.EnterpriseType.Distributor){
            enterprise = new Distributorenterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
