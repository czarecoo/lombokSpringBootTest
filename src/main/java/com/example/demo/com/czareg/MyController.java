package com.example.demo.com.czareg;

import com.example.demo.com.czareg.model.MoreSpecific;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public MoreSpecific get() {
        return new MoreSpecific("model", "123", "333333333333", "3");
    }
}