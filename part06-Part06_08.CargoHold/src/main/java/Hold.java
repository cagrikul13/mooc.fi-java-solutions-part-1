
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int total = 0;
        for (Suitcase scase : list) {
            total += scase.totalWeight();
        }
        if (suitcase.totalWeight() + total <= this.maxWeight) {
            list.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int total = 0;
        for (Suitcase suitcase : list) {
            total += suitcase.totalWeight();
        }
        return this.list.size() + " suitcases (" + total + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : list) {
            suitcase.printItems();
        }
    }
}
