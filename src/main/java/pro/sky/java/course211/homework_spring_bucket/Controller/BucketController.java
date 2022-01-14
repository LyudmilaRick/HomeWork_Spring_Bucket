package pro.sky.java.course211.homework_spring_bucket.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Set;

import pro.sky.java.course211.homework_spring_bucket.Service.BucketService;
import pro.sky.java.course211.homework_spring_bucket.ServiceImpl.BucketServiceImpl;

/**
 * контроллер
 */
@RestController
@RequestMapping("order/")
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketServiceImpl bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
    public void addItemToBucket(@RequestParam(value = "id") ArrayList<Integer> idlists) {
        bucketService.addItem(idlists);
    }

    @GetMapping("/get")
    public Set<Integer> getBucket() {
        return bucketService.getItems();
    }
}

