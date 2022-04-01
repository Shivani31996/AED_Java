/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Dell
 */
public class PatientExtendsPerson extends PersonParentClass{
    private double bloodPressurelow;
    private double bloodPressureUpp;

    public double getBloodPressurelow() {
        return bloodPressurelow;
    }

    public void setBloodPressurelow(double bloodPressureMin) {
        this.bloodPressurelow = bloodPressureMin;
    }

    public double getBloodPressureUpp() {
        return bloodPressureUpp;
    }

    public void setBloodPressureUpp(double bloodPressureMax) {
        this.bloodPressureUpp = bloodPressureMax;
    }


    public boolean isPatientNormal(double age, double bloodPressureMin, double bloodPressureMax) {
        boolean val;
        
        if(age <18) {
            val = kids(bloodPressureMin, bloodPressureMin);
        }else if(age >= 18 && age <= 45) {
            val = MidAge(bloodPressureMin, bloodPressureMax);
        }else if(age >45) {
            val = Seniors(bloodPressureMin, bloodPressureMax);
        }
        else {
            val = false;
        }
        return val;
    }
    
    private boolean kids(double bloodPressureMin, double bloodPressureMax) {
        boolean result;
        
        if (bloodPressureMin > 80 && bloodPressureMax < 120) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean MidAge(double bloodPressureMin, double bloodPressureMax) {
        boolean result;
        
        if(bloodPressureMin > 90 && bloodPressureMax < 130){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Seniors(double bloodPressureMin, double bloodPressureMax) {
        boolean result;
        
        if (bloodPressureMin > 90 && bloodPressureMax < 140) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }   
}
