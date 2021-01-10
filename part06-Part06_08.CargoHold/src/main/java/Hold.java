import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> holdList;
    private int maxWeight;
    public Hold(int maxWeight) {
        holdList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public int weightofS () {
        int weight = 0;
        for (Suitcase i : holdList) {
            weight = weight + i.totalWeight();
        }
        return weight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if ((weightofS() + suitcase.totalWeight()) <= maxWeight) {
            holdList.add(suitcase);
        }
    }
    public void printItems() {
        for (Suitcase i : holdList) {
            i.printItems();
        }
    }
    public String toString() {
        return holdList.size() + " suitcases (" + weightofS()+ " kg)";
    }

}
