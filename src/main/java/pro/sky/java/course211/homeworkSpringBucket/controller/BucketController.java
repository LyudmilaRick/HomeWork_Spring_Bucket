package pro.sky.java.course211.homeworkSpringBucket.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import pro.sky.java.course211.homeworkSpringBucket.repository.Bucket;
import pro.sky.java.course211.homeworkSpringBucket.service.BucketService;
import pro.sky.java.course211.homeworkSpringBucket.serviceImpl.BucketServiceImpl;
// 18.01.2022
/**
 * контроллер
 */
@RestController
@RequestMapping("/order")
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketServiceImpl bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping("/add")
      public List<Integer> addItemToBucket(@RequestParam(value = "id") List<Integer> item) {
          return bucketService.addItem(item);
    }

    @GetMapping("/get")
    public List<Integer> getBucket() {
        return bucketService.getItems();
    }

}

