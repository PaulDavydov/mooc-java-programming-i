import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public int totalWeight () {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
    }
    public void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item i : items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
