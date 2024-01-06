import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        if(this.maximumWeight >= this.totalWeight() + item.getWeight()){
            this.items.add(item);
        }
    }

    public int totalWeight(){
        int sumOfWeight = 0;
        for(Item item : items){
            sumOfWeight += item.getWeight();
        }
        return sumOfWeight;
    }

    public String toString(){
        if(this.items.size() > 1){
            return this.items.size() + " items " + "(" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1){
            return this.items.size() + " item " + "(" + this.totalWeight() + " kg)";
        } else {
            return "no items (0 kg)";
        }
    }

    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item returnItem = this.items.get(0);
        for(Item item : items){
            if(returnItem.getWeight() < item.getWeight()){
                returnItem = item;
            }
        }
        return returnItem;
    }


}
