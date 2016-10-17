package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;

import java.util.List;

/**
 * gkislin
 * 02.10.2016
 */
public interface CrudMealRepository extends JpaRepository<Meal, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Meal u WHERE u.id=:id")
    int delete(@Param("id") int id);

    @Override
    @Transactional
    Meal save(Meal user);

    @Override
    Meal findOne(Integer id);

    @Override
    @Query("SELECT u FROM Meal u LEFT JOIN FETCH u.roles ORDER BY u.name, u.email")
    List<Meal> findAll();

    Meal getByEmail(String email);

}
