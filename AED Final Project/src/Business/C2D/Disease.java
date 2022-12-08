/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.C2D;

/**
 *
 * @author admin
 */
public class Disease {
    private String DiseaseName;
    private String DiseaseId;
    private static int Count;
    
    public Disease(){
        DiseaseId= "Dis"+(++Count);
    }

    public String getDiseaseName() {
        return DiseaseName;
    }

    public void setDiseaseName(String DiseaseName) {
        this.DiseaseName = DiseaseName;
    }

    public String getDiseaseId() {
        return DiseaseId;
    }

    @Override
    public String toString(){
    return DiseaseName;
}

    
}
