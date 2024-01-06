import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.maxWeight >= this.totalWeight + suitcase.totalWeight()){
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
