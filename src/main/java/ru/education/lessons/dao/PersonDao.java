package ru.education.lessons.dao;

import ru.education.lessons.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}
