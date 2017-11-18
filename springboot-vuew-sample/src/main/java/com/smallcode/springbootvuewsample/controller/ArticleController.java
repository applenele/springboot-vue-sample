package com.smallcode.springbootvuewsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ArticleController {

    @GetMapping("/article/get/{id}")
    public Map get(@PathVariable int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", "test");
        map.put("desc", "test desc");
        return map;
    }
}
