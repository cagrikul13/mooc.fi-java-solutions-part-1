
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cagri
 */
public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        Person shortest = new Person("", 0);
        int smallest = Integer.MAX_VALUE;

        for (Person person : list) {
            if (person.getHeight() < smallest) {
                smallest = person.getHeight();
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person taken = shortest();
        this.list.remove(shortest());

        return taken;
    }
}
