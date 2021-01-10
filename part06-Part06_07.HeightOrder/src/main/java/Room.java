import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }
    public void add(Person person) {
        persons.add(person);
    }
    public boolean isEmpty() {
        if(persons.isEmpty()) {
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person returnS = persons.get(0);
        for (Person i : persons) {
            if (returnS.getHeight() > i.getHeight()) {
                returnS = i;
            }
        }
        return returnS;
    }
    public Person take() {
        if(persons.size() == 0) {
            return null;
        }
        Person shortestP = shortest();
        persons.remove(shortestP);
        return shortestP;
    }

}
