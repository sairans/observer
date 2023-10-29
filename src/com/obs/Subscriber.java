package com.obs;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void HandleEvent(List<String> vacancies) {
        System.out.println("Dear" + name + "\nWe have some changes in vacancies:\n" + vacancies);
    }
}
