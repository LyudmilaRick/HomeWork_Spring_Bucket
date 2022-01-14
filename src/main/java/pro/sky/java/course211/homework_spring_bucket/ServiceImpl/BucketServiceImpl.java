package pro.sky.java.course211.homework_spring_bucket.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course211.homework_spring_bucket.Repository.Bucket;
import pro.sky.java.course211.homework_spring_bucket.Service.BucketService;

import java.util.ArrayList;
import java.util.Set;

@Service
@SessionScope
public class BucketServiceImpl implements BucketService {
    public final Bucket bucket = new Bucket();


    @Override
    public void addItem(ArrayList<Integer> idList) {
        bucket.add(idList);
    }

    @Override
    public Set<Integer> getItems() {
        return bucket.getItem();
    }
}
