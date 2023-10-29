package com.obs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class JavaCompany implements Observed{
    List<String> vacancies = new ArrayList<>();
    List<String> subscribers = new ArrayList<>();

    public void addvacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.HandleEvent(this.vacancies);
        }
    }
}
