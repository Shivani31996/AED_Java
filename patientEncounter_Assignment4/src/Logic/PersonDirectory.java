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
public class PersonDirectory {
    
    private ArrayList<PersonParentClass> persons;
    
    public PersonDirectory() {
        this.persons = new ArrayList<PersonParentClass>();
    }

    public ArrayList<PersonParentClass> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<PersonParentClass> persons) {
        this.persons = persons;
    }
    
    public void deletePerson(PersonParentClass person) {
        this.persons.remove(person);
    }
    
    public PersonParentClass addNewPerson() {
        PersonParentClass person = new PersonParentClass();
        persons.add(person);
        return person;
    }    
    
}
