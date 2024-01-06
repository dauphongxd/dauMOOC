import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person person){
        this.people.add(person);
    }

    public boolean isEmpty(){
        if(this.people.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return this.people;
    }

    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }

        Person returnPerson = this.people.get(0);

        for(Person person : people){
            if(returnPerson.getHeight() > person.getHeight()){
                returnPerson = person;
            }
        }

        return returnPerson;


    }

    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }

        Person returnPerson = this.people.get(0);

        for(Person person : people){
            if(returnPerson.getHeight() > person.getHeight()){
                returnPerson = person;
            }
        }
        this.people.remove(returnPerson);

        return returnPerson;
    }
}
