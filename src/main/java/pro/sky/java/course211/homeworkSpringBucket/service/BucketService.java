package pro.sky.java.course211.homeworkSpringBucket.service;

import pro.sky.java.course211.homeworkSpringBucket.repository.Bucket;

import java.util.List;

public interface BucketService {
    // add collection
    List<Integer> addItem(List<Integer> item);
    // get all
    List<Integer>  getItems();
}

