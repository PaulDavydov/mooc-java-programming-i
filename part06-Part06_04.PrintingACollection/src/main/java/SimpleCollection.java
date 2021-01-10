
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String pOutput = "";
        String eleN= "";
        if (this.elements.size() == 0) {
            pOutput = "The collection " + this.name + " is empty.";
            return pOutput;
        }
        if (this.elements.size() == 1) {
            pOutput = "The collection " + this.name +  " has " + this.elements.size() + " element:";
            eleN = elements.get(0);
            return pOutput + "\n" + eleN;
        }
        pOutput = "The collection " + this.name + " has " + this.elements.size() + " elements:";

        for (String i : elements) {
            eleN = eleN + i + "\n";
        }
        return pOutput + "\n" + eleN;
    }
    
}
