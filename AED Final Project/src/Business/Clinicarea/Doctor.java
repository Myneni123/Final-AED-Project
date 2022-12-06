/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Clinicarea;

import Business.Organization.ClinicOrganization;
/**
 *
 * @author mynenidivya
 */
public class Doctor {
    private String docName;
    private String doctorId;
    private static int docCount;
    
    public Doctor(){
        doctorId= "DOC"+(++docCount);
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDoctorId() {
        return doctorId;
    } 
    
    @Override
    public String toString(){
        return docName;
    }
    
}
