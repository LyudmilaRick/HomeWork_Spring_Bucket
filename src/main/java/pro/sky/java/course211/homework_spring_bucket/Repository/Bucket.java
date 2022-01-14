package pro.sky.java.course211.homework_spring_bucket.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Repository
public class Bucket {
    private final HashMap<Integer, Integer> itemsStore = new HashMap<>();

    public void add(ArrayList<Integer> idLists) {
        for (Integer id : idLists) {
            if (itemsStore.containsKey(id)) {
                itemsStore.put(id, itemsStore.get(id) + 1);
            } else {
                itemsStore.put(id, 1);
            }
        }
    }

    public Set<Integer> getItem() {
        return itemsStore.keySet();
    }

}
