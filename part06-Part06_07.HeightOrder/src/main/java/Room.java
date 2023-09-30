
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return (this.persons.isEmpty());
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        Person shortestPerson= this.persons.get(0);
        for(Person person: this.persons){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson= person;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        Person takenPerson = this.shortest();
        this.persons.remove(takenPerson);
        return takenPerson;
    }
    
}
