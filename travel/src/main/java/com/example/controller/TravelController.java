package com.example.controller;

import com.example.model.Travel;
import com.example.repo.TravelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelController {

    @Autowired
    private TravelRepo travelRepo;

    @PostMapping("/travel")
    public Travel addNewTravel(@RequestBody Travel travel) {

        return travelRepo.save(travel);
    }

    @GetMapping("/travel")
    public List<Travel> all() {
        return travelRepo.findAll();
    }

}
