package com.homework.springCartApp.controller;

import java.util.Collection;

import com.homework.springCartApp.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer[] ids) {
        service.add(ids);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return service.getAll();
    }
}
