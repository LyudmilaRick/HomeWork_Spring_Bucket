package pro.sky.java.course211.homework_spring_bucket.ServiceImpl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course211.homework_spring_bucket.Repository.Bucket;
import pro.sky.java.course211.homework_spring_bucket.Service.BucketService;

import java.util.List;

@Service
public class BucketServiceImpl implements BucketService {
    public final Bucket bucket;

    public BucketServiceImpl() {
        bucket = new Bucket();
        System.out.println("Есть такая корзина");
    }

    @Override
    public List<Integer> addItem(List<Integer> item) {
        return bucket.add(item);
    }

    @Override
    public String getItems() {
        return bucket.getItem();
    }
}
