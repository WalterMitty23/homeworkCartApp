package com.homework.springCartApp.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.*;

@Component
@SessionScope
public class Cart {
    private final Set<Integer> items = new HashSet<>();

    public void add(Integer... ids) {
        items.addAll(Arrays.asList(ids));
    }

    public Set<Integer> getAll() {
        return Collections.unmodifiableSet(items);
    }
}