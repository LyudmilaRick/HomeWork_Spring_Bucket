package pro.sky.java.course211.homework_spring_bucket.Service;

import pro.sky.java.course211.homework_spring_bucket.Repository.Bucket;

import java.util.List;
import java.util.Set;

public interface BucketService {
    // List<Integer> чтобы печатать в контроллере добавленные покупки
    List<Integer> addItem(List<Integer> item);

    String getItems();

}

