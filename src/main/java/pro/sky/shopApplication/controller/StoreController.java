package pro.sky.shopApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shopApplication.service.StoreService;

import java.util.List;
//for commit

@RestController
@RequestMapping("order")
public class StoreController {
    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }


    @GetMapping
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> values) {
        service.addAll(values);

    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.getAll();
    }

}
