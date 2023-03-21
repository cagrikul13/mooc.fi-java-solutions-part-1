
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cagri
 */
public class BirdMap {

    private HashMap<String, Bird> birds;

    public BirdMap() {
        birds = new HashMap<>();
    }

    public void add(Bird bird) {
        birds.put(bird.getName(), bird);
    }

    public void list() {
        for (Bird b : birds.values()) {
            System.out.println(b);
        }
    }

    public void listOne(String name) {
        System.out.println(birds.get(name));
    }

    public boolean hasKey(String key) {
        return birds.containsKey(key);
    }

    public void addObservation(String key) {
        Bird bird = birds.get(key);
        bird.addObservation();
        birds.put(key, bird);
    }
}
