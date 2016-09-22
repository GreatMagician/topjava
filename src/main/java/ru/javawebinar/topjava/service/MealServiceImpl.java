package ru.javawebinar.topjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Collection;

/**
 * GKislin
 * 06.03.2015.
 */
public class MealServiceImpl implements MealService {

    @Autowired
    private MealRepository repository;

    @Override
    public Meal save(Meal meal) {
        return repository.save(meal);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        repository.delete(id);
    }

    @Override
    public Meal getMeal(int id) throws NotFoundException {
        return repository.getMeal(id);
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }

    @Override
    public void setUser(User user) {
        repository.setUser(user);
    }

    @Override
    public Collection<Meal> getAll() {
        return repository.getAll();
    }
}
