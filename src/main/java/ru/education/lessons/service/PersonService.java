package ru.education.lessons.service;

import ru.education.lessons.domain.Person;

public interface PersonService {
    Person getByName (String name);
}
