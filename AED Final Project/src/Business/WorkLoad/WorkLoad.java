/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkLoad;
 import java.util.ArrayList;       

/**
 *
 * @author bhema
 */
public class WorkLoad {
     private ArrayList<WorkRequest> workRequestList;

    public WorkLoad() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
