package pro.sky.java.course211.homework_spring_bucket.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Bucket {
    // замена - HashMap на ArrayList, чтобы не потерят все покупки
    private final ArrayList<Integer> itemsStore;

    public Bucket() {
        itemsStore = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> item) {
        itemsStore.addAll(item);
        return item;
    }

    public String getItem() {
        return itemsStore.toString();
    }
}