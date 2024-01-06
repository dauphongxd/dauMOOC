
public class HealthStation {
    private int counter;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        if(person.getWeight() > 0){
            counter++;
            return person.getWeight();
        }
        return -1;
    }

    public void feed(Person person){
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }

    public int weighings(){
        return counter;
    }

}
