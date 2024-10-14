package com.example.exampledemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PersonEntityController {

    @GetMapping("/api/add_person")
    public PersonEntity add_person(){
        return null;
    }

    @GetMapping("/api/view_person")
    public PersonEntity view_person(){
        return null;
    }


}
