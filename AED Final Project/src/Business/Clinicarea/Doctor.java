/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinicarea;

import Business.OrganizationFrame.Clinical_Organization;
/**
 *
 * @author admin
 */
public class Doctor {
    private String DoctorName;
    private String DoctorId;
    private static int DocCount;
    
    public Doctor(){
       DoctorId = "DOC"+(++ DocCount);
    }

    public String getDocName() {
        return DoctorName;
    }

    public void setDocName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getDoctorId() {
        return DoctorId;
    } 
    
    @Override
    public String toString(){
        return DoctorName;
    }
    
}
