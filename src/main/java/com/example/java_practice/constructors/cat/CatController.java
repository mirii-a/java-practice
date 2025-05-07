package com.example.java_practice.constructors.cat;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/cats")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/all")
    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    @GetMapping("/name/{catName}")
    public List<Cat> getCatByName(@PathVariable String catName) {
        return catService.getCatsByName(catName);
    }

    @PostMapping("/add")
    public void addCat(@RequestBody Cat cat) {
        catService.addNewCat(cat);
    }
}
