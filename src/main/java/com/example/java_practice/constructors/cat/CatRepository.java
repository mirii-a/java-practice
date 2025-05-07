package com.example.java_practice.constructors.cat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CatRepository {

    private final List<Cat> catCache;

    public CatRepository() {
        catCache = new ArrayList<>();
    }

    public void addCatToRepository(Cat cat) {
        boolean catExists = catCache.stream()
                .anyMatch(kitty ->
                        kitty.getAge().equals(cat.getAge())
                                && kitty.getName().endsWith(cat.getName()));
        if (!catExists) {
            catCache.add(cat);
        }
    }

    public List<Cat> getAllCats() {
        return catCache;
    }

    public List<Cat> getCatsByName(String name) {
        List<Cat> cats = catCache.stream().filter(cat -> cat.getName().contains(name)).collect(Collectors.toList());
        if (cats.isEmpty()) {
            return List.of();
        }
        return cats;
    }

}
