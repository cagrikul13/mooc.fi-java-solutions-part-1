
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
public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for (String value : this.list) {
            values.add(value);
        }
        return values;
    }

    public String take() {
        String takenValue = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return takenValue;
    }
}
