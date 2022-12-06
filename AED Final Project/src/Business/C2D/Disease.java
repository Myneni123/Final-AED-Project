/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.C2D;

/**
 *
 * @author mynenidivya
 */
public class Disease {
    private String diseaseName;
    private String diseaseId;
    private static int dCount;
    
    public Disease(){
        diseaseId= "Dis"+(++dCount);
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseId() {
        return diseaseId;
    }

    @Override
    public String toString(){
    return diseaseName;
}

    
}
