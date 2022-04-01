/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class VitalSignsPatient {
    ArrayList<VitalSignPatient> vitalSignsHistory;
    
    public VitalSignsPatient() {
        vitalSignsHistory  = new ArrayList<VitalSignPatient>();
    }

    public ArrayList<VitalSignPatient> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSignPatient> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }         
    
    public VitalSignPatient addNewVitalSigns() {
        VitalSignPatient patient  = new VitalSignPatient();                              
        vitalSignsHistory.add(patient);
        return patient;
    }    
    
}
