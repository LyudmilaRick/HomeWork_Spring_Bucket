package pro.sky.java.course211.homeworkSpringBucket.serviceImpl;

import org.springframework.stereotype.Service;
import pro.sky.java.course211.homeworkSpringBucket.repository.Bucket;
import pro.sky.java.course211.homeworkSpringBucket.service.BucketService;

import java.util.List;
// 18.01.2022
@Service
public class BucketServiceImpl implements BucketService {
     public final Bucket bucket;

    public BucketServiceImpl(Bucket bucket) {
        this.bucket = bucket;
    }
    @Override
    public List<Integer> addItem(List<Integer> item) {
        return bucket.add(item);
    }

    @Override
    public List<Integer>  getItems() {
        return bucket.getItems();
    }
}
