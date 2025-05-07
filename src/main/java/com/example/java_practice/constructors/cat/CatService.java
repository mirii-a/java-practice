package com.example.java_practice.constructors.cat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public void addNewCat(Cat cat) {
        Cat newCat = new Cat(cat.getName(), cat.getAge());
        catRepository.addCatToRepository(newCat);
    }

    public List<Cat> getAllCats() {
        return catRepository.getAllCats();
    }

    public List<Cat> getCatsByName(String name) {
        return catRepository.getCatsByName(name);
    }
}
