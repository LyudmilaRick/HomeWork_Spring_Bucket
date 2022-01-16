package pro.sky.java.course211.homework_spring_bucket.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

import pro.sky.java.course211.homework_spring_bucket.Service.BucketService;
import pro.sky.java.course211.homework_spring_bucket.ServiceImpl.BucketServiceImpl;

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
    public String addItemToBucket(@RequestParam(value = "id") List<Integer> item) {
        return getResult("#5511AA", bucketService.addItem(item), " успешно добавлен");
    }

    @GetMapping("/get")
    public String getBucket() {
        return bucketService.getItems();
    }

    private String getResult(String color, List<Integer> item, String action) {
        return String.format("<B  style=\"color:%s\"> %s %s  %s  </b>", color, "Товар ", item.toString(), action);
    }
}

