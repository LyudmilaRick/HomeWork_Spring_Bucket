package pro.sky.java.course211.homeworkSpringBucket.service;

// 18.01.2022
import java.util.List;

public interface BucketService {
    // add collection
    List<Integer> addItem(List<Integer> item);
    // get all
    List<Integer>  getItems();
}

