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
public class PatientEncounter {
    
    private Date encounterTimeStamp;
    private int encounterCount;
    private int count = 0;
    
    private PatientEncounter() {
        count++;
        encounterCount = count;
    }    
    
}
