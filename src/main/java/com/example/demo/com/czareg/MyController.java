package com.example.demo.com.czareg;

import com.example.demo.com.czareg.model.Base;
import com.example.demo.com.czareg.model.Specific;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public Specific get() {
        Base base = new Base("model","serial", "description");
        return new Specific(base, "uuid", "moreDescription");
    }
}