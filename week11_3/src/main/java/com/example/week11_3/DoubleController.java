package com.example.week11_3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleController {
    @GetMapping("/double")
    public int doubleNumber(@RequestParam int number) {
        return number*2;
    }
    }

