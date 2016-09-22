package ru.javawebinar.topjava.repository;

import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;

import java.util.Collection;

/**
 * GKislin
 * 06.03.2015.
 */
@Repository
public interface MealRepository {
    Meal save(Meal meal);

    void delete(int id);

    Meal getMeal(int id);

    User getUser();

    void setUser(User user);

    Collection<Meal> getAll();
}
