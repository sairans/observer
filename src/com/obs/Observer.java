package com.obs;
import java.util.List;
public interface Observer {
    public void HandleEvent(List<String> vacancies);
}