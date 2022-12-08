/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkLoad;

import java.util.Date;
import Business.SupplierArea.Vaccine;
import Business.UserHaandle.UserHandle;

/**
 *
 * @author admin
 */
public class Work_Request {
    
     private String Message;
    private UserHandle Sender;
    private UserHandle Receiver;
    private String Status;
    private Date Requestdate;
    private Date resolveDate;
    private Vaccine Vaccine;
    
    public Work_Request(){
        Requestdate = new Date();
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        this.Message = message;
    }

    public UserHandle getSender() {
        return Sender;
    }

    public Vaccine getVaccine() {
        return Vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.Vaccine = vaccine;
    }

    public void setSender(UserHandle sender) {
        this.Sender = sender;
    }

    public UserHandle getReceiver() {
        return Receiver;
    }

    public void setReceiver(UserHandle receiver) {
        this.Receiver = receiver;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public Date getRequestDate() {
        return Requestdate;
    }

    public void setRequestDate(Date requestDate) {
        this.Requestdate = requestDate;

    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){

        return Status;

    }
    
}
