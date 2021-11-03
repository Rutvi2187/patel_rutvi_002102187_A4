/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import java.util.ArrayList;



/**
 *
 * @author Rutvi Patel
 */
public class Encounter {
    
    private Patient patient;
    private VitalSigns vitalSigns;
    private String timeStamp;
 
    public Patient getPatient() {
        return patient;
    }
 
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
 
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }
 
    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
 
    public String getTimeStamp() {
        return timeStamp;
    }
 
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
}
