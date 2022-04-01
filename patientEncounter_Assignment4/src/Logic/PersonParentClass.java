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
public class PersonParentClass {
    
    String personName;
    int personAge;
    String personCity;
    String personCommunity;
    String personHouse;
    int personMedRecNo;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    public String getPersonCommunity() {
        return personCommunity;
    }

    public void setPersonCommunity(String personCommunity) {
        this.personCommunity = personCommunity;
    }

    public String getPersonHouse() {
        return personHouse;
    }

    public void setPersonHouse(String personHouse) {
        this.personHouse = personHouse;
    }

    public int getPersonMedRecNo() {
        return personMedRecNo;
    }

    public void setPersonMedRecNo(int personMedRecNo) {
        this.personMedRecNo = personMedRecNo;
    }
        
    @Override
    public String toString() {
        return this.personName;
    }    
}
