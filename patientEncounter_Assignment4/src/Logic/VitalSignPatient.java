/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class VitalSignPatient {
    String namePerson;
    int medRecNoPerson;
    int agePerson;
    String cityPerson;
    String commPerson;
    private Date reportedDatePerson;
    private double bloodPressureUpp;
    private double bloodPressureLow;

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getMedRecNoPerson() {
        return medRecNoPerson;
    }

    public void setMedRecNoPerson(int medRecNoPerson) {
        this.medRecNoPerson = medRecNoPerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    public String getCityPerson() {
        return cityPerson;
    }

    public void setCityPerson(String cityPerson) {
        this.cityPerson = cityPerson;
    }

    public String getCommPerson() {
        return commPerson;
    }

    public void setCommPerson(String commPerson) {
        this.commPerson = commPerson;
    }

    public Date getReportedDatePerson() {
        return reportedDatePerson;
    }

    public void setReportedDatePerson(Date reportedDatePerson) {
        this.reportedDatePerson = reportedDatePerson;
    }

    public double getBloodPressureUpp() {
        return bloodPressureUpp;
    }

    public void setBloodPressureUpp(double bloodPressureUpp) {
        this.bloodPressureUpp = bloodPressureUpp;
    }

    public double getBloodPressureLow() {
        return bloodPressureLow;
    }

    public void setBloodPressureLow(double bloodPressureLow) {
        this.bloodPressureLow = bloodPressureLow;
    }
    @Override
    public String toString(){
        return this.namePerson;
    }

    
    
}
