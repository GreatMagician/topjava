package ru.javawebinar.topjava.service;

import org.springframework.stereotype.Service;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Collection;

/**
 * GKislin
 * 15.06.2015.
 */
@Service
public interface MealService {
    Meal save(Meal meal);

    void delete(int id) throws NotFoundException;

    Meal getMeal(int id) throws NotFoundException;

    User getUser();

    void setUser(User user);

    Collection<Meal> getAll();
}
