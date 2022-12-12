/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkLoad;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Work_Queue {
    
    private ArrayList<Work_Request> Work_RequestList;

    public Work_Queue() {
        Work_RequestList = new ArrayList<>();
    }

    public ArrayList<Work_Request> getWorkRequestList() {
        return Work_RequestList;
    }
    
}
