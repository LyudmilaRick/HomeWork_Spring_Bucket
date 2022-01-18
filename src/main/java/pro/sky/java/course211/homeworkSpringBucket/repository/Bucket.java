package pro.sky.java.course211.homeworkSpringBucket.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private final List<Integer> itemsStore;

    public Bucket() {
        itemsStore = new ArrayList<>();
    }

    public List<Integer> add(List<Integer> item) {
        itemsStore.addAll(item);
        return item;
    }

    public List<Integer> getItems(){
        return itemsStore;
    }
}