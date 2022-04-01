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
public class PatientDirectory {
    private ArrayList<PatientExtendsPerson> patients;
    
    public PatientDirectory() {
        this.patients = new ArrayList<PatientExtendsPerson>();
    }

    public ArrayList<PatientExtendsPerson> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList patients) {
        this.patients = patients;
    }           
    
    public PatientExtendsPerson addNewPatient() {
        PatientExtendsPerson patient = new PatientExtendsPerson();
        patients.add(patient);
        return patient;
    }
    
    public void deletePatient(PatientExtendsPerson patient) {
        this.patients.remove(patient);
    }
    
    @Override
    public String toString() {
        return "Patients List: " + getPatients();
    }   
    
}
