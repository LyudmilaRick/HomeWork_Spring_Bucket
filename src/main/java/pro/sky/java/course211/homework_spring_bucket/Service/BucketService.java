package pro.sky.java.course211.homework_spring_bucket.Service;

import pro.sky.java.course211.homework_spring_bucket.Repository.Bucket;

import java.util.ArrayList;
import java.util.Set;

public interface BucketService {

    void addItem(ArrayList<Integer> idList);

    Set<Integer> getItems();

}

