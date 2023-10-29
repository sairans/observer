package com.obs;

public class JobSearch {
    public static void main(String[] args) {
        JavaCompany jobsite = new JavaCompany();

        jobsite.addvacancy("Junior");
        jobsite.addvacancy("Senior");

        Observer firstSubscriber = new Subscriber("John Doe");
        Observer secondSubscriber = new Subscriber("Michael Kiton");

        jobsite.addObserver(firstSubscriber);
        jobsite.addObserver(secondSubscriber);

        jobsite.addvacancy("Middle");
    }
}
